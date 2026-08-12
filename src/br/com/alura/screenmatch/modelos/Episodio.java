package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numEpisodio = 0;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    @Override
    public int getClassificaao() {
        if(totalVisualizacoes > 100){
            return 4;
        } else {
        return 2;
        }
    }

    public int getNumEpisodio() {
        return numEpisodio;
    }

    public void setNumEpisodio(int numEpisodio) {
        this.numEpisodio = numEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }
}
