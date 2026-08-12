package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    public int getNumeroTemp() {
        return numeroTemp;
    }

    public void setNumeroTemp(int numeroTemp) {
        this.numeroTemp = numeroTemp;
    }

    private int numeroTemp;

    public boolean isEncerrada() {
        return encerrada;
    }

    public void setEncerrada(boolean encerrada) {
        this.encerrada = encerrada;
    }


    private boolean encerrada;

    public int getEpisodiosPorTemp() {
        return episodiosPorTemp;
    }

    public void setEpisodiosPorTemp(int episodiosPorTemp) {
        this.episodiosPorTemp = episodiosPorTemp;
    }

    int episodiosPorTemp;

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    int minutosPorEpisodio;

    @Override
    public int getDuracaoEmMinutos() {
        return numeroTemp * episodiosPorTemp * minutosPorEpisodio;
    }
}
