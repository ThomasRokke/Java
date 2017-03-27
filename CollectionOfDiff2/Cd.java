
/**
 * This i class that simulates a CD
 * 
 * @author Thomas Røkke
 * @version 30.11.2016
 */
public class Cd
{
    String regNr;
    String artist;
    String title;
    int year; 

    public Cd() {
        regNr = "";
        artist = "";
        title = ""; 
        year = 0; 
    }
    
    public String toString() {
        String toString = getRegNr() + " "+ getArtist()+" " + getTitle() +" "+ getYear(); 
        return toString; 
    }
    
    public Cd(String regNr, String artist, String title, int year) {
        setRegnr(regNr);
        setArtist(artist); 
        setTitle(title);
        setYear(year);
    }

    public void setRegnr(String regNr) {
        this.regNr = regNr;
    }

    public String getRegNr() {
        return regNr; 
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
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

    
    