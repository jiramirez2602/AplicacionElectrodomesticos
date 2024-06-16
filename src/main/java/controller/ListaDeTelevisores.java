package controller;

import firebase.TelevisorProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import model.Televisor;

public class ListaDeTelevisores {
    
    private ArrayList<Televisor> listaDeTelevisores = new ArrayList<>();
    private Validador validador = new Validador();
    
    public int obtenerCantidadDeTelevisores() {
        return listaDeTelevisores.size();
    }
    
    public ArrayList<Televisor> getListaDeTelevisores() {
        listaDeTelevisores = TelevisorProvider.cargarInfoTelevisor();
        return listaDeTelevisores;
    }
    
    //Metodo para consumo interno, NO USAR
    public ArrayList<Televisor> getListaLocal() {    
        return listaDeTelevisores;
    }

    public boolean guardarEnFirebase(Televisor televisor) {
        try {
            Map<String, Object> datos = new HashMap<>();
            datos.put("pulgadas", String.valueOf(televisor.getPulgadas()));
            datos.put("TDT", String.valueOf(televisor.isTDT()));
            datos.put("precioBase", String.valueOf(televisor.getPrecioBase()));
            datos.put("color", String.valueOf(televisor.getColor()));
            datos.put("consumoEnergetico", String.valueOf(televisor.getConsumoEnergetico()));
            datos.put("peso", String.valueOf(televisor.getPeso()));
            TelevisorProvider.guardarTelevisor("Televisores", String.valueOf(televisor.getId()), datos);
            JOptionPane.showMessageDialog(null, "Guardado con exito");
            return true;
        } catch (Exception e) {
            System.out.println("Error al guardar controller: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarEnFirebase(Televisor televisor, String id) {
        try {
            Map<String, Object> datos = new HashMap<>();
            datos.put("pulgadas", String.valueOf(televisor.getPulgadas()));
            datos.put("TDT", String.valueOf(televisor.isTDT()));
            datos.put("precioBase", String.valueOf(televisor.getPrecioBase()));
            datos.put("color", String.valueOf(televisor.getColor()));
            datos.put("consumoEnergetico", String.valueOf(televisor.getConsumoEnergetico()));
            datos.put("peso", String.valueOf(televisor.getPeso()));
            TelevisorProvider.actualizarTelevisor("Televisores", id, datos);
            JOptionPane.showMessageDialog(null, "Actualizado con exito");
            return true;
        } catch (Exception e) {
            System.out.println("Error al actualizar controller: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarEnFirebase(String id) {
        try {
            TelevisorProvider.eliminarTelevisor("Televisores", id);
            JOptionPane.showMessageDialog(null, "Eliminado con exito");
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar: " + e.getMessage());
            return false;
        }
    }

    //Constructor por defecto
    public boolean crearTelevisor() {
        Televisor televisor = new Televisor();
        return guardarEnFirebase(televisor);
    }

    //Constructor con el precio y peso. El resto por defecto.
    public boolean crearTelevisor(String precioBase, String peso) {
        if (!validador.validarConRegex(precioBase, "^([1-9][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|10000)$", "Precio Base", "Precio Base es invalido(a) \ndebe ser un numero de 1-10000. Ejemplo: 970")
                || !validador.validarConRegex(peso, "^([1-2][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|3000)$", "Peso", "Peso es invalido(a), debe ser un numero de 1-3000kg. Ejemplo: 20")) {
            return false;
        } else {
            int precioBaseAux;
            int pesoAux;

            try {
                precioBaseAux = Integer.parseInt(precioBase);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Precio Base invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                pesoAux = Integer.parseInt(peso);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Peso invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            Televisor televisor = new Televisor(precioBaseAux, pesoAux);
            //Guardar en Firebase
            return guardarEnFirebase(televisor);
        }
    }

    //Constructor con la carga y el resto de atributos heredados. 
    @SuppressWarnings("ConvertToStringSwitch")
    public boolean crearTelevisor(String precioBase, String color, String consumoEnergetico, String peso, String pulgadas, String TDT) {
        if (!validador.validarConRegex(precioBase, "^([1-9][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|10000)$", "Precio Base", "Precio Base es invalido(a) \ndebe ser un numero de 1-10000. Ejemplo: 970")
                || !validador.validarConRegex(peso, "^([1-2][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|3000)$", "Peso", "Peso es invalido(a), \ndebe ser un numero de 1-3000kg. Ejemplo: 20")
                //                || !validador.validarConRegex(color, "^(Blanco|Negro|Azul|Rojo|Gris)$", "Color", "Color es invalido(a), \ndebe ser BLANCO, NEGRO, AZUL, ROJO o GRIS")
                || !validador.validarConRegex(consumoEnergetico, "^(A|B|C|D|E|F)$", "Consumo Energetico", "Consumo Energetico es invalido(a), \ndebe ser A, B, C, D, E o F")
                || !validador.validarConRegex(pulgadas, "^([1-9][0-9]|[1-9]|100)$", "Pulgadas", "Carga es invalido(a), \ndebe ser un numero de 1-100 pulgadas. Ejemplo: 32")
                || !validador.validarConRegex(TDT, "^(Si|No)$", "TDT", "Tipo TDT es invalido(a), \ndebe ser Si o No")) {
            return false;
        } else {
            int precioBaseAux;
            int pesoAux;
            char consumoEnergeticoAux;
            int pulgadasAux;
            boolean TDTAux;

            if ("Si".equals(TDT)) {
                TDTAux = true;
            } else if ("No".equals(TDT)) {
                TDTAux = false;
            } else {
                JOptionPane.showMessageDialog(null, "TDT invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                consumoEnergeticoAux = consumoEnergetico.charAt(0);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Consumo Energetico invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                pulgadasAux = Integer.parseInt(pulgadas);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Pulgadas son invalidas", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                precioBaseAux = Integer.parseInt(precioBase);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Precio Base invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                pesoAux = Integer.parseInt(peso);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Peso invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            Televisor televisor = new Televisor(precioBaseAux, color, consumoEnergeticoAux, pesoAux, pulgadasAux, TDTAux);
            //Guardar en Firebase
            return guardarEnFirebase(televisor);
        }

    }

    //Metodo para consumo interno, NO USAR
    @SuppressWarnings("ConvertToStringSwitch")
    public boolean crearTelevisorLocal(String id, String precioBase, String color, String consumoEnergetico, String peso, String pulgadas, String TDT) {
        if (!validador.validarConRegex(precioBase, "^([1-9][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|10000)$", "Precio Base", "Precio Base es invalido(a) \ndebe ser un numero de 1-10000. Ejemplo: 970")
                || !validador.validarConRegex(peso, "^([1-2][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|3000)$", "Peso", "Peso es invalido(a), \ndebe ser un numero de 1-3000kg. Ejemplo: 20")
              /*|| !validador.validarConRegex(color, "^(Blanco|Negro|Azul|Rojo|Gris)$", "Color", "Color es invalido(a), \ndebe ser BLANCO, NEGRO, AZUL, ROJO o GRIS")*/
                || !validador.validarConRegex(consumoEnergetico, "^(A|B|C|D|E|F)$", "Consumo Energetico", "Consumo Energetico es invalido(a), \ndebe ser A, B, C, D, E o F")
                || !validador.validarConRegex(pulgadas, "^([1-9][0-9]|[1-9]|100)$", "Pulgadas", "Carga es invalido(a), \ndebe ser un numero de 1-100 pulgadas. Ejemplo: 32")
                || !validador.validarConRegex(TDT, "^(Si|No)$", "TDT", "Tipo TDT es invalido(a), \ndebe ser Si o No")) {
            return false;
        } else {
            int precioBaseAux;
            int pesoAux;
            char consumoEnergeticoAux;
            int pulgadasAux;
            boolean TDTAux;

            if ("Si".equals(TDT)) {
                TDTAux = true;
            } else if ("No".equals(TDT)) {
                TDTAux = false;
            } else {
                JOptionPane.showMessageDialog(null, "TDT invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                consumoEnergeticoAux = consumoEnergetico.charAt(0);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Consumo Energetico invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                pulgadasAux = Integer.parseInt(pulgadas);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Pulgadas son invalidas", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                precioBaseAux = Integer.parseInt(precioBase);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Precio Base invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                pesoAux = Integer.parseInt(peso);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Peso invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            Televisor tele = new Televisor(precioBaseAux, color, consumoEnergeticoAux, pesoAux, pulgadasAux, TDTAux);
            tele.setId(id);
            listaDeTelevisores.add(tele);
            return true;
        }

    }

    //Listar un equipo con un ID
    public Televisor listarTelevisor(String id) {
        for (Televisor i : getListaDeTelevisores()) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        return null;
    }

    public boolean modificarTelevisor(String id, String precioBase, String color, String consumoEnergetico, String peso, String pulgadas, String TDT) {
        if (!validador.validarConRegex(precioBase, "^([1-9][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|10000)$", "Precio Base", "Precio Base es invalido(a) \ndebe ser un numero de 1-10000. Ejemplo: 970")
                || !validador.validarConRegex(peso, "^([1-2][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|3000)$", "Peso", "Peso es invalido(a), \ndebe ser un numero de 1-3000kg. Ejemplo: 20")
                //                || !validador.validarConRegex(color, "^(Blanco|Negro|Azul|Rojo|Gris)$", "Color", "Color es invalido(a), \ndebe ser BLANCO, NEGRO, AZUL, ROJO o GRIS")
                || !validador.validarConRegex(consumoEnergetico, "^(A|B|C|D|E|F)$", "Consumo Energetico", "Consumo Energetico es invalido(a), \ndebe ser A, B, C, D, E o F")
                || !validador.validarConRegex(pulgadas, "^([1-9][0-9]|[1-9]|100)$", "Pulgadas", "Carga es invalido(a), \ndebe ser un numero de 1-100 pulgadas. Ejemplo: 32")
                || !validador.validarConRegex(TDT, "^(Si|No)$", "TDT", "Tipo TDT es invalido(a), \ndebe ser Si o No")) {
            return false;
        } else {
            int precioBaseAux;
            int pesoAux;
            char consumoEnergeticoAux;
            int pulgadasAux;
            boolean TDTAux;

            if ("Si".equals(TDT)) {
                TDTAux = true;
            } else if ("No".equals(TDT)) {
                TDTAux = false;
            } else {
                JOptionPane.showMessageDialog(null, "TDT invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                consumoEnergeticoAux = consumoEnergetico.charAt(0);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Consumo Energetico invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                pulgadasAux = Integer.parseInt(pulgadas);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Pulgadas son invalidas", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                precioBaseAux = Integer.parseInt(precioBase);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Precio Base invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                pesoAux = Integer.parseInt(peso);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Peso invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            Televisor televisorModificado = new Televisor(precioBaseAux, color, consumoEnergeticoAux, pesoAux, pulgadasAux, TDTAux);
            televisorModificado.setId(id);

            //Actualizar firebase
            return actualizarEnFirebase(televisorModificado, id);
        }

    }

    public boolean eliminarTelevisor(String id) {
        //Eliminar en firebase
        return eliminarEnFirebase(id);
    }

}
