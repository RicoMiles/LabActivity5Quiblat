package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        JFrame window = new LeapYearGUI("Leap Year Checker");
        window.setVisible(true);
        window.setLocationRelativeTo(null);

    }
    public LeapYearGUI(String title){
        super(title);
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int year = (int) Double.parseDouble(tfYear.getText());
                if(year % 4 == 0){
                    JOptionPane.showMessageDialog(null,"Leap year");
                }else{
                    JOptionPane.showMessageDialog(null,"Not a leap year");
                }
            }
        });
    }

}
