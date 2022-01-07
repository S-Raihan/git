import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Board extends JPanel implements ActionListener {
    Image backgroundImage;
    Car car;
    Timer time;

    public Board() {
        ImageIcon imageIcon = new ImageIcon("background.png");
        backgroundImage = imageIcon.getImage();
        car = new Car();
        addKeyListener(new AL());
        time = new Timer(5,this);
        time.start();
        setFocusable(true);



    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(backgroundImage,0,0,this);
        g.drawImage(car.carImage, car.x, 450,this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    private class AL extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            car.whenKeyPressed(e);
        }
    }
}
//Shafiullah Raihan -> C191092
