package controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Validador {

    private String dato;
    private String regex;

    public Validador() {
        this.dato = null;
        this.regex = null;
    }


    public boolean esRegexValido() {
        Pattern patron = Pattern.compile(regex);
        Matcher matcher = patron.matcher(dato);
        return matcher.matches();
    }

    public boolean validarConRegex(String dato, String regex, String campo, String descripcion) {
        this.regex = regex;
        this.dato = dato;

        if (!esRegexValido()) {
            String auxStr = "Dato: '" + campo + "' \nError: " + descripcion;
            JOptionPane.showMessageDialog(null, auxStr, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }    
}
