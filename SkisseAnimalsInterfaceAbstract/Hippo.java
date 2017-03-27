
public class Hippo extends Animal{
    
        int weigth; 
        boolean dangerous; 
    
    public Hippo(int regNummer, boolean free, int weigth, boolean dangerous) {
        super(regNummer, free); 
        setWeigth(weigth);
        setDangerous(dangerous);
        
    }
    
    public void setWeigth(int weigth) {
        this.weigth = weigth; 
    }
    
    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous; 
    }
    
    public int getWeigth() {
        return weigth; 
    }
    
    public boolean getDangerous(){
        return dangerous; 
    }
}