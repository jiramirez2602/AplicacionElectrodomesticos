package controller;

import firebase.LavadoraProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import model.Lavadora;

public class ListaDeLavadoras {

    private ArrayList<Lavadora> listaDeLavadoras;
    private Validador validador;

    public ListaDeLavadoras() {
        listaDeLavadoras = new ArrayList<>();
        validador = new Validador();
    }
    
    public int obtenerCantidadDeLavadoras() {
        return listaDeLavadoras.size();
    }

    public ArrayList<Lavadora> getListaDeLavadoras() {
        listaDeLavadoras = LavadoraProvider.cargarInfoLavadora();
        return listaDeLavadoras;
    }

    public ArrayList<Lavadora> getListaLocal() {
        return listaDeLavadoras;
    }

    //Consumo interno, no llamar
    public boolean guardarEnFirebase(Lavadora lavadora) {
        try {
            Map<String, Object> datos = new HashMap<>();
            datos.put("carga", String.valueOf(lavadora.getCarga()));
            datos.put("precioBase", String.valueOf(lavadora.getPrecioBase()));
            datos.put("color", String.valueOf(lavadora.getColor()));
            datos.put("consumoEnergetico", String.valueOf(lavadora.getConsumoEnergetico()));
            datos.put("peso", String.valueOf(lavadora.getPeso()));
            LavadoraProvider.guardarLavadora("Lavadoras", String.valueOf(lavadora.getId()), datos);
            JOptionPane.showMessageDialog(null, "Guardado con exito");
            return true;
        } catch (Exception e) {
            System.out.println("Error al guardar en controller: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarEnFirebase(Lavadora lavadora, String id) {
        try {
            Map<String, Object> datos = new HashMap<>();
            datos.put("carga", String.valueOf(lavadora.getCarga()));
            datos.put("precioBase", String.valueOf(lavadora.getPrecioBase()));
            datos.put("color", String.valueOf(lavadora.getColor()));
            datos.put("consumoEnergetico", String.valueOf(lavadora.getConsumoEnergetico()));
            datos.put("peso", String.valueOf(lavadora.getPeso()));
            LavadoraProvider.actualizarLavadora("Lavadoras", id, datos);
            JOptionPane.showMessageDialog(null, "Actualizado con exito");
            return true;
        } catch (Exception e) {
            System.out.println("Error al actualizar en controller: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarEnFirebase(String id) {
        try {
            LavadoraProvider.eliminarLavadora("Lavadoras", id);
            JOptionPane.showMessageDialog(null, "Eliminado con exito");
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar: " + e.getMessage());
            return false;
        }
    }

    //Constructor por defecto
    public boolean crearLavadora() {
        Lavadora lavadora = new Lavadora();
        return guardarEnFirebase(lavadora);
    }

    //Constructor con el precio y peso. El resto por defecto.
    public boolean crearLavadora(String precioBase, String peso) {
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

            Lavadora lavadora = new Lavadora(precioBaseAux, pesoAux);
            return guardarEnFirebase(lavadora);
        }
    }

    //Constructor con la carga y el resto de atributos heredados. 
    public boolean crearLavadora(String precioBase, String color, String consumoEnergetico, String peso, String carga) {
        //TODO: Cambiar mensajes y validacion
        if (!validador.validarConRegex(precioBase, "^([1-9][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|10000)$", "Precio Base", "Precio Base es invalido(a) \ndebe ser un numero de 1-10000. Ejemplo: 970")
                || !validador.validarConRegex(peso, "^([1-2][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|3000)$", "Peso", "Peso es invalido(a), \ndebe ser un numero de 1-3000kg. Ejemplo: 20")
                //|| !validador.validarConRegex(color, "^(Blanco|Negro|Azul|Rojo|Gris)$", "Color", "Color es invalido(a), \ndebe ser BLANCO, NEGRO, AZUL, ROJO o GRIS")
                || !validador.validarConRegex(consumoEnergetico, "^(A|B|C|D|E|F)$", "Consumo Energetico", "Consumo Energetico es invalido(a), debe ser A, B, C, D, E o F")
                || !validador.validarConRegex(carga, "^([1-9][0-9]|[1-9]|100)$", "Carga", "Carga es invalido(a), debe ser un numero de 1-100kg. Ejemplo: 20")) {
            return false;
        } else {
            int precioBaseAux;
            int pesoAux;
            char consumoEnergeticoAux;
            int cargaAux;

            try {
                consumoEnergeticoAux = consumoEnergetico.charAt(0);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Consumo Energetico invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                cargaAux = Integer.parseInt(carga);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Carga Base invalido", "Error", JOptionPane.ERROR_MESSAGE);
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

            Lavadora lavadora = new Lavadora(precioBaseAux, color, consumoEnergeticoAux, pesoAux, cargaAux);
            return guardarEnFirebase(lavadora);
        }

    }

    //Constructor con la carga y el resto de atributos heredados. 
    public boolean crearLavadoraLocal(String id, String precioBase, String color, String consumoEnergetico, String peso, String carga) {
        //TODO: Cambiar mensajes y validacion
        if (!validador.validarConRegex(precioBase, "^([1-9][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|10000)$", "Precio Base", "Precio Base es invalido(a) \ndebe ser un numero de 1-10000. Ejemplo: 970")
                || !validador.validarConRegex(peso, "^([1-2][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|3000)$", "Peso", "Peso es invalido(a), \ndebe ser un numero de 1-3000kg. Ejemplo: 20")
                /*|| !validador.validarConRegex(color, "^(Blanco|Negro|Azul|Rojo|Gris)$", "Color", "Color es invalido(a), \ndebe ser BLANCO, NEGRO, AZUL, ROJO o GRIS")*/
                || !validador.validarConRegex(consumoEnergetico, "^(A|B|C|D|E|F)$", "Consumo Energetico", "Consumo Energetico es invalido(a), debe ser A, B, C, D, E o F")
                || !validador.validarConRegex(carga, "^([1-9][0-9]|[1-9]|100)$", "Carga", "Carga es invalido(a), debe ser un numero de 1-100kg. Ejemplo: 20")) {
            return false;
        } else {
            int precioBaseAux;
            int pesoAux;
            char consumoEnergeticoAux;
            int cargaAux;

            try {
                consumoEnergeticoAux = consumoEnergetico.charAt(0);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Consumo Energetico invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                cargaAux = Integer.parseInt(carga);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Carga Base invalido", "Error", JOptionPane.ERROR_MESSAGE);
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

            Lavadora lavadora = new Lavadora(precioBaseAux, color, consumoEnergeticoAux, pesoAux, cargaAux);
            lavadora.setId(id);
            listaDeLavadoras.add(lavadora);
            return true;
        }

    }

    //Listar un equipo con un ID
    public Lavadora listarLavadora(String id) {
        for (Lavadora i : getListaDeLavadoras()) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        return null;
    }

    //Modifica Equipos
    public boolean modificarLavadora(String id, String precioBase, String color, String consumoEnergetico, String peso, String carga) {
        if (!validador.validarConRegex(precioBase, "^([1-9][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|10000)$", "Precio Base", "Precio Base es invalido(a) \ndebe ser un numero de 1-10000. Ejemplo: 970")
                || !validador.validarConRegex(peso, "^([1-2][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|3000)$", "Peso", "Peso es invalido(a), \ndebe ser un numero de 1-3000kg. Ejemplo: 20")
                /*|| !validador.validarConRegex(color, "^(Blanco|Negro|Azul|Rojo|Gris)$", "Color", "Color es invalido(a), \ndebe ser BLANCO, NEGRO, AZUL, ROJO o GRIS")*/
                || !validador.validarConRegex(consumoEnergetico, "^(A|B|C|D|E|F)$", "Consumo Energetico", "Consumo Energetico es invalido(a), debe ser A, B, C, D, E o F")
                || !validador.validarConRegex(carga, "^([1-9][0-9]|[1-9]|100)$", "Carga", "Carga es invalido(a), debe ser un numero de 1-100kg. Ejemplo: 20")) {
            return false;
        } else {
            int precioBaseAux;
            int pesoAux;
            char consumoEnergeticoAux;
            int cargaAux;

            try {
                consumoEnergeticoAux = consumoEnergetico.charAt(0);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Consumo Energetico invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                cargaAux = Integer.parseInt(carga);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Carga Base invalido", "Error", JOptionPane.ERROR_MESSAGE);
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

            Lavadora lavadoraModificada = new Lavadora(precioBaseAux, color, consumoEnergeticoAux, pesoAux, cargaAux);
            lavadoraModificada.setId(id);

            //Actualizar firebase
            return actualizarEnFirebase(lavadoraModificada, id);
        }
    }

    public boolean eliminarLavadora(String id) {
        //Eliminar en firebase
        return eliminarEnFirebase(id);
    }

    public String verificarTiempoLavadoController(String nivelDelAgua, String tipoDeLavado) {
        int tiempoDeLavado = 0;

        if ("Normal".equals(nivelDelAgua)) {
            if (null != tipoDeLavado) {
                if (tipoDeLavado.equals("Bajo")) {
                    tiempoDeLavado = 30;
                } else if (tipoDeLavado.equals("Medio")) {
                    tiempoDeLavado = 45;
                } else if (tipoDeLavado.equals("Alto")) {
                    tiempoDeLavado = 60;
                }
            }
        }

        if ("Rapido".equals(nivelDelAgua)) {
            tiempoDeLavado = 15;
        }

        if ("Pesado".equals(nivelDelAgua)) {
            if ("Bajo".equals(tipoDeLavado)) {
                tiempoDeLavado = 70;
            } else if ("Medio".equals(tipoDeLavado) || "Alto".equals(tipoDeLavado)) {
                tiempoDeLavado = 90;
            }
        }

        return "El tiempo de lavado es: " + tiempoDeLavado;
    }
}
