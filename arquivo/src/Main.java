import java.nio.file.Path;

void main() throws IOException {
            ContaBancaria conta = new ContaBancaria(100);

            try {
                conta.sacar(150);
            } catch (SaldoInsuficienteException e) {
                System.out.println(e.getMessage());
            }
}