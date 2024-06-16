package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {
    public String dato;
    public String regex;
    public ArrayList<String> listaValida = new ArrayList<>();

    public void setListaValida(String listaValida) {
        this.listaValida = stringToSubstringsList(listaValida);
    }

    public static ArrayList<String> stringToSubstringsList(String text) {
        String[] substrings = text.split(",");
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(substrings));
        return stringList;
    }

    public boolean esRegexValido() {
        Pattern patron = Pattern.compile(regex);
        Matcher matcher = patron.matcher(dato);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esItemEnLista() {
        return listaValida.contains(dato);
    }

    public String validarConRegex(String regex, String solicitud, String descripcion, String defecto) {
        this.regex = regex;
        Scanner sn = new Scanner(System.in);
        boolean auxBool = true;

        do {
            System.out.println("Los datos pueden ser " + descripcion);
            System.out.println(solicitud);
            this.dato = sn.nextLine();

            if (!esRegexValido() && defecto == null) {
                System.out.println("Dato ingresado no valido intente de nuevo");
            } else if (!esRegexValido() && defecto != null) {
                System.out.println("Dato ingresado no valido");
                System.out.println("Se establecera valor por defecto: " + defecto);
                return defecto;
            } else if (esRegexValido()) {
                auxBool = false;
            }
        } while (auxBool);
        return dato;
    }

    public String validarConLista(String lista, String solicitud, String defecto) {
        setListaValida(lista);
        Scanner sn = new Scanner(System.in);
        boolean auxBool = true;

        do {
            System.out.println("Los datos pueden ser " + lista);
            System.out.println(solicitud);
            this.dato = sn.nextLine();

            if (!esItemEnLista() && defecto == null) {
                System.out.println("Dato ingresado no valido intente de nuevo");
            } else if (!esItemEnLista() && defecto != null) {
                System.out.println("Dato ingresado no valido");
                System.out.println("Se establecera valor por defecto: " + defecto);
                return defecto;
            } else if (esItemEnLista()) {
                auxBool = false;
            }
        } while (auxBool);
        return dato;
    }
}
