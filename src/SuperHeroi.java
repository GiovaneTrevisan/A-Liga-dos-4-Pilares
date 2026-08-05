
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SuperHeroi extends Personagem {

    private String nomeDeGuerra;
    private boolean identidadeSecreta;
    private List<String> habilidades;

    public SuperHeroi(String nome, Sexo sexo, double altura, String nomeDeGuerra, boolean identidadeSecreta,
                      List<String> habilidades) {
        super(nome, sexo, altura);
        this.nomeDeGuerra = Objects.requireNonNull(nomeDeGuerra);
        this.identidadeSecreta = identidadeSecreta;
        this.habilidades = habilidades;
    }

    public List<String> getHabilidades() {
        return new ArrayList<>(this.habilidades);
    }

    public String isIdentidadeSecreta() {
        if (identidadeSecreta) {
            return "Identidade Protegida";
        }
        else {
            return "Identidade Pública";
        }
    }

    public String getNomeDeGuerra() {
        return nomeDeGuerra;
    }

    private void usarHabilidade(){
        System.out.println("Não foi informada a habilidade");
    }

    private void usarHabilidade(int indice) {
        if (indice < 0 || indice >= habilidades.size()) {
            System.out.println("Índice não encontrado!");
        }
        else {
            System.out.println("Habilidade atual: " + habilidades.get(indice));
        }
    }

    private void usarHabilidade(String nome) {
        if (habilidades.contains(nome)) {
            System.out.println("Habilidade Usada: " + habilidades.get(habilidades.indexOf(nome)));
        } else {
            System.out.println("Nome não encontrado!");
        }
    }

    @Override
    public String apresentar() {
        return super.toString() + "NomeDeGuerra: " + getNomeDeGuerra() + " | "  +
                "Identidade Secreta: " + isIdentidadeSecreta() + " | " + habilidades.toString();
    }

    @Override
    public void agir() {
        usarHabilidade();
        usarHabilidade(3);
        usarHabilidade("super força");
    }
}