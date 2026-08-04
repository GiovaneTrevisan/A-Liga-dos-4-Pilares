
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String nome = "Lisiane Reips";
        Sexo sexo = Sexo.MULHER;
        Double altura = 1.75;
        boolean identidadeSecreta = true;
        List<String> habilidades = Arrays.asList("super força", "visão de raio-x", "voar",
                "super velocidade", "sopro congelante");

        SuperHeroi h = new SuperHeroi(nome, sexo, altura, identidadeSecreta, habilidades);

        h.mostrar();

        // O vilão consegue fazer isto. Por quê?
        //h.altura = -300;
        //h.nome = "";
        //h.mostrar();

        //Teste Lista
        List<String> habilidadesTeste = h.getHabilidades();

        habilidadesTeste.add("Habilidade de teste");

        System.out.println(habilidadesTeste.size());
        System.out.println(habilidades.size());

        //Personagem px = new Personagem() {};
    }
}