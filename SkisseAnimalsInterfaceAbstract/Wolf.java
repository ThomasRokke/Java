
public class Wolf extends Canine{
    
    int age;
    String name; 
    
    
    public Wolf(int regNummer, boolean free, String race) {
        super(regNummer, free, race); 
        setAge(age); 
        setName(name);
    
        
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