/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.aula.ex02;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Cardoso
 */
public class Ex02 {
    /**
     * metodo que executa o jogo do galo
     * @param vetor 
     */
    public static void galo (Vector<Integer> vetor){
        Scanner sc = new Scanner(System.in);
        boolean a = false;
        do { 
            System.out.println("Escolha um numero: ");
            int numero = sc.nextInt();
            Random random = new Random();
            if ( numero == vetor.get(random.nextInt(vetor.size()))){
                System.out.println("Venceste");
                a = true;
            }
        } while (a==false);
    }
    
    public static void main(String[] args) {
        Vector<Integer> vetor = new Vector<>();
        vetor.add(1);
        vetor.add(10);
        vetor.add(11);
        galo(vetor);
    }
}
