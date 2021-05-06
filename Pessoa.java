public abstract class Pessoa {
   public String nome;
   public String localizacao;
   public double preco; 

   public Pessoa(String nome, String localicazao, double preco) {
      this.nome = nome;
      this.localizacao = localicazao;
      this.preco = preco;
   }

   // Sets
   public void setNome(String nome) {
      this.nome = nome;
   }

   public void setLocalizacao(String localizacao) {
      this.localizacao = localizacao;
   }

   public void setDouble(double preco) {
      this.preco = preco;
   }

   // Gets
   public String getNome() {
      return nome;
   }

   public String getLocalizacao() {
      return localizacao;
   }

   public double getPreco() {
      return preco;
   }

   @Override
   public String toString() {
      return "\nNome : " + getNome() + "\n Localização: " + getLocalizacao() + "\nPreço: " + getPreco();

   }

}
