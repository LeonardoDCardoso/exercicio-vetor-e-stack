/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.aula.ex05;

import java.util.Vector;

/**
 *
 * @author Cardoso
 */
public class Ex5 {
    
    public static Vector<Integer> ordenar(Vector<Integer> vetor){
                  
       Vector<Integer>  vetorOrdenado = new Vector<>();
       vetorOrdenado.setSize(vetor.size());
       int maior;
       for (int i=0; i<vetor.size(); i++){
           maior = i;
            for (int j=(i+1); j<vetor.size(); j++){
                if (vetor.get(j)>vetor.get(maior)){
                    maior=j;
            }
           //if (vetor.get(i) < vetor.get(maior)){
           
            vetorOrdenado.setElementAt(vetor.get(j), i);
            vetor.removeElementAt(maior);
            
         
        }     
       }
        return vetorOrdenado;
       
    }
    
    
     public static void main(String[] args) {
       
       Vector<Integer> vector= new  Vector<>();
        vector.add(2);
        vector.add(12);
        vector.add(121);
        System.out.println(ordenar(vector).toString());
        
    }
    
}