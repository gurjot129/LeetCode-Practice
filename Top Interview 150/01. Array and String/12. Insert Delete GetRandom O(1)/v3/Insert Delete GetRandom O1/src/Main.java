import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);

        System.out.println("Added all elements: " + x.toString());

        x.remove(2);

        System.out.println("Removed element 3: " + x.toString());

    }
}