/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p2;

import hn.uth.poo.p2.objetos.Gato;
import hn.uth.poo.p2.objetos.Hamster;
import hn.uth.poo.p2.objetos.Mantis;
import hn.uth.poo.p2.objetos.Perro;
import hn.uth.poo.p2.objetos.Tortuga;

/**
 *
 * @author maureen
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perro1 = new Perro();
        System.out.println("La distancia del perro es " + perro1.caminar(5) + " al dia");

        Gato gato1 = new Gato();
        System.out.println("La distancia de gato es " + gato1.caminar(2) + " al dia");
        
        Hamster hamster1 = new Hamster();
        System.out.println("La distancia de hamster es "+ hamster1.caminar(23)+ " al dia ");
        
        Mantis mantis1 = new Mantis();
        System.out.println("La distancia de mantis es "+mantis1.caminar(11)+ " al dia");
        
        Tortuga tortuga1 = new Tortuga();
        System.out.println("La distancia de la tortuga es "+ tortuga1.caminar(7)+ " al dia");

    }

}
