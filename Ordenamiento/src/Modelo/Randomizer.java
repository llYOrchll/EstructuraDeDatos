/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author LEFT4
 */
public class Randomizer {

    private ArrayList<Float> tiempos;

    public Randomizer() {
        tiempos = new ArrayList<>();
    }

    public void listaVacia(int num) {
        for (int i = 0; i < num; i++) {
            tiempos.add(Float.NaN);
        }
    }

    public void generarTiempos() {
        Random numAleatorio = new Random();
        for (int i = 0; i < tiempos.size(); i++) {
            tiempos.set(i, numAleatorio.nextFloat());
        }
        System.out.println("Tiempos: " + tiempos);

    }

}
