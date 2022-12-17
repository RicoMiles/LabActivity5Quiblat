package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;
    public static void main(String[] args){
        JFrame window = new JFrame("Leap Year Checker");
        window.setVisible(true);
    }
    public LeapYearGUI(String title){
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean flag = true;
                int year = 0;
                year = (int) Double.parseDouble(tfYear.getText());
                if(year % 4 == 0){
                    JOptionPane.showMessageDialog(null,"Leap year");
                }else{
                    JOptionPane.showMessageDialog(null,"Not a leap year");
                }
            }
        });
    }


}
