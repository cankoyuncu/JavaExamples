import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ArrayList numbers = new ArrayList();
        numbers.add(3);
        numbers.add(5);
        numbers.add("Istanbul");
        System.out.println(numbers.size());
        System.out.println(numbers.get(2));
        numbers.set(0,100);
        System.out.println(numbers.get(0));
        numbers.remove(1); //remove sonrası dizi sola kaydı.
        System.out.println(numbers.get(1));
//        numbers.clear(); //hepsini siler.

        for(Object i:numbers){
            System.out.println(i);
        }
    }
}