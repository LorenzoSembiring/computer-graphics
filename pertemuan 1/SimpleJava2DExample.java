import java.awt.*;
import java.lang.Math;

public class SimpleJava2DExample extends Frame {
    SimpleJava2DExample(){
        addWindowListener(new MyFinishWindow());
    }
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawString("Hello", 30, 100);

        for(int i = 0; i < 8; i++) {
            g2d.drawOval(200 + (50 - i*5*5), 50, 50, 50);
            System.out.println(200 + (50 - Math.pow(2,i)));
 
        }
    }
    public static void main(String[] args) {
        SimpleJava2DExample f = new SimpleJava2DExample();
        f.setTitle("The first java 2d");
        f.setSize(350,80);
        f.setVisible(true);
    }
}