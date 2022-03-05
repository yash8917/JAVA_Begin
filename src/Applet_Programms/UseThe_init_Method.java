package Applet_Programms;
import java.applet.*;
import java.awt.Graphics;

public class UseThe_init_Method extends Applet {
    public void init(){
      resize(200,200);
    }
    public void paint(Graphics g){
        g.drawString("Hello World!",200,200);
    }
}
