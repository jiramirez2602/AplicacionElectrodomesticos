package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Lavadora;

public class ListaDeLavadoras {

    private ArrayList<Lavadora> listaDeLavadoras;
    private Validador validador;

    public ListaDeLavadoras() {
        listaDeLavadoras = new ArrayList<>();
        validador = new Validador();
    }

    public ArrayList<Lavadora> getListaDeLavadoras() {
        return listaDeLavadoras;
    }

    //Constructor por defecto
    public boolean crearLavadora() {
        Lavadora lavadora = new Lavadora();
        listaDeLavadoras.add(lavadora);
        return true;
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

            listaDeLavadoras.add(new Lavadora(precioBaseAux, pesoAux));
            return true;
        }
    }

    //Constructor con la carga y el resto de atributos heredados. 
    public boolean crearLavadora(String precioBase, String color, String consumoEnergetico, String peso, String carga) {
        //TODO: Cambiar mensajes y validacion
        if (!validador.validarConRegex(precioBase, "^([1-9][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|10000)$", "Precio Base", "Precio Base es invalido(a) \ndebe ser un numero de 1-10000. Ejemplo: 970")
                || !validador.validarConRegex(peso, "^([1-2][0-9][0-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]|3000)$", "Peso", "Peso es invalido(a), \ndebe ser un numero de 1-3000kg. Ejemplo: 20")
                || !validador.validarConRegex(color, "^(Blanco|Negro|Azul|Rojo|Gris)$", "Color", "Color es invalido(a), \ndebe ser BLANCO, NEGRO, AZUL, ROJO o GRIS")
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

            listaDeLavadoras.add(new Lavadora(precioBaseAux, color, consumoEnergeticoAux, pesoAux, cargaAux));
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
                || !validador.validarConRegex(color, "^(Blanco|Negro|Azul|Rojo|Gris)$", "Color", "Color es invalido(a), \ndebe ser BLANCO, NEGRO, AZUL, ROJO o GRIS")
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

            int acumulador = 0;

            for (Lavadora i : listaDeLavadoras) {
                if (i.getId().equals(id)) {
                    listaDeLavadoras.set(acumulador, lavadoraModificada);
                }
                acumulador++;
            }
            return true;
        }
    }

    public boolean eliminarLavadora(String id) {
        Lavadora lavadora = listarLavadora(id);
        if (lavadora != null) {
            int acumulador = 0;
            for (Lavadora i : listaDeLavadoras) {
                if (i.getId().equals(id)) {
                    listaDeLavadoras.remove(acumulador);
                    return Boolean.TRUE;
                }
                acumulador++;
            }
        }
        JOptionPane.showMessageDialog(null, "Lavadora no encontrado, no pudo eliminarse", "Error", JOptionPane.ERROR_MESSAGE);
        return Boolean.FALSE;
    }

    public String verificarTiempoLavadoController(String nivelDelAgua, String tipoDeLavado) {
        if (!validador.validarConRegex(nivelDelAgua, "^(Normal|Rapido|Pesado)$", "Tipo de lavado", "Tipo de lavado es invalido(a), \ndebe ser normal, rapido o pesado")
                || !validador.validarConRegex(tipoDeLavado, "^(Bajo|Medio|Alto)$", "Nivel de agua", "Nivel de agua es invalido(a), debe ser bajo, medio o alto")) {
            return "Tiempo de lavado no pudo ser obtenido";
        } else {
            int tiempoDeLavado = 0;

            if ("Normal".equals(nivelDelAgua)) {
                if (null != tipoDeLavado) {
                    switch (tipoDeLavado) {
                        case "Bajo" ->
                            tiempoDeLavado = 30;
                        case "Medio" ->
                            tiempoDeLavado = 45;
                        case "Alto" ->
                            tiempoDeLavado = 60;
                        default -> {
                        }
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
}
