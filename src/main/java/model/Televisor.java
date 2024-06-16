package model;

public class Televisor extends Electrodomestico {

    public int pulgadas;
    public boolean TDT;

    public Televisor() {
        super();
        pulgadas = 20;
        TDT = false;
    }

    public Televisor(int precioBase, int peso) {
        super(precioBase, peso);
        pulgadas = 20;
        TDT = false;
    }

    public Televisor(int precioBase, String color, char consumoEnergetico, int peso, int pulgadas, boolean TDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    @Override
    public int precioFinal() {
        int precioExtra = 0;
        char consumo = getConsumoEnergetico();
        if (consumo == 'A') {
            precioExtra = precioExtra + 100;
        } else if (consumo == 'B') {
            precioExtra = precioExtra + 80;
        } else if (consumo == 'C') {
            precioExtra = precioExtra + 60;
        } else if (consumo == 'D') {
            precioExtra = precioExtra + 50;
        } else if (consumo == 'E') {
            precioExtra = precioExtra + 30;
        } else if (consumo == 'F') {
            precioExtra = precioExtra + 10;
        }

        int pesoAux = this.getPeso();
        if (pesoAux >= 0 && pesoAux < 20) {
            precioExtra = precioExtra + 10;
        } else if (pesoAux >= 20 && pesoAux < 50) {
            precioExtra = precioExtra + 50;
        } else if (pesoAux >= 50 && pesoAux < 80) {
            precioExtra = precioExtra + 80;
        } else if (pesoAux > 80) {
            precioExtra = precioExtra + 100;
        }

        if (TDT == true) {
            precioExtra = precioExtra + 50;
        }

        if (pulgadas > 30) {
            int valorOriginal = super.getPrecioBase();
            double porcentajeAumento = 0.3; // 30% como decimal
            // Calcula el aumento
            double aumento = valorOriginal * porcentajeAumento;

            // Suma el aumento al valor original para obtener el nuevo valor
            int nuevoValor = valorOriginal + (int) aumento;

            //Se retorna el precio base + 30% + precio extra calculado por otras características
            return nuevoValor + precioExtra;
        } else {
            //Se retorna el precio base + precio extra calculado por otras características
            return super.getPrecioBase() + precioExtra;
        }

    }

    public void mostrarDatos() {
        System.out.println("Televisor \nPrecio Base: $" + getPrecioBase() + "\nColor: " + getColor() + "\nConsumo: " + getConsumoEnergetico() + "\nPeso: " + getPeso() + "kg \nPulgadas: " + getPulgadas() + "\nTDT: " + isTDT() + "\nPrecio final: $" + precioFinal() + "\n");
    }

    //Se cumple el principio de Sustitucion de Liskov por el metodo de 
    //precioFinal porque una lavadora y un televisor son considerados
    //electrodomesticos y a la vez estos aparatos comparten la caracteristica
    //de poseer un precio final para la venta en una tienda de articulos
    //para el hogar.Por lo tanto las clases Lavadora y Televisor son sustituibles
    //con la clase padre que es la clase Electrodomestico por el metodo precioFinal.
}
