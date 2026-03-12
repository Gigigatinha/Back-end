import java.io.PrintStream;

public class Animal {

    private String nome;
    private String cor;
    private double peso;

    public Animal(){

    }

    public Animal(String nome, String cor, double peso) {
        this.nome = nome;;
        this.cor = cor;
        this.peso = peso;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void fazerSom(){

    }
}
