/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Modelo.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LEFT4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaStr = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);
        Premios LPremios = new Premios();
        Equipos LEquipos = new Equipos();
//        ArrayList listaPremios = new ArrayList<>();
//        ArrayList listaEquipos = new ArrayList<>();
        int opc = 0;
        while (opc != 4) {
            System.out.println("Opcion 1: Ingresar premios");
            System.out.println("Opcion 2: Ingresar equipos");
            System.out.println("Opcion 3: Empezar el juego");
            System.out.println("Opcion 4: Salir");
            System.out.println("Ingrese una opcion a realizar: ");
            opc = entradaInt.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Cuantos premios habra en juego?: ");
                    int numPremios = entradaInt.nextInt();
                    LPremios.añadirPremios(numPremios);
                    //LPremios.printPremios();
                    break;
                case 2:
                    System.out.println("Cuantos Equipos participaran?: ");
                    int numEquipos = entradaInt.nextInt();
                    LEquipos.añadirEquipos(numEquipos);
                    break;
                case 3:
                    for(int i=0; i<LPremios.cantidadPremios(); i++){
                        
                    }
                    break;
                default:
                    break;

            }
        }
    }

}
