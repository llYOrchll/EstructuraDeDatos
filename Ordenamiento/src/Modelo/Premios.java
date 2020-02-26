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
public class Premios {

    ArrayList listaPremios = new ArrayList<>();
    ArrayList listaPrecios = new ArrayList<>();
    Scanner entradaStr = new Scanner(System.in);
    Scanner entradaInt = new Scanner(System.in);

    public Premios() {
        this.listaPrecios = listaPrecios;
    }

    public ArrayList getListaPrecios(int i) {
        return listaPrecios;
    }

    public void setListaPrecios(ArrayList listaPrecios) {
        this.listaPrecios = listaPrecios;
    }

    public void añadirPremios(int numPremios) {
        for (int i = 0; i < numPremios; i++) {
            System.out.println("Ingrese el nombre del premio numero " + (i + 1) + ": ");
            String nombrePremio = entradaStr.nextLine();
            listaPremios.add(nombrePremio);
            System.out.println("Ingrese el precio del premio numero " + (i + 1) + ": ");
            int precio = entradaInt.nextInt();
            listaPrecios.add(precio);
        }
    }

    public void printPremios() {
        for (int i = 0; i < listaPremios.size(); i++) {
            System.out.println("Premio: " + listaPremios.get(i) + " Valor: " + listaPrecios.get(i));
        }
    }

    public int cantidadPremios() {
        return listaPremios.size();
    }

}
