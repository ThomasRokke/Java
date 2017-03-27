public class Cd{
    
    String regNr;
    String artist;
    String title;
    int year; 
    
    public Cd(){
        this("ukjent", "ukjent", "ukjent", 0);
    }
    
    public Cd(String regNr, String artist, String title, int year){
        setRegNr(regNr);
        setArtist(artist);
        setTitle(title);
        setYear(year);
    }
    
    public String toString(){
        String toString = ""+getRegNr() + " " +getArtist()+ " "+getTitle()+" "+getYear()+" "; 
        return toString;
    }
    public String getRegNr(){
        return regNr;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public void setTitle(String title) {
        this.title = title; 
    }
    
    public void setYear(int year) {
        this.year = year; 
    }
    
    
    
    
    
    
}