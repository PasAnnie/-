import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Lab15PAS extends JFrame{
    Lab15PAS(){
        setBounds(600,200,300,200);
        JButton plus = new JButton("+1");
        JButton min = new JButton("-1");
        JTextField total = new JTextField("0");
        JLabel label = new JLabel("Number");
        plus.setBounds(130,20,50,20);
        min.setBounds(130,40,50,20);
        total.setBounds(70,20,50,20);
        label.setBounds(20,20,30,20);
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = Integer.parseInt(total.getText());
                if(i<3)i++;
                total.setText(Integer.toString(i));
            }
        });
        min.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = Integer.parseInt(total.getText());
                if(i>-5)i--;
                total.setText(Integer.toString(i));
            }
        });
        add(plus);
        add(min);
        add(total);
        add(label);
        setVisible(true);

    }
    public static void main(String[]args){
    new Lab15PAS();}
}
