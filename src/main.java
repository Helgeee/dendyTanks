import javax.swing.*;
import java.awt.*;

public class main  extends JPanel{

    public static void main(String[] args) {
        JFrame frame  = new JFrame("Dendy Tanks");
        frame.setMinimumSize(new Dimension(576,576));
        frame.setLocation(0,0);
        frame.setVisible(true);
    }
    @Override
    protected  void  paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawRect(256, 256 , 64 ,64);
    }
}



