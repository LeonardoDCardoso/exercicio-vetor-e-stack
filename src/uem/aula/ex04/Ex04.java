package uem.aula.ex04;


import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cardoso
 */
public class Ex04 {
    
    /**
     * metodo que compara os vetores booleanos
     * @param vetor
     * @param vetor1 
     */
    public static void comparar(Vector<Boolean> vetor, Vector<Boolean> vetor1){
        
        if (vetor.size()!=vetor1.size()){
            System.out.println("Vetores diferentes");
            return;
        }else{
            for (int i = 0; i < vetor.size(); i++) {
                if(vetor.get(i)!=vetor1.get(i)){
                    System.out.println("Vetores diferentes");
                    return;
                }
            }
        }
        System.out.println("Vetores iguais");
    }
    
    public static void main(String[] args) {
        Vector<Boolean> vetor = new Vector<>();
        Vector<Boolean> vetor1 = new Vector<>();
        vetor.add(Boolean.TRUE);
        vetor1.add(Boolean.TRUE);
        vetor1.add(Boolean.TRUE);
        comparar(vetor, vetor1);
    }
}
