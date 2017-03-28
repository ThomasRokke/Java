import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class Boks{
    
    JPanel pnlButton = new JPanel();
    JButton btnAddFlight = new JButton("Add Flight");
   
    
    public Boks(){
        createAndShowUI(); 
    }
    
    private static void createAndShowUI(){
        JFrame frame = new JFrame("Min Boks"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel("");
        label.setPreferredSize(new Dimension(600,300));
        frame.getContentPane().add(label, BorderLayout.CENTER); 
        
        frame.pack(); 
        frame.setVisible(true); 
        
        
        this.setLayout(null); 
        
        pnlButon.setLayout(null); 
        
        pnlButton.add(btnAddFlight);
        add(pnlButton);
        
        pnlButton.setLocation(0,0); 
        
    }
    
    
    
}