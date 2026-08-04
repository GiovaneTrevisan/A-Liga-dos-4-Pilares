import java.util.Objects;

public abstract class Personagem {
    protected String nome;
    protected Sexo sexo;
    protected Double altura;

    public Personagem(String nome, Sexo sexo, Double altura) {
        if (altura < 0.5 || altura > 3.0) {
            throw  new IllegalArgumentException();
        }

        this.nome = Objects.requireNonNull(nome);
        this.sexo = sexo;
        this.altura = altura;
    }

    public abstract String apresentar();

    public Double getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }

    public Sexo getSexo() {
        return sexo;
    }
}
