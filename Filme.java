import java.util.ArrayList;

public class Filme {
    int idfilme;
    String datalancamento;
    Double previsaoinvestimento;
    Double custofilme;
    ArrayList<Heroi> qtdheroisfilme;

    public Filme(int idfilme, String datalancamento, Double previsaoinvestimento) {

        this.idfilme = idfilme;
        this.datalancamento = datalancamento;
        this.previsaoinvestimento = previsaoinvestimento;
        this.qtdheroisfilme = new ArrayList<>(); // Criação da Array List

    }

    public void addHeroi(Heroi adicionarheroinofilme) {  //Método para adicionar heróis na ArrayList
        this.qtdheroisfilme.add(adicionarheroinofilme);
    }

    public void imprimirHerois() { // Imprimir a quantidade de heróis presente nos filmes
        System.out.println(
                "\n Quantidade de heróis presentes no filme " + this.idfilme + " é: " + this.qtdheroisfilme.size());

    }

    public double valorinvestido() { // Método do valor investido com os Heróis
        Double soma = 0.0;
        for (Heroi heroi : qtdheroisfilme) {
            soma += heroi.preco;
            System.out.println("\n O valor investido com os Heróis no filme " + this.idfilme + " foi: $ " + soma);
        }
        return soma;
    }

    public void valorPrevisto() { //Método para definir margem de lucro ou prejuizo do filme

        System.out.println(
                "\n O valor previsto para a produção do filme " + this.idfilme + " foi de $ " + previsaoinvestimento);
        System.out.println(" O valor real investido no filme " + this.idfilme + " foi de $ " + valorinvestido());

        if (previsaoinvestimento >= valorinvestido()) {
            System.out.println(" O filme " + this.idfilme + " lucrou $ " + (valorinvestido() - previsaoinvestimento));
        } else {
            System.out.println(
                    " O filme " + this.idfilme + " deu prejuízo de $ " + (valorinvestido() - previsaoinvestimento));
        }

    }
}
