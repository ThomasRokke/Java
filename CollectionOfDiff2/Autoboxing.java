
/**
 * Write a description of class Autoboxing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Autoboxing
{
    public void auto() {
        ArrayList<Integer> box = new ArrayList<Integer> ();
        box.add(2);
        box.add(3);
        box.add(4);

        int tall = box.get(0);

        for(int i : box) {
            System.out.println(i);
        }
    }

}
