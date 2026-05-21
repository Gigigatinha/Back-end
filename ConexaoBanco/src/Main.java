import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

void main() {

    JFrame tela = new JFrame("Cadastro para Adoção");
    tela.setSize(500, 700);
    tela.setLayout(null);

    JLabel labelNome = new JLabel("Nome");
    labelNome.setBounds(20, 50, 150, 40);
    tela.add(labelNome);

    JTextField textNome = new JTextField();
    textNome.setBounds(20, 80, 250, 40);
    tela.add(textNome);

    JLabel labelIdade = new JLabel("Idade");
    labelIdade.setBounds(20, 120, 150, 40);
    tela.add(labelIdade);

    JTextField textIdade = new JTextField();
    textIdade.setBounds(20, 150, 250, 40);
    tela.add(textIdade);

    JComboBox<Tipo> textTipo = new JComboBox(Tipo.values());
    textTipo.setBounds(20, 220, 250, 40);
    tela.add(textTipo);

    JLabel labelendereco = new JLabel("Endereco");
    labelendereco.setBounds(20, 260, 150, 40);
    tela.add(labelendereco);

    JTextField textEndereco = new JTextField();
    textEndereco.setBounds(20, 290, 250, 40);
    tela.add(textEndereco);

    JLabel labelTelefone = new JLabel("Telefone");
    labelTelefone.setBounds(20, 320, 150, 40);
    tela.add(labelTelefone);

    JTextField textTelefone = new JTextField();
    textTelefone.setBounds(20, 350, 250, 40);
    tela.add(textTelefone);

    JLabel labelraca = new JLabel("Raça (se houver)");
    labelraca.setBounds(20, 390, 150, 40);
    tela.add(labelraca);

    JTextField textRaca = new JTextField();
    textRaca.setBounds(20, 420, 250, 40);
    tela.add(textRaca);

    JButton enviar = new JButton("Enviar");
    enviar.setBounds(80, 500, 150, 40);
    tela.add(enviar);

    enviar.addActionListener(e -> {

        String nome = textNome.getText();
        String idade = textIdade.getText();
        String tipo = textTipo.getSelectedItem().toString();
        String raca = textRaca.getText();
        String endereco = textEndereco.getText();
        String telefone = textTelefone.getText();

        String sql = "INSERT INTO pets(nome, idade, tipo, raca, endereco, telefone) VALUE (?,?,?,?,?,?)";

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, nome);
            ps.setString(2, idade);
            ps.setString(3, tipo);
            ps.setString(4, endereco);
            ps.setString(5, telefone);
            ps.setString(6, raca);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!!");
            ps.close();
            conexao.close();

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    });


    tela.setVisible(true);


}

