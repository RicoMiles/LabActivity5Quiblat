package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField lblResult;

    public static void main(String[] args) {
        JFrame window = new SimpleCalcGUI("Simple Calculator");
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
    public SimpleCalcGUI(String title){
        super(title);
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(tfNumber1.getText());
                double num2 = Double.parseDouble(tfNumber2.getText());
                double result = 0;
                String op = cbOperations.getSelectedItem().toString();
                switch(op){
                    case "+":
                        result = num1 + num2;
                        lblResult.setText(String.valueOf(String.format("%.0f",result)));
                        break;
                    case "-":
                        result = num1 - num2;
                        lblResult.setText(String.valueOf(String.format("%.0f",result)));
                        break;
                    case "*":
                        result = num1 * num2;
                        lblResult.setText(String.valueOf(String.format("%.2f",result)));
                        break;
                    case "/":
                        result = num1 / num2;
                        lblResult.setText(String.valueOf(String.format("%.2f",result)));
                        break;
                }
            }
        });

    }
}
