import java.util.ArrayList;

public class Heroi {
    int idHeroi;
    String nome;
    String localizacao;
    String identidade;
    double preco;
    int idfranquia;
    ArrayList<Filme> qtdFilmesHeroi;

    public Heroi(int idheroi, String nome, String localizacao, String identidade, Double preco, int idFranquia) {
        this.idHeroi = idheroi;
        this.nome = nome;
        this.localizacao = localizacao;
        this.identidade = identidade;
        this.preco = preco;
        this.idfranquia = idFranquia;
        this.qtdFilmesHeroi = new ArrayList<>();

    }

    public double TotalInvestimentos() {  
        double investimento = this.preco * this.qtdFilmesHeroi.size();
        return investimento;    // Este método não esta retornando o valor de investimento, 
                                //não consegui localizar meu erro
    }

    public void ImprimirInvestimento() {
        System.out
                .println("\n O total de investimento do herói " + this.nome + " foi de: " + this.TotalInvestimentos());

    }

    public void ParticipacaoFilmes() {
        for (Filme filme : qtdFilmesHeroi) { //Não consegui completar este método para 
            System.out.println(              //listar a participação dos heróis nos filmes
                    "A quantidade de filmes que o herói " + this.nome + " participa é: " + this.qtdFilmesHeroi.size());

        }

    }

}
