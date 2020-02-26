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
public class Ordenamiento {
    Randomizer a = new Randomizer();

    public Ordenamiento() {
        ArrayList listaPremios = new ArrayList<>();
        ArrayList listaEquipos = new ArrayList<>();
    }

    public void Ordenar(int num) {
        Scanner numero = new Scanner(System.in);
        int vector[] = new int[30];
        int aux;
        for (int i = 0; i < num; i++) {
            System.out.print("Datos[" + (i + 1) + "]=");
            vector[i] = numero.nextInt();
        }
        for (int i = 0; i < num - 1; i++) {
            int min = i;
            for (int j = i + 1; j < num; j++) {
                if (vector[j] < vector[min]) {
                    min = j;
                }
            }
            if (i != min) {
                aux = vector[i];
                vector[i] = vector[min];
                vector[min] = aux;
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(vector[i] + ", ");
        }
    }

}
