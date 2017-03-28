import javax.swing.*;
import java.awt.*;

/**
 * Created by Thomas on 28.03.2017.
 */
public class Note extends JFrame {

    public Note(){
        setTitle("Handleliste");
        JTextArea tekstfelt = new JTextArea();
        add(tekstfelt);
        tekstfelt.setBackground(Color.RED);

        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String [] args){
        Note note = new Note();
    }

}
