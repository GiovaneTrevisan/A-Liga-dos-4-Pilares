
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Personagem> personagens = new ArrayList<>();

        String nome = "Lisiane Reips";
        String nomeDeGuerra = "Mulher maravilha";
        Sexo sexo = Sexo.MULHER;
        double altura = 1.75;
        boolean identidadeSecreta = true;
        List<String> habilidades = Arrays.asList("super força", "visão de raio-x", "voar",
                "super velocidade", "sopro congelante");

        SuperHeroi h = new SuperHeroi(nome, sexo, altura, nomeDeGuerra, identidadeSecreta, habilidades);
        personagens.add(h);

        String nomeVilao = "Dr Trevoso";
        Sexo sexoVilao = Sexo.HOMEM;
        double alturaVilao = 1.90;
        int nivelAmeaca = 10;

        Vilao v = new Vilao(nomeVilao, sexoVilao, alturaVilao, nivelAmeaca);
        personagens.add(v);

        for (Personagem p : personagens) {
            System.out.println(p.apresentar());
            p.agir();
            System.out.println("---------------------------------------------");
        }
    }
}