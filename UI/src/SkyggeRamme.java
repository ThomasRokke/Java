import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Thomas on 28.03.2017.
 */
public class SkyggeRamme extends JFrame {

    public SkyggeRamme(String frameTekst, String labelTekst, String knappTekst) {

            JFrame frame = new JFrame(frameTekst);
            JPanel panel = new JPanel();
            JLabel label = new JLabel(labelTekst);

            JButton button = new JButton(knappTekst);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JDialog d = new JDialog(frame, "Om du drar ut vinduet er du                                      ...STYGG...                                                    ..og gay", true);
                    d.setLocationRelativeTo(frame);
                    d.setVisible(true);



                }
            });
            panel.add(button);
            panel.add(label);
            panel.setBackground(Color.pink);
            frame.add(panel);

            label.setFont(new Font("Impact", Font.BOLD, 145));
            button.setFont(new Font("Impact", Font.BOLD, 40));
            //button.setBackground(Color.white);
            button.setForeground(Color.BLACK);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 600);
            frame.setVisible(true);
            frame.setLocation(200, 200);
            frame.setAlwaysOnTop(false); //Setter den alltid på topp.
            frame.getContentPane().setBackground(Color.pink);
        }


    public static void main(String [] args) {
        SkyggeRamme skyggeRamme = new SkyggeRamme("Synske Berit", "Synske Berit", "Spå meg");
    }

}
