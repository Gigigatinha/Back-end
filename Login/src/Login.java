import javax.swing.*;

public class Login {

    public static void main(String[] args) {

        JFrame tela = new JFrame();

        tela.setTitle("Tela de Login");

        tela.setSize(350, 250);

        tela.setLocationRelativeTo(null);

        tela.setLayout(null);

        JLabel textoEmail = new JLabel("E-mail:");
        textoEmail.setBounds(50, 40, 100, 30);
        tela.add(textoEmail);

        JTextField campoEmail = new JTextField();
        campoEmail.setBounds(120, 40, 150, 30);
        tela.add(campoEmail);

        JLabel textoSenha = new JLabel("Senha:");
        textoSenha.setBounds(50, 80, 100, 30);
        tela.add(textoSenha);

        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(120, 80, 150, 30);
        tela.add(campoSenha);

        JButton botaoLogin = new JButton("Login");
        botaoLogin.setBounds(50, 140, 100, 30);
        tela.add(botaoLogin);

        JButton botaoLimpar = new JButton("Limpar");
        botaoLimpar.setBounds(170, 140, 100, 30);
        tela.add(botaoLimpar);

        botaoLogin.addActionListener(e -> {

            String email = campoEmail.getText();
            String senha = new String(campoSenha.getPassword());

            if (email.isEmpty() || senha.isEmpty()) {

                JOptionPane.showMessageDialog(null,
                        "Preencha todos os campos!");
            }
            else if (email.equals("admin@senai.com")
                    && senha.equals("123456")) {

                JOptionPane.showMessageDialog(null,
                        "Login realizado com sucesso!");
            }
            else {

                JOptionPane.showMessageDialog(null,
                        "E-mail ou senha incorretos!");
            }

        });
        botaoLimpar.addActionListener(e -> {

            campoEmail.setText("");
            campoSenha.setText("");
        });
        tela.setVisible(true);
    }
}
