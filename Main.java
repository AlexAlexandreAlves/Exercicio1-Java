public class Main {
    public static void main(String[] args) {
            //Criação do Objeto HERÓI
        Heroi heroiUm = new Heroi(1, "Superman", "Metrópolis", "Clark Kent", 5000.0, 1);
        Heroi heroiDois = new Heroi(2, "Batman", "Gothancity", "Bruce Wayne", 2000.0, 1);
        Heroi heroiTres = new Heroi(3, "Iron Man", "New York", "Tony Stark", 50000.0, 2);
        Heroi heroiQuatro = new Heroi(4, "Spider Man", "New York", "Peter Parker", 100.0, 2);
        Heroi heroiCinco = new Heroi(5, "Numero 5", "Ontario", "Number Five", 56000.0, 3);
        Heroi heroiSeis = new Heroi(6, "Numero 3", "Ontario", "Klaus", 70000.0, 3);
        Heroi heroiSete = new Heroi(7, "Capitão Pátria", "New York", "Max", 100000.0, 4);
        Heroi heroiOito = new Heroi(8, "Star Light", "New York", "Annie", 20000.0, 4);
        Heroi heroiNove = new Heroi(9, "Riu", "Japão", "Hadouken", 1000.0, 5);
        Heroi heroiDez = new Heroi(10, "Ken", "Japão", "Shoriouken", 1000.0, 5);
            //Criação do Objeto FRANQUIA
        Franquia franquiaUm = new Franquia(1, "DC Comics", "DC", "18/10/2019");
        Franquia franquiaDois = new Franquia(2, "Marvel Comics", "Marvel", "27/09/2000");
        Franquia franquiaTres = new Franquia(3, "Umbrella Corporate", "Umbrella Academy", "17/07/1996");
        Franquia franquiaQuatro = new Franquia(4, "The Boys", "Vought", "01/10/2015");
        Franquia franquiaCinco = new Franquia(5, "Capcoom Comics", "Capcoom", "12/01/1994");
            //Criação do Objeto FRANQUIA
        Filme filmeum = new Filme(1, "10/10/2010", 200000.0);
        Filme filmeDois = new Filme(2, "15/11/2007", 500000.0);
        Filme filmeTres = new Filme(3, "01/05/2020", 2000.0);
        Filme filmeQuatro = new Filme(4, "02/05/2019", 10000.0);
        Filme filmeCinco = new Filme(5, "14/08/2018", 7000.0);

        franquiaUm.addHeroi(heroiUm);     //Adicionando Herói na franquia
        franquiaUm.addHeroi(heroiDois);   //Adicionando Herói na franquia
        franquiaUm.imprimirHerois();      //Imprimindo Herói 

        franquiaDois.addHeroi(heroiTres);  
        franquiaDois.addHeroi(heroiQuatro);  
        franquiaDois.imprimirHerois();

        franquiaTres.addHeroi(heroiCinco);
        franquiaTres.addHeroi(heroiSeis);
        franquiaTres.imprimirHerois();

        franquiaQuatro.addHeroi(heroiSete);
        franquiaQuatro.addHeroi(heroiOito);
        franquiaQuatro.imprimirHerois();

        franquiaCinco.addHeroi(heroiNove);
        franquiaCinco.addHeroi(heroiDez);
        franquiaCinco.imprimirHerois();

        filmeum.addHeroi(heroiUm);  // Adicionando herói no filme
        filmeum.addHeroi(heroiDois);
        filmeum.imprimirHerois();
        filmeum.valorinvestido();  //Impressão de valores previstos e investidos
        filmeum.valorPrevisto();

        filmeDois.addHeroi(heroiTres);
        filmeDois.addHeroi(heroiSeis);
        filmeDois.addHeroi(heroiUm);
        filmeDois.imprimirHerois();
        filmeDois.valorinvestido();
        filmeDois.valorPrevisto();

        filmeTres.addHeroi(heroiSete);
        filmeTres.addHeroi(heroiNove);
        filmeTres.imprimirHerois();
        filmeTres.valorinvestido();
        filmeTres.valorPrevisto();

        filmeQuatro.addHeroi(heroiDez);
        filmeQuatro.imprimirHerois();
        filmeQuatro.valorinvestido();
        filmeQuatro.valorPrevisto();

        filmeCinco.addHeroi(heroiQuatro);
        filmeCinco.imprimirHerois();
        filmeCinco.valorinvestido();
        filmeCinco.valorPrevisto();

        heroiUm.ParticipacaoFilmes(); // Impressão da participação do Herói no filme
        heroiUm.ImprimirInvestimento(); // Impressão investimento com herói no filme

        heroiDois.ParticipacaoFilmes();
        heroiDois.ImprimirInvestimento();

        heroiTres.ParticipacaoFilmes();
        heroiTres.ImprimirInvestimento();

        heroiQuatro.ParticipacaoFilmes();
        heroiQuatro.ImprimirInvestimento();

        heroiCinco.ParticipacaoFilmes();
        heroiCinco.ImprimirInvestimento();

        heroiSeis.ParticipacaoFilmes();
        heroiSeis.ImprimirInvestimento();

        heroiSete.ParticipacaoFilmes();
        heroiSete.ImprimirInvestimento();

        heroiOito.ParticipacaoFilmes();
        heroiOito.ImprimirInvestimento();

        heroiNove.ParticipacaoFilmes();
        heroiNove.ImprimirInvestimento();

        heroiDez.ParticipacaoFilmes();
        heroiDez.ImprimirInvestimento();

    }
}
