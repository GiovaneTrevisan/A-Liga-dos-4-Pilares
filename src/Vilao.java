public class Vilao extends Personagem {

    private Integer nivelAmeaca;

    public Vilao(String nome, Sexo sexo, double altura, Integer nivelAmeaca) {
        super(nome, sexo, altura);

        if (nivelAmeaca < 1 || nivelAmeaca > 10) {
            throw new IllegalArgumentException();
        }
        this.nivelAmeaca = nivelAmeaca;
    }

    public Integer getNivelAmeaca() {
        return nivelAmeaca;
    }

    @Override
    public String apresentar() {
        return "Nome: " + getNome() + " | "  +
                "Sexo: " + sexo.getDescricao() + " | Altura: " + getAltura() +
                "Nível de ameaça: " + getNivelAmeaca();
    }
}
