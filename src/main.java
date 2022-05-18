import com.sun.tools.javac.Main;
package funtional;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class main extends JPanel{

    int direction = 1;
    int x =256 , y = 256;

    void moveUp(){
        while (y != 0){
            y--;
        }
    }
    void moveDown(){
        while (y == 0){
            y++;
        }
    }
    public static void main(String[] args) {
        main Main = new main();
        Main.moveUp();
    }
    main() {
        JFrame frame  = new JFrame("Dendy Tanks");
        frame.setMinimumSize(new Dimension(576,576));
        frame.getContentPane().add(this);
        frame.setLocation(0,0);
        frame.setDefaultCloseOperation();
        frame.setVisible(true);
    }
    @Override
    protected  void  paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(x , y , 64 ,64);

        g.setColor(Color.GREEN);
        if(direction == 1){ //1-up 2-down 3-left 4-Right
            g.fillRect(x+20 , y , 24 ,34);
        }else if(direction == 2) {
            g.fillRect(x+20 , y+30 , 64 ,64);
        }else if(direction == 3) {
            g.fillRect(x , y+20 , 64 ,64);
        }else if(direction == 4) {
            g.fillRect(x+30 , y+20 , 64 ,64);
        }
    }
}



