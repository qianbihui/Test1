import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorld extends Applet{
    public void paint(Graphics g){
        //Display "Hello world!"
        g.drawString("Hello world!", 50,25);
    }
}