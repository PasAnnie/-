import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab14PAS extends Frame{
    Label ForA,ForB,ForSum;
    Lab14PAS(){
        setTitle("Sum");
        setLayout(null);
        setSize(400, 300);

        ForA = new Label("a");
        ForB = new Label("b");
        ForSum = new Label("sum");
        ForA.setBounds(25,55,30,20);
        ForB.setBounds(25,85,30,20);
        ForSum.setBounds(25,115,30,20);

        TextField a=new TextField();
        TextField b=new TextField();
        TextField sum=new TextField();
        a.setBounds(65,55,50,20);
        b.setBounds(65,85,50,20);
        sum.setBounds(65,115,50,20);

        Button calc = new Button("Calculate");
        Button clear = new Button("Clear");
        calc.setBounds(40,140,70,30);
        clear.setBounds(40,170,70,30);

        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double aNum = Double.parseDouble(a.getText());
                double bNum = Double.parseDouble(b.getText());
                sum.setText(Double.toString(aNum+bNum));
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.setText("");
                b.setText("");
                sum.setText("");
            }
        });
        add(calc);
        add(clear);
        add(a);
        add(b);
        add(sum);
        setVisible(true);
    }
    public static void main(String[]args){
        new Lab14PAS();
    }
}

