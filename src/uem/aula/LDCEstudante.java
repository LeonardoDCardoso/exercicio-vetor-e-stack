
package uem.aula;

import java.util.Vector;

/**
 *
 * @author 
 */
public class LDCEstudante {
    
    private String nome;
    private Vector<Double> notas;
    private double media;

    /**
     * 
     * @param nome
     * @param notas
     * @param media 
     */
    public LDCEstudante(String nome, Vector<Double> notas) {
        this.nome = nome;
        this.notas = notas;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return As notas a retornar
     */
    public Vector<Double> getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(Vector<Double> notas) {
        this.notas = notas;
    }

    /**
     * @return the media
     */
    public double getMedia() {
        return media;
    }

    /**
     * @param media the media to 
     */
    public void setMedia(double media) {
        this.media = media;
    }

    /**
     * metodo que calcula a media do aluno
     * @return media
     */
    public double media(){
        double soma = 0;
        for (int i = 0; i < notas.size(); i++) {
            double a= notas.elementAt(i);
            soma += a;
        }
       this.media = soma/notas.size();
       return this.media;
    }
    
}
