import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(4);
        numbers.add(-2);
        numbers.add(25);
        numbers.add(33);
        numbers.add(7);

        Integer secondMax = FindSecondMax.findSecondMax(numbers);

        System.out.println("Il secondo numero più alto è: " + secondMax);
    }
}