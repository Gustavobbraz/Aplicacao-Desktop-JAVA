//IMPORTANDO BIBLIOTECAS DE ESTILO
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    //CRIACAO DOS BOTOES DA CALCULADORA / VARIAVEIS
    private JPanel Calculadora;
    private JTextField txtDisplay;
    private JButton button2;
    private JButton buttonSomar;
    private JButton buttonSubtrair;
    private JButton buttonDiv;
    private JButton buttonApagarTudo;
    private JButton buttonMultplic;
    private JButton button9;
    private JButton buttonDelete;
    private JButton button8;
    private JButton button7;
    private JButton button4;
    private JButton button5;
    private JButton buttonCalcular;
    private JButton buttonVirgula;
    private JButton ButtonZero0;
    private JButton buttonZeros00;
    private JButton button3;
    private JButton button1;
    private JButton button6;
    private JButton buttonGuardarMemoria;

    double a, b, result;
    String op;

    public Calculator() {
        //INFORMA UMA ACAO PRO OBJETO
        buttonApagarTudo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
            }
        });
        //INFORMA UMA ACAO PRO OBJETO
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ENTRADA DE DADOS PELO BOTAO 7 DA CALCULADORA
                txtDisplay.setText(txtDisplay.getText() + button7.getText());
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button8.getText());
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button9.getText());
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button4.getText());
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button5.getText());
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button6.getText());
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button1.getText());
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button2.getText());
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button3.getText());
            }
        });
        buttonZeros00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + buttonZeros00.getText());
            }
        });
        ButtonZero0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + ButtonZero0.getText());
            }
        });
        buttonVirgula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + buttonVirgula.getText());
            }
        });
        buttonMultplic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "*";
                txtDisplay.setText("");

            }
        });
        buttonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
    //INFORMA A CLASSE PRINCIPAL DO PROJETO
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
