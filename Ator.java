public class Ator extends Pessoa implements Orcamento {
    protected int nivelfamoso;
    protected int idator;

    public Ator(int nivelfamoso, String nome, String localizacao, double preco, int idator) {
        super(nome, localizacao, preco);
        this.nivelfamoso = nivelfamoso;
        this.idator = idator;
    }

    // Sets
    public void setNivelfamoso(int nivelfamoso) {
        this.nivelfamoso = nivelfamoso;
    }

    public void setIdator(int idator) {
        this.idator = idator;
    }

    // Gets
    public int getNivelfamoso() {
        return nivelfamoso;
    }

    public int getIdator() {
        return idator;
    }

    public double investimentoTotal() {
        double investimento = super.getPreco() * this.getIdator();
        
            return investimento;
        }
    

    @Override
    public String toString() {
        return "\nO ator possui o Nome : " + getNome() + "\nLocalização: " + getLocalizacao() + "\nPreço: " + getPreco()
                + "\nNivel de fama: " + getNivelfamoso() + "\nId do ator: " + getIdator();

    }

}
