import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(1048,540);
        frame.add(new Board());
        frame.setVisible(true);
    }
}

//Shafiullah Raihan -> C191092
