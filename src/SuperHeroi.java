
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// NÃO ALTERE ANTES DE LER OS PASSOS
public class SuperHeroi {
    private String nome;
    private Sexo sexo;
    private double altura;
    private boolean identidadeSecreta;
    private List<String> habilidades;

    public void mostrar() {
        System.out.println(nome + " - " + sexo + " - " + altura);
        for (String habilidade : habilidades) {
            System.out.println(habilidade);
        }
    }

    public SuperHeroi(String nome, Sexo sexo, double altura, boolean identidadeSecreta, List<String> habilidades) {
        if (altura < 0.5 || altura > 3.0) {
            throw  new IllegalArgumentException();
        }

        this.nome = Objects.requireNonNull(nome);
        this.sexo = sexo;
        this.altura = altura;
        this.identidadeSecreta = identidadeSecreta;
        this.habilidades = habilidades;
    }

    public double getAltura() {
        return altura;
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

    public String getNome() {
        return nome;
    }

    public Sexo getSexo() {
        return sexo;
    }


}