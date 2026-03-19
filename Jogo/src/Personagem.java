public class Personagem {

    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public int atacar() {
        return ataque;
    }

    public int receberDano(){
        return vida = vida + (defesa - ataque);
    }

    public String mostrarStatus() {
        return " A vida é " + vida +
                " o Ataque é" + ataque +
                "a defesa é : " + defesa;
    }

    public Personagem() {
    }

    public Personagem(String nome, int vida, int ataque, int defesa) {

        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
