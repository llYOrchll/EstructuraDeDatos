/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LEFT4
 */
public class Equipos {
    ArrayList listaEquipos = new ArrayList<>();
    Scanner entradaStr = new Scanner(System.in);
    public void añadirEquipos(int numEquipos){
        for(int i=0; i<numEquipos; i++){
            System.out.println("Ingrese el nombre del equipo " + i+1 + ": ");
            String nombreEquipo = entradaStr.nextLine();
            listaEquipos.add(nombreEquipo);
        }
    }

}
