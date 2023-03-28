import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class MovingObject extends JFrame implements KeyListener {

    Canvas canvas;
    int x, y;
    public MovingObject() {


        this.setTitle("moving object");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setSize(640, 480);
        x = 640/2; y = 480/2;
        canvas = new Canvas(){
            @Override
            public void paint(Graphics g) {

                g.setColor(Color.RED);
                g.fillOval(x, y, 5, 5);
            }
        };


        //TODO add keyListener to canvas
        canvas.addKeyListener(this);
        //TODO add canvas to the frame
        this.add(canvas);
        this.setVisible(true);
    }



    @Override
    public void keyPressed(KeyEvent e) {
        
      /*TODO e.getKeyCode()’u kullanarak basılan keyin ne olduğunu belirleyiniz. 
      Mesela e.getKeyCode() eğer KeyEvent.VK_ENTER ise basılan key enter olmuş oluyor. 
      */
        if(e.getKeyCode()== KeyEvent.VK_UP){
            y--;

        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            y++;


        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            x--;


        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            x++;


        }
        canvas.repaint();
    }
    @Override
    public void keyTyped(KeyEvent e) {


    }
    @Override
    public void keyReleased(KeyEvent e) {


    }



}