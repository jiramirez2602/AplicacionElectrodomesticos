package model;

import model.Electrodomestico;


public class Lavadora extends Electrodomestico {

    private int carga;

    //Constructor por defecto
    public Lavadora() {
        this.carga = 5;
    }

    //Constructor con el precio y peso. El resto por defecto.
    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    //Constructor con la carga y el resto de atributos heredados. 
    public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public int precioFinal() {                         
        int precioExtra = 0;                           
        switch (getConsumoEnergetico()) {              
            case 'A' ->                                       
                precioExtra += 100;      
            case 'B' ->                                
                precioExtra += 80;
            case 'C' ->
                precioExtra += 60;
            case 'D' ->
                precioExtra += 50;
            case 'E' ->
                precioExtra += 30;
            case 'F' ->
                precioExtra += 10;
        }

        int pesoAux = this.getPeso();
        if (pesoAux >= 0 && pesoAux < 20) {
            precioExtra += 10;
        } else if (pesoAux >= 20 && pesoAux < 50) {
            precioExtra += 50;
        } else if (pesoAux >= 50 && pesoAux < 80) {
            precioExtra += 80;
        } else if (pesoAux > 80) {
            precioExtra += 100;
        }

        if (carga > 50) {
            precioExtra += 50;
        }

        return super.getPrecioBase() + precioExtra;
    }
    //Se cumple el principio de Sustitucion de Liskov por el metodo de 
    //precioFinal porque una lavadora y un televisor son considerados
    //electrodomesticos y a la vez estos aparatos comparten la caracteristica
    //de poseer un precio final para la venta en una tienda de articulos
    //para el hogar.Por lo tanto las clases Lavadora y Televisor son sustituibles
    //con la clase padre que es la clase Electrodomestico por el metodo precioFinal.


}
