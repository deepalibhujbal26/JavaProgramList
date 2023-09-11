package Class20;

import javax.swing.*;
import java.awt.*;

public class E1Drawing {
    public static void main(String[] args) {
        JFrame frame=new JFrame();


        frame.setSize(2000,2000);
          MyCanvas c =new MyCanvas();
          frame.add(c);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
class MyCanvas extends Canvas{
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.pink);

        g.fillOval(200,200,500,500);
        g.setColor(Color.black);
        g.fillRect(800,200,500,500);

    }
}