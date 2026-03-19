public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome, 90, 20, 8);
    }

    public Arqueiro(){
        super();
    }

    public Arqueiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }
    public String disparoPreciso(){
        return "Lançou a flecha";
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
