package FoodOrdering;

import LeapYear.LeapYearGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JCheckBox cSoftDrinks;
    private JCheckBox cFries;
    private JCheckBox cBurger;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private ButtonGroup rbGroup;

    public static void main(String[] args) {
        JFrame window = new FoodOrderGUI("Food Ordering System");
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
    public FoodOrderGUI(String title){
        super(title);
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        rbGroup = new ButtonGroup();
        rbGroup.add(rbNone);
        rbGroup.add(rb5);
        rbGroup.add(rb10);
        rbGroup.add(rb15);
        rbNone.setSelected(true);
        List<JCheckBox> checker = new ArrayList<>();
        checker.add(cPizza);
        checker.add(cSoftDrinks);
        checker.add(cBurger);
        checker.add(cSundae);
        checker.add(cFries);
        checker.add(cTea);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sum = 0;
                int count = 0;
                try {
                    if (cPizza.isSelected()) {
                        sum += 100;
                    }
                    if (cBurger.isSelected()) {
                        sum += 80;
                    }
                    if (cFries.isSelected()) {
                        sum += 65;
                    }
                    if (cSoftDrinks.isSelected()) {
                        sum += 55;
                    }
                    if (cTea.isSelected()) {
                        sum += 50;
                    }
                    if (cSundae.isSelected()) {
                        sum += 40;
                    }
                    if (rb5.isSelected()) {
                        sum -= (sum * 0.05);
                    } else if (rb10.isSelected()) {
                        sum -= (sum * 0.10);
                    } else if (rb15.isSelected()) {
                        sum -= (sum * 0.15);
                    }
                    for(JCheckBox x: checker){
                        if(x.isSelected()){
                            count++;
                            break;
                        }
                    }
                    if(count == 0){
                        throw new Exception();
                    }else {
                        JOptionPane.showMessageDialog(null, String.format("The total price is PHP %.2f", sum));
                    }
                }catch(Exception a){
                    JOptionPane.showMessageDialog(null,"No items selected");
                }



            }
        });

    }

}
