public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 100, 25, 5);
    }

    public Mago() {
        super();
    }

    public Mago(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public String lancarMagia() {
        return "Lançou magia de 20";
    }

    @Override
    public int atacar() {
        return super.atacar();
    }

    @Override
    public int receberDano() {
        return super.receberDano();
    }

    @Override
    public String mostrarStatus() {
        return super.mostrarStatus();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public int getVida() {
        return super.getVida();
    }

    @Override
    public void setVida(int vida) {
        super.setVida(vida);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque();
    }

    @Override
    public void setAtaque(int ataque) {
        super.setAtaque(ataque);
    }

    @Override
    public int getDefesa() {
        return super.getDefesa();
    }

    @Override
    public void setDefesa(int defesa) {
        super.setDefesa(defesa);
    }
}
