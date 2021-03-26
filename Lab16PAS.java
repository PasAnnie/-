import javax.swing.*;
import java.awt.*;
public class Lab16PAS extends Canvas{
    public static void main(String[]args){
        JFrame frame = new JFrame("Lab 16");
        Canvas canvas = new Lab16PAS();
        canvas.setSize(600,400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        g.drawLine(25,175,125,75);
        g.drawLine(150,100,150,75);
        g.drawLine(175,125,175,75);
        g.drawLine(225,175,125,75);
        g.drawLine(150,75,175,75);

        g.drawLine(25,300,425,300);
        g.drawLine(338,248,338,300);
        g.drawLine(360,248,360,300);

        g.drawArc(275,50,150,200,-80,340);
        g.drawRect(50,150,150,150);
        g.drawRect(75,200,50,50);

    }
}
