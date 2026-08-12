import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.Classificavel;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class Main {

    public static void main(String[] args) {
        Titulo favorito = new Titulo();

        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);
        favorito.pegaMedia();

        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());

        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setNumeroTemp(10);
        lost.setEncerrada(true);
        lost.setEpisodiosPorTemp(20);
        lost.setMinutosPorEpisodio(50);
        lost.avalia(9);
        lost.avalia(4);
        lost.avalia(1);
        lost.pegaMedia();

        System.out.println("Nome Série: "+lost.getNome());
        System.out.println("Temporadas: "+lost.getNumeroTemp());
        if(lost.isEncerrada()){
            System.out.println("Status: Série encerrada");
        }

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(favorito);
        calculadoraDeTempo.inclui(lost);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(favorito);

        Episodio episodio = new Episodio();
        episodio.setNumEpisodio(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(101);
        filtro.filtra(episodio);
    }
}