import java.util.ArrayList;

// Fibonacci sekvensen er en serie med tall, hvor det neste tallet er summen av de to forekommende elementene
public class Fibonacci {

    // En arraylist som holder på fibonacci tallene
    ArrayList<Integer> fibonacciSequence;

    // Konstruktør som tar imot antall fibonacci tall vi skal lage
    Fibonacci(int order){
        // initialiserer listen slik at vi har en liste i minnet
        fibonacciSequence = new ArrayList<>();
        // hjelpe metode for å øke modularitet og leslighet
        generateFibonacciSequence(order);
    }

    // vanlig get, merk at vi ikke har set, da det kan ødelegge fib tallene
    public ArrayList<Integer> getFibonacciSequence() {
        return fibonacciSequence;
    }

    private void generateFibonacciSequence(int order) {
        // vi starter tallrekken på 1,
        // siden det ikke er to elementer, må vi legge inn det neste tallet (også 1)
        if(order > 0) fibonacciSequence.add(1);
        if(order > 1) fibonacciSequence.add(1);

        // resten av tallene er summen av de to forrige fib tallene.
        for (int i = 2; i < order; i++) {
            int newValue = fibonacciSequence.get(i - 1) + fibonacciSequence.get(i - 2);
            // siden int er signed i java (tillater både + og - verdier)
            // vil vi på et punkt få negative tall,
            // da den høyeste biten får overflow
            if(newValue < 0) return; // da går avslutter vi metoden.

            fibonacciSequence.add(newValue); // er det positivt legges det til.
        }
    }

    // hjelper å hente fib tall etter hvor de er i rekken
    public long fibByIndex(int index){
        // er index høyere enn listen eller lavere enn null,
        // får vi en array out of bounds exception,
        // altså at vi bruker en ulovlig/ikke eksisterende index.
        if(index > fibonacciSequence.size() ||  index < 0) return -1;

        // ellers returnerer vi verdien
        return fibonacciSequence.get(index);
    }

    // ArrayList sin tostring skriver verdiene på en linje med [a, b, c] format.
    // dette passer ypperlig for å vise frem fib tallene, så vi returnerer den inn her.
    public String toString(){
        return getFibonacciSequence().toString();
    }

    public static void main(String[] args) {

        Fibonacci sequence = new Fibonacci(100);
        System.out.println(sequence);
    }
}