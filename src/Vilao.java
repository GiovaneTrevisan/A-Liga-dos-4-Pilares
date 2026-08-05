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
    public void agir() {
        if (nivelAmeaca < 4) {
            System.out.println("Ataque fraco");
        }

        if (nivelAmeaca > 4 && nivelAmeaca < 8) {
            System.out.println("Ataque médio");
        }

        if (nivelAmeaca >= 8 && nivelAmeaca <= 10) {
            System.out.println("Ataque Forte");
        }
    }

    @Override
    public String apresentar() {
        return super.toString() +
                " | Nível de ameaça: " + getNivelAmeaca();
    }
}
