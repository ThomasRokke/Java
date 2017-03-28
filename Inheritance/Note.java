
//Object --> Component --> Container --> Window --> Frame --> Swing
import javax.swing.*; 
import java.awt.*; 
//Finnes flere måter for å lage grafisk grensesnitt

public class Note extends JFrame {
    public Note() {
        setTitle("Huskelapp"); //Setter tittelen
        
        JTextArea tekst = new JTextArea(); 
        add(tekst);//add er en metode. Her legger vi til et tekstområde der en markør står venter
        tekst.setBackground(Color.green);
        setSize(400, 200); //Setter størrelsen på vindue 
        setVisible(true); //om den syntes eller ei. 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //hva skal skje når jeg lukker vinduet. 
                                       //^ en ferdig deklarert variabel i JFrame. 
        
    }
    
    
    
    
}