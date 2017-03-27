import java.util.ArrayList;
import java.util.Random;

public class CharFinder {

    // arraylist av chars
    ArrayList<Character> chars;

    // tom konstruktør
    public CharFinder(){
        // initialiserer listen
        chars = new ArrayList<>();
        // hjelpe metode for å fylle listen
        generateStandardText();
    }

    private void generateStandardText(){
        // random er en del av java.util, slik som arraylist
        // hjelper oss med å lage tilfeldige verdier
        // har mange gode metoder og anbefaler å ta en titt på dokumentasjonen.
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            // husk fra TK at alle tegn har en decimal verdi i symboltabeller
            // vi utnytter dette til å legge til et tilfeldig tall mellom
            // 0 og 26 for å ha alle små bokstaver i det engelske alfabet

            // Random.nextInt(int upperBound) gir oss en verdi fra null opptil upperBound(ikke inkludert)
            chars.add((char)(r.nextInt(26) + 'a')); // a + 26 = z
        }
    }

    // teller antall ganger vi finner inputChar i listen og returerer antallet
    public int countOccurences(char inputChar){
        int counter = 0;

        for (char currentChar : chars) {
            if(currentChar == inputChar) counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        CharFinder finder = new CharFinder();

        // skriver ut alle ganger vi finner en a
        // merk at siden vi bruker random kan utfallet bli annerledes fra gang til gang
        System.out.println(finder.countOccurences('z'));
    }
}
