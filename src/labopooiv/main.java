/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labopooiv;

import controller.ListaDeLavadoras;
import controller.ListaDeTelevisores;
import java.util.ArrayList;
import model.Lavadora;
import model.Televisor;

/**
 *
 * @author jirm2
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDeLavadoras listalavadora = new ListaDeLavadoras();
        ListaDeTelevisores listatelevisor = new ListaDeTelevisores();
        /*listalavadora.crearLavadora();
        listalavadora.crearLavadora("300","30");
        listalavadora.crearLavadora("200","Azul","A","40","30");
        ArrayList<Lavadora>lavar=listalavadora.getListaDeLavadoras();
        for(Lavadora i:lavar){
            i.mostrarDatos();
        }
        String ID=lavar.get(1).getId();
        listalavadora.modificarLavadora(ID,"160","Azul","A","40","30");
        lavar=listalavadora.getListaDeLavadoras();
        lavar.get(1).mostrarDatos();
        listalavadora.eliminarLavadora(ID);
        lavar=listalavadora.getListaDeLavadoras();
        System.out.println();
        System.out.println();
        for(Lavadora i:lavar){
            i.mostrarDatos();
        }*/
        listatelevisor.crearTelevisor();
        listatelevisor.crearTelevisor("300","40");
        listatelevisor.crearTelevisor("240","Azul","C","30","60","Si");
        ArrayList<Televisor>tele=listatelevisor.getListaDeTelevisores();
        for(Televisor i:tele){
            i.mostrarDatos();
        }
        String ID=tele.get(1).getId();
        listatelevisor.modificarTelevisor(ID, "100","Gris","B","20", "40","No");
        System.out.println();
        System.out.println();
        tele.get(1).mostrarDatos();
        listatelevisor.eliminarTelevisor(ID);
        System.out.println();
        System.out.println();
        tele=listatelevisor.getListaDeTelevisores();
        for(Televisor i:tele){
            i.mostrarDatos();
        }
    }
    
}
