//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Mago mago = new Mago("Gigi gatinho");
        System.out.println(mago.mostrarStatus());
        System.out.println(mago.atacar());
        System.out.println(mago.receberDano());
        System.out.println(mago.lancarMagia());

    Guerreiro guerreiro = new Guerreiro("Aurora");
        System.out.println(guerreiro.mostrarStatus());
        System.out.println(guerreiro.atacar());
        System.out.println(guerreiro.receberDano());
        System.out.println(guerreiro.golpePesado());

    Arqueiro arqueiro = new Arqueiro("Jade");
        System.out.println(arqueiro.mostrarStatus());
        System.out.println(arqueiro.atacar());
        System.out.println(arqueiro.receberDano());
        System.out.println(arqueiro.disparoPreciso());

    }
}