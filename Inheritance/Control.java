import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Control extends JFrame {

    // JPanel
    JPanel pnlButton = new JPanel();
    // Buttons
    JButton btnAddFlight = new JButton("Add Flight");

    public Control() {
        //JFrame layout
        this.setLayout(null);

        //JPanel layout
        pnlButton.setLayout(null);

        //Adding to JFrame
        pnlButton.add(btnAddFlight);
        add(pnlButton);

        // postioning
        pnlButton.setLocation(0,0);
        
        
        // FlightInfo setbounds
        btnAddFlight.setBounds(60, 400, 220, 30);

        // JPanel bounds
        pnlButton.setBounds(800, 800, 200, 100);


        // Adding to JFrame
        pnlButton.add(btnAddFlight);
        add(pnlButton);

        // JFrame properties
        setSize(400, 400);
        setBackground(Color.BLACK);
        setTitle("Air Traffic Control");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    public void client(){
        new Control();
    }
}