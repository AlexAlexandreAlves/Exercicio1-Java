import java.util.ArrayList;

public class Franquia {
    int idfranquia;
    String nomefranquia;
    String apelidofranquia;
    String datacriacao;
    ArrayList<Heroi> qtdherois;

    public Franquia(int idfranquia, String nomefranquia, String apelidofranquia, String datacriacao) {
        this.idfranquia = idfranquia;
        this.nomefranquia = nomefranquia;
        this.apelidofranquia = apelidofranquia;
        this.datacriacao = datacriacao;
        this.qtdherois = new ArrayList<>(); // Criação da ArrayList

    }

    public void addHeroi(Heroi adicionarheroi) { //Método para adicionar heróis na ArrayList
        this.qtdherois.add(adicionarheroi);
    }

    public void imprimirHerois() { // Método para impressão do tamanho da Array (qtd Heróis) na classe principal
        System.out.println(
                "\n A quantidade de heróis da franquia " + this.apelidofranquia + "  é: " + this.qtdherois.size());

    }
}
