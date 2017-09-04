
package uem.aula;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class LDCTurmaLaboral {
   
    private LDCEstudante estudante;
    ArrayList<LDCEstudante> lista;
    
  /**
   * metodo que adiciona um estudante no array
   * @param estudante 
   */
  public void add(LDCEstudante estudante){
      lista.add(estudante);
  }
  
  /**
   * metodo que calcula a media de todos os estudantes
   * @return media dos estudantes
   */
  public double media(){
      double soma=0;
      for (int i = 0; i < lista.size(); i++) {
          soma+=lista.get(i).getMedia();
      }
      return soma/lista.size();
  }
}
