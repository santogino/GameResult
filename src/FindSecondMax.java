import java.util.List;

public class FindSecondMax {

    public static Integer findSecondMax(List<Integer> numbers) {
        Integer max = null;
        Integer secondMax = null;

        for (Integer number : numbers) {
            if (max == null || number > max) {
                secondMax = max;
                max = number;
            } else if (secondMax == null || number > secondMax) {
                secondMax = number;
            }
        }
        return secondMax;
    }
}
