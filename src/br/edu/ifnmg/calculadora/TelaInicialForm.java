package br.edu.ifnmg.calculadora;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaInicialForm extends JFrame implements ActionListener {

    private JPanel pnlPrincipal;
    private JLabel lblNumero1;
    private JLabel lblNumero2;
    private JLabel lblResultado;
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JButton btnSomar;

    public TelaInicialForm() {
        this.iniciarComponentes();
    }

    private void iniciarComponentes() {
        //Instancia objeto/componentes
        pnlPrincipal = new JPanel();
        lblNumero1 = new JLabel("Número 1: ");
        lblNumero2 = new JLabel("Número 2: ");
        lblResultado = new JLabel("Resultado: 0");
        txtNumero1 = new JTextField("0", 10);
        txtNumero2 = new JTextField("0", 10);
        btnSomar = new JButton("Somar");

        //Adiciona componentes na tela
        pnlPrincipal.add(lblNumero1);
        pnlPrincipal.add(txtNumero1);
        pnlPrincipal.add(lblNumero2);
        pnlPrincipal.add(txtNumero2);
        pnlPrincipal.add(btnSomar);
        pnlPrincipal.add(lblResultado);
        this.add(pnlPrincipal);

        //Define título
        this.setTitle("Calculadora");

        //Define tamanho da janela
        this.setSize(800, 600);

        //Define sair como operaçao padrao do fechar janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnSomar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String numero1String = txtNumero1.getText();
        String numero2String = txtNumero2.getText();

        int numero1 = Integer.parseInt(numero1String);
        int numero2 = Integer.parseInt(numero2String);

        int resultado = numero1 + numero2;

        lblResultado.setText("Resultado: " + resultado);

        if (resultado < 0) {
            lblResultado.setForeground(Color.RED);
        } else {
            lblResultado.setForeground(Color.BLACK);
        }
    }

    public static void main(String[] parametros) {
        TelaInicialForm tela = new TelaInicialForm();
        tela.setVisible(true);
    }
}