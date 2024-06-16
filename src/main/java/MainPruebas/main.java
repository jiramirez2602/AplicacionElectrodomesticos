package MainPruebas;

import model.Lavadora;
import controller.ListaDeLavadoras;
import controller.ListaDeTelevisores;
import firebase.Conexion;
import model.Televisor;

public class main {

    public static void main(String[] args) {
        //Obligatorio al inicializar:
        //Actualizar base de datos e inicializar controlador:
        Conexion.conectarFirebase();
        ListaDeTelevisores listaTv = new ListaDeTelevisores();
        ListaDeLavadoras listaLav = new ListaDeLavadoras();

        //Crear un televisor nuevo
        //listaTv.crearTelevisor();
        //Actualizar televisor:
        //El id estaba ya en la base de datos de Firebase
        //listaTv.modificarTelevisor("", "3", "ROJO", "A", "20", "32", "Si");
        //Actualizar televisor:
        //El id estaba ya en la base de datos de Firebase
        //listaTv.eliminarTelevisor("87555");
//        System.out.println("Lista Televisores:");
//        for (Televisor elemento : listaTv.getListaDeTelevisores()) {
//            System.out.println("Id: " + elemento.getId());
//        }
        //Crear un Lavadora nueva
        //listaLav.crearLavadora();
        //listaLav.crearLavadora("300", "10");
        //listaLav.crearLavadora("20", "ROJO", "B", "22", "25");

        //Actualizar Lavadora:
        //El id estaba ya en la base de datos de Firebase 
        //listaLav.modificarLavadora("52676db1-760f-4ec0-b739-bd822f1d9bf5", "9", "ROJO", "A", "9", "9");
        //Eliminar Lavadora
        //El id estaba ya en la base de datos de Firebase
        //listaLav.eliminarLavadora("52676db1-760f-4ec0-b739-bd822f1d9bf5");
        //Listar Lavadora
//        System.out.println("Lista Lavadoras:");
//
//        for (Lavadora elemento : listaLav.getListaDeLavadoras()) {
//            System.out.println("Id: " + elemento.getId());
//        }

    }

}
