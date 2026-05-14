import javax.swing.*;

public class Recuperacao {

    public static void main(String[] args) {

        // Criando a tela
        JFrame tela = new JFrame();

        tela.setTitle("Cadastro de Produto");
        tela.setSize(300, 300);
        tela.setLayout(null);

        // Texto Nome
        JLabel nome = new JLabel("Nome:");
        nome.setBounds(20, 20, 100, 20);
        tela.add(nome);

        // Campo Nome
        JTextField campoNome = new JTextField();
        campoNome.setBounds(100, 20, 150, 20);
        tela.add(campoNome);

        // Texto Preço
        JLabel preco = new JLabel("Preço:");
        preco.setBounds(20, 60, 100, 20);
        tela.add(preco);

        // Campo Preço
        JTextField campoPreco = new JTextField();
        campoPreco.setBounds(100, 60, 150, 20);
        tela.add(campoPreco);

        // Texto Quantidade
        JLabel quantidade = new JLabel("Quantidade:");
        quantidade.setBounds(20, 100, 100, 20);
        tela.add(quantidade);

        // Campo Quantidade
        JTextField campoQuantidade = new JTextField();
        campoQuantidade.setBounds(100, 100, 150, 20);
        tela.add(campoQuantidade);

        // Botão cadastrar
        JButton cadastrar = new JButton("Cadastrar");
        cadastrar.setBounds(20, 150, 110, 30);
        tela.add(cadastrar);

        // Botão limpar
        JButton limpar = new JButton("Limpar");
        limpar.setBounds(140, 150, 110, 30);
        tela.add(limpar);

        // Área de resultado
        JTextArea resultado = new JTextArea();
        resultado.setBounds(20, 200, 230, 70);
        tela.add(resultado);

        // Ação do botão cadastrar
        cadastrar.addActionListener(e -> {

            String nomeProduto = campoNome.getText();
            String precoProduto = campoPreco.getText();
            String quantidadeProduto = campoQuantidade.getText();

            // Verificando se os campos estão vazios
            if (nomeProduto.equals("")) {

                JOptionPane.showMessageDialog(null, "Digite o nome!");

            } else if (precoProduto.equals("")) {

                JOptionPane.showMessageDialog(null, "Digite o preço!");

            } else if (quantidadeProduto.equals("")) {

                JOptionPane.showMessageDialog(null, "Digite a quantidade!");

            } else {

                double precoValor = Double.parseDouble(precoProduto);
                int quantidadeValor = Integer.parseInt(quantidadeProduto);

                // Verificando preço
                if (precoValor <= 0) {

                    JOptionPane.showMessageDialog(null, "Preço inválido!");

                }

                // Verificando quantidade
                else if (quantidadeValor <= 0) {

                    JOptionPane.showMessageDialog(null, "Quantidade inválida!");

                }

                // Mostrando resultado
                else {

                    resultado.setText(
                            "Produto cadastrado com sucesso!" +
                            "\nProduto: " + nomeProduto +
                                    "\nPreço: " + precoValor +
                                    "\nQuantidade: " + quantidadeValor
                    );

                }
            }

        });

        // Ação do botão limpar
        limpar.addActionListener(e -> {

            campoNome.setText("");
            campoPreco.setText("");
            campoQuantidade.setText("");
            resultado.setText("");

        });

        // Deixando a tela visível
        tela.setVisible(true);

        // Exibir mensagem
        resultado.setText("Produto cadastrado com sucesso!");
    }
}