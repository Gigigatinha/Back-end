import javax.swing.*;

public class Login {

    public static void main(String[] args) {

        // Criando a janela
        JFrame tela = new JFrame();

        // Título da janela
        tela.setTitle("Tela de Login");

        // Tamanho da janela
        tela.setSize(350, 250);

        // Fechar o programa ao clicar no X
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centralizar a janela
        tela.setLocationRelativeTo(null);

        // Permite colocar os elementos manualmente
        tela.setLayout(null);

        // TEXTO EMAIL
        JLabel textoEmail = new JLabel("E-mail:");
        textoEmail.setBounds(50, 40, 100, 30);
        tela.add(textoEmail);

        // CAMPO EMAIL
        JTextField campoEmail = new JTextField();
        campoEmail.setBounds(120, 40, 150, 30);
        tela.add(campoEmail);

        // TEXTO SENHA
        JLabel textoSenha = new JLabel("Senha:");
        textoSenha.setBounds(50, 80, 100, 30);
        tela.add(textoSenha);

        // CAMPO SENHA
        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(120, 80, 150, 30);
        tela.add(campoSenha);

        // BOTÃO LOGIN
        JButton botaoLogin = new JButton("Login");
        botaoLogin.setBounds(50, 140, 100, 30);
        tela.add(botaoLogin);

        // BOTÃO LIMPAR
        JButton botaoLimpar = new JButton("Limpar");
        botaoLimpar.setBounds(170, 140, 100, 30);
        tela.add(botaoLimpar);

        // AÇÃO DO BOTÃO LOGIN
        botaoLogin.addActionListener(e -> {

            // Pegando o texto digitado
            String email = campoEmail.getText();
            String senha = new String(campoSenha.getPassword());

            // Verificando se os campos estão vazios
            if (email.isEmpty() || senha.isEmpty()) {

                JOptionPane.showMessageDialog(null,
                        "Preencha todos os campos!");

            }

            // Verificando login correto
            else if (email.equals("admin@senai.com")
                    && senha.equals("123456")) {

                JOptionPane.showMessageDialog(null,
                        "Login realizado com sucesso!");

            }

            // Login errado
            else {

                JOptionPane.showMessageDialog(null,
                        "E-mail ou senha incorretos!");

            }

        });

        // AÇÃO DO BOTÃO LIMPAR
        botaoLimpar.addActionListener(e -> {

            campoEmail.setText("");
            campoSenha.setText("");

        });

        // Deixa a janela visível
        tela.setVisible(true);

    }
}
