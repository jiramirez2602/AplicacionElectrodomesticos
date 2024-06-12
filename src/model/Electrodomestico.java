package model;

import java.util.UUID;

public abstract class Electrodomestico {

    protected int precioBase;
    protected String color; //blanco, negro, rojo, azul y gris
    protected char consumoEnergetico; //A, B, C, D, E, F
    protected int peso;
    protected String id;

    public static final String generarUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    //constructor por defecto.
    public Electrodomestico() {
        this.id = generarUUID();
        color = "Blanco";
        consumoEnergetico = 'F';
        precioBase = 100;
        peso = 5;
    }

    //constructor con el precio y peso. El resto por defecto. 
    public Electrodomestico(int precioBase, int peso) {
        this.id = generarUUID();
        this.color = "BLANCO";
        this.consumoEnergetico = 'F';
        this.peso = peso;
        this.precioBase = precioBase;
    }

    //constructor con todos los atributos.
    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.id = generarUUID();
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        this.precioBase = precioBase;
    }

    public String getId() {
        return id;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public abstract int precioFinal();
    //Se cumple el principio de Sustitucion de Liskov por el metodo de 
    //precioFinal porque una lavadora y un televisor son considerados
    //electrodomesticos y a la vez estos aparatos comparten la caracteristica
    //de poseer un precio final para la venta en una tienda de articulos
    //para el hogar.Por lo tanto las clases Lavadora y Televisor son sustituibles
    //con la clase padre que es la clase Electrodomestico por el metodo precioFinal.
}
