/* Calculator.java 
    Calculadora simples que soma, subtrai, multiplica
    divide, encontra raiz, o inverso e te dá um pi de graça ...
*/

/*
color theme
#f9f8f6	(249,248,246) white
#7d3564	(125,53,100) purple
#299caf	(41,156,175) light blue
#1c6d7a	(28,109,122) dark blue
#3d3d3d	(61,61,61) dark gray
#dd2d4d	(221,45,77) redish
*/

/**
 *
 * @author ron
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
// implmenta a interface ActionListener 
public class Calculator implements ActionListener {
    // atributos para os cálculos
    double number, answer;
    int calculation;
    
    JFrame frame;
    // Cria objetos dos componentes
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonPi = new JButton("\u03c0");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");
 
    Calculator() {
        prepareGUI();
        addComponents();
        addActionEvent();
    }
 
    public void prepareGUI() {
        // Configura propriedades do janela JFrame
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(300, 490);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(new Color(61,61,61));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    public void addComponents() {
        // Configura propriedades do Label
        label.setBounds(250, 0, 50, 50);
        label.setForeground(new Color(61,61,61));
        frame.add(label);
        
        // Configura propriedades do campo de texto
        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(true);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);
        
        // Configura o botão 7
        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSeven.setBackground(new Color(41,156,175));
        buttonSeven.setForeground(new Color(249,248,246));
        frame.add(buttonSeven);
        
        // Configura o botão 8
        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEight.setBackground(new Color(41,156,175));
        buttonEight.setForeground(new Color(249,248,246));
        frame.add(buttonEight);
 
        // Configura o botão 9
        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        buttonNine.setBackground(new Color(41,156,175));
        buttonNine.setForeground(new Color(249,248,246));
        frame.add(buttonNine);
 
        // Configura o botão 4
        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFour.setBackground(new Color(41,156,175));
        buttonFour.setForeground(new Color(249,248,246));
        frame.add(buttonFour);
 
       // Configura o botão 5
        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFive.setBackground(new Color(41,156,175));
        buttonFive.setForeground(new Color(249,248,246));
        frame.add(buttonFive);
 
        // Configura o botão 6
        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSix.setBackground(new Color(41,156,175));
        buttonSix.setForeground(new Color(249,248,246));
        frame.add(buttonSix);
 
        // Configura o botão 1
        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        buttonOne.setBackground(new Color(41,156,175));
        buttonOne.setForeground(new Color(249,248,246));
        frame.add(buttonOne);
 
        // Configura o botão 2
        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        buttonTwo.setBackground(new Color(41,156,175));
        buttonTwo.setForeground(new Color(249,248,246));
        frame.add(buttonTwo);
        
        // Configura o botão 3
        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        buttonThree.setBackground(new Color(41,156,175));
        buttonThree.setForeground(new Color(249,248,246));
        frame.add(buttonThree);
 
        // Configura o botão 0
        buttonZero.setBounds(10, 410, 130, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        buttonZero.setBackground(new Color(41,156,175));
        buttonZero.setForeground(new Color(249,248,246));
        frame.add(buttonZero);
        
        // Configura o botão ponto
        buttonDot.setBounds(150, 410, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDot.setBackground(new Color(28,109,122));
        buttonDot.setForeground(new Color(249,248,246));
        frame.add(buttonDot);
        
        // Configura o botão pi
        buttonPi.setBounds(10, 110, 60, 40);
        buttonPi.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPi.setBackground(new Color(164,113,146));
        buttonPi.setForeground(new Color(249,248,246));
        frame.add(buttonPi);
 
       // Configura o botão =
        buttonEqual.setBounds(220, 350, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(new Color(28,109,122));
        buttonEqual.setForeground(new Color(249,248,246));
        frame.add(buttonEqual);
 
       // Configura o botão /
        buttonDiv.setBounds(220, 110, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(new Color(28,109,122));
        buttonDiv.setForeground(new Color(249,248,246));
        frame.add(buttonDiv);
 
        // Configura o botão raiz quadrada
        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        buttonSqrt.setBackground(new Color(164,113,146));
        buttonSqrt.setForeground(new Color(249,248,246));
        frame.add(buttonSqrt);
 
        // Configura o botão x
        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(new Color(28,109,122));
        buttonMul.setForeground(new Color(249,248,246));
        frame.add(buttonMul);
 
        // Configura o botão -
        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(new Color(28,109,122));
        buttonMinus.setForeground(new Color(249,248,246));
        frame.add(buttonMinus);
        
        // Configura o botão +
        buttonPlus.setBounds(220, 290, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(new Color(28,109,122));
        buttonPlus.setForeground(new Color(249,248,246));
        frame.add(buttonPlus);
 
        // Configura o botão raiz
        buttonSquare.setBounds(80, 170, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSquare.setBackground(new Color(164,113,146));
        buttonSquare.setForeground(new Color(249,248,246));
        frame.add(buttonSquare);
 
        // Configura o botão de inverso (Reciprocal)
        buttonReciprocal.setBounds(150, 170, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        buttonReciprocal.setBackground(new Color(164,113,146));
        buttonReciprocal.setForeground(new Color(249,248,246));
        frame.add(buttonReciprocal);
 
        // Configura o botão delete
        buttonDelete.setBounds(150, 110, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(new Color(221, 45, 77));
        buttonDelete.setForeground(new Color(249,248,246));
        frame.add(buttonDelete);
 
        // Configura o botão Clear
        buttonClear.setBounds(80, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(new Color(221, 45, 77));
        buttonClear.setForeground(new Color(249,248,246));
        frame.add(buttonClear);
    }
    
    public void addActionEvent()
    {
        // Atribui o ActionListener aos botões
        buttonZero.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonPi.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonSqrt.addActionListener(this);
    }
    
    // substitui o método actionPerformed
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        
        if (source == buttonClear) {
            // limpa o texto do campo de texto e do label
            label.setText("");
            textField.setText("");
        }else if (source == buttonDelete) {
            // configura a funcionalidade de apagar caracteres (backspace)
            int length = textField.getText().length();
            int number = length - 1;
            
            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        }else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            }else {
                textField.setText(textField.getText() + "0");
            }
        }else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        }else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        }else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        }else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        }else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        }else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        }else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        }else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        }else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        }else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            }else {
                textField.setText(textField.getText() + ".");
            }
        }else if (source == buttonPlus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calculation = 1;
        }else if (source == buttonMinus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calculation = 2;
        }else if (source == buttonMul) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "x");
            calculation = 3;
        }else if (source == buttonDiv) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculation = 4;
        }else if (source == buttonPi) {
            textField.setText(textField.getText() + "3.1415926535897932");
        }else if (source == buttonSqrt) {
            number = Double.parseDouble(textField.getText());
            double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));
        }else if (source == buttonSquare) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            }else {
                textField.setText(string);
            }
            label.setText("(sqr" + str);
        }else if (source == buttonReciprocal) {
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            }else {
                textField.setText(string);
            }
        }else if (source == buttonEqual) {
            // configura funcionalidades para o botão igual (=)
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    }else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    }else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    }else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    }else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
            }
        }
    }
}
