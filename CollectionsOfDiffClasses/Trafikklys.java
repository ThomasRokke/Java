public class Trafikklys{
    String lys;
    String rødt;
    String rødtGult; 
    String grønt; 
    String gult;
    int status;

    public Trafikklys(){
       lys = "";
       rødt = "rødt"; 
       rødtGult = "rødt og gult";
       grønt = "grønt";
       gult = "gult";
       status = 1; 
    }
    
    public void change() {
        status++;
        if(status == 5){
            status = 1; 
        }
    }
    
    public String getStatus(){
        switch(status){
            case 1: lys = rødt; 
            break;
            case 2: lys = rødtGult;
            break;
            case 3: lys = grønt;
            break;
            case 4: lys = gult; 
            break;
        }
        return lys; 
     
    }
    
    

}