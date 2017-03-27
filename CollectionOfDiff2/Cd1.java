
/**
 * Write a description of class Cd1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cd1
{
    String regNr;
    String artist;
    String title;
    int year; 
    
    public Cd1(String regNr, String artist, String title, int year){
       setRegNr(regNr);
       setArtist(artist);
       setTitle(title);
       setYear(year);
    }
    
    public String toString(){
        String toString = getRegNr()+ " " + getArtist() + " " + getTitle() + " " + getYear();
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public String getArtist() {
        return artist; 
    }
    
   
    public void setRegNr(String regNr) {
        this.regNr = regNr; 
    }
    
    public String getRegNr() {
        return regNr; 
    }
        
    public void setTitle(String title) {
        this.title = title; 
    }
        
    public String getTitle() {
        return title; 
    }
    
    public void setYear(int year) {
        this.year = year; 
    }
    
    public int getYear() {
      return year;    
    }
}
