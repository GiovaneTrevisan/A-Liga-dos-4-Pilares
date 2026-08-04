
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

    @Override
    public String apresentar() {
        return "NomeDeGuerra: " + getNomeDeGuerra() + " | " + "Nome: " + getNome() + " | "  +
                "Sexo: " + getSexo().getDescricao() + " | Altura: " + getAltura() + " | " +
                "Identidade Secreta: " + isIdentidadeSecreta() + " | " + habilidades.toString();
    }
}