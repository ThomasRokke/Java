
public class Dog extends Canine implements Pet {
    
    int age; //the dog's age
    String name; //the dog's name
    boolean friendly; //is the dog friendly towards human
    String howToPlay; //how should you play with the dog? 
    
    public Dog(int regNummer, boolean free, String race, boolean friendly, String howToPlay) {
        super(regNummer, free, race); 
        setAge(age); 
        setName(name);
        setFriendly(friendly);
        setHowToPlay(howToPlay); 
        
    }
    
   public boolean getFriendly(){
        return friendly;
    }
    
   public void setFriendly(boolean friendly){
       
       this.friendly = friendly;
    }
    
   public String getHowToPlay(){
       return howToPlay; 
    }
    
   public void setHowToPlay(String howToPlay) {
       this.howToPlay = howToPlay; 
    }
    
   public void setAge(int age){
       this.age = age; 
    }
    
   public void setName(String name) {
       this.name = name; 
    }
    
   public int getAge(){
       return age; 
   }
   
   public String getName() {
       return name; 
    }
    
    
}