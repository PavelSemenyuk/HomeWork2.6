import java.net.Socket;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ЗАДАЧА №1
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(5, 5, 2, 3, 4, 44, 6, 6, 66, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + ",  ");
            }
        }
        System.out.println();

        // ЗАДАЧА №2
        System.out.println("Задача 2");

        SortedSet<Integer> numsSet = new TreeSet<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                numsSet.add(nums.get(i));
            }
        }
        System.out.println(numsSet);
        System.out.println();

        // ЗАДАЧА №3
        System.out.println("Задача 3");

        List<String> textA = new LinkedList<>(List.of("один", "кот", "один", "собака", "три", "три"));
        LinkedHashSet<String> text = new LinkedHashSet<>();
        for (int i = 0; i < textA.size(); i++) {
            text.add(textA.get(i));
        }
        System.out.println(text);
        System.out.println();

        // ЗАДАЧА №4
        System.out.println("Задача 4");

        List<String> textB = new LinkedList<>(List.of("птица", "кот", "три", "три", "собака", "три", "птица"));
        for (int i = 0; i < textB.size(); i++) {
            int count = 0;
            for (int j = 0; j < textB.size(); j++) {
                if (textB.get(i).equals(textB.get(j)) && i != j) {
                    count++;
                }
            }
            System.out.println("У слова " + textB.get(i) + ", повторений  " + count);
        }
    }
}