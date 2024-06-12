package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Televisor;

public class ListaDeTelevisores {

    private ArrayList<Televisor> listaDeTelevisores;
    private Validador validador;

    public ListaDeTelevisores() {
        listaDeTelevisores = new ArrayList<>();
        validador = new Validador();
    }

    public ArrayList<Televisor> getListaDeTelevisores() {
        return listaDeTelevisores;
    }

    //Constructor por defecto
    public boolean crearTelevisor() {
        Televisor televisor = new Televisor();
        listaDeTelevisores.add(televisor);
        return true;
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

            listaDeTelevisores.add(new Televisor(precioBaseAux, pesoAux));
            return true;
        }
    }

    //Constructor con la carga y el resto de atributos heredados. 
    @SuppressWarnings("ConvertToStringSwitch")
    public boolean crearTelevisor(String precioBase, String color, String consumoEnergetico, String peso, String pulgadas, String TDT) {
        if (!validador.validarConRegex(precioBase, "^([1-9][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|10000)$", "Precio Base", "Precio Base es invalido(a) \ndebe ser un numero de 1-10000. Ejemplo: 970")
                || !validador.validarConRegex(peso, "^([1-2][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|3000)$", "Peso", "Peso es invalido(a), \ndebe ser un numero de 1-3000kg. Ejemplo: 20")
                || !validador.validarConRegex(color, "^(Blanco|Negro|Azul|Rojo|Gris)$", "Color", "Color es invalido(a), \ndebe ser BLANCO, NEGRO, AZUL, ROJO o GRIS")
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

            listaDeTelevisores.add(new Televisor(precioBaseAux, color, consumoEnergeticoAux, pesoAux, pulgadasAux, TDTAux));
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

    //Modifica Equipos
    public boolean modificarTelevisor(String id, String precioBase, String color, String consumoEnergetico, String peso, String pulgadas, String TDT) {
        if (!validador.validarConRegex(precioBase, "^([1-9][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|10000)$", "Precio Base", "Precio Base es invalido(a) \ndebe ser un numero de 1-10000. Ejemplo: 970")
                || !validador.validarConRegex(peso, "^([1-2][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|3000)$", "Peso", "Peso es invalido(a), \ndebe ser un numero de 1-3000kg. Ejemplo: 20")
                || !validador.validarConRegex(color, "^(Blanco|Negro|Azul|Rojo|Gris)$", "Color", "Color es invalido(a), \ndebe ser BLANCO, NEGRO, AZUL, ROJO o GRIS")
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

            int acumulador = 0;

            for (Televisor i : listaDeTelevisores) {
                if (i.getId().equals(id)) {
                    listaDeTelevisores.set(acumulador, televisorModificado);
                }
                acumulador++;
            }
            return true;
        }

    }

    public boolean eliminarTelevisor(String id) {
        Televisor televisor = listarTelevisor(id);
        if (televisor != null) {
            int acumulador = 0;
            for (Televisor i : listaDeTelevisores) {
                if (i.getId().equals(id)) {
                    listaDeTelevisores.remove(acumulador);
                    return Boolean.TRUE;
                }
                acumulador++;
            }
        }
        JOptionPane.showMessageDialog(null, "Televisor no encontrado, no pudo eliminarse", "Error", JOptionPane.ERROR_MESSAGE);
        return Boolean.FALSE;
    }

}
