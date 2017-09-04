/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.aula.ex01;

import java.util.Objects;
import java.util.Vector;

/**
 *
 * @author Cardoso
 */
public class Estatistica {
    
    /**
     * metodo que calcula a media dos elementos do vetor
     * @param vetor
     * @param tamanho
     * @return 
     */
    public int media(Vector<Integer> vetor, int tamanho){
        double soma = 0;
        double media;
        for (int i = 0; i < vetor.size(); i++) {
            soma += vetor.elementAt(i);
        }
       media = soma/vetor.size();
       return (int) media;
    }
    
    /**
     * metodo que verifica a moda dos elementos do vetor
     * @param vector
     * @param tamanho
     * @return 
     */
    public static int moda(Vector<Integer> vector, int tamanho) {
        int nVezes;
        int moda=0 ;
        int comparaV = 0;
        for (int i = 0; i < tamanho; i++) {
            nVezes = 0;
            for (int j = i + 1; j < tamanho; j++) {
                if (Objects.equals(vector.get(i), vector.get(j))) {
                    ++nVezes;
                }
            }
            if (nVezes > comparaV) {
                moda = vector.get(i);
                comparaV = nVezes;
            }
        }
        return moda;
    }
  
    
    
}
