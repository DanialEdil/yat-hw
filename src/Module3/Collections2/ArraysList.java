package Module3.Collections2;

import java.util.*;

public class ArraysList {

    static List<String> flowerList = Arrays.asList("Rose", "Pion", "White Rose");

    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        fivethTask();
        sixthTask();
        seventhTask();
        eightTask();
        nineTask();
        tenTask();
        elevenTask();
        twelveTask();
        thirteenTask();
        fourteen();
        fifteen();
    }


    public static void firstTask() {
        Collection<String> flowerList = new ArrayList<>();
        flowerList.add("Rose");
        flowerList.add("Pion");
        flowerList.add("White Rose");
        System.out.println(flowerList);
    }

    public static void secondTask() {
        flowerList.forEach(System.out::println);
    }

    public static void thirdTask() {
        flowerList.addFirst("Hrizantema");
        System.out.println(flowerList);
    }

    public static void fourthTask() {
        System.out.println(flowerList.get(0));
    }

    public static void fivethTask() {
        flowerList.set(0, "Sunflower");
        System.out.println(flowerList);
    }

    public static void sixthTask() {
        flowerList.remove(2);
        System.out.println(flowerList);
    }

    public static void seventhTask() {
        flowerList.remove(2);
        System.out.println(flowerList);
    }

    public static void eightTask() {
        Collections.sort(flowerList);
        System.out.println(flowerList);
    }

    public static void nineTask() {
        List<String> copyFlower = new ArrayList<>();
        Collections.copy(copyFlower, flowerList);
        System.out.println(copyFlower);
    }

    public static void tenTask() {
        Collections.shuffle(flowerList);
        System.out.println(flowerList);
    }

    public static void elevenTask() {
        flowerList.reversed();
        System.out.println(flowerList);
    }

    public static void twelveTask() {
        System.out.println(flowerList.subList(0, 3));
    }

    public static void thirteenTask() {
        List<String> flowerSecond = Arrays.asList("Roses", "Pion");
        flowerSecond.retainAll(flowerList);
        System.out.println(flowerSecond);
    }

    public static void fourteen() {
        Collections.swap(flowerList, 0, 2);
        System.out.println(flowerList);
    }

    public static void fifteen() {
        Collections.disjoint(flowerList, Arrays.asList("Lilies"));
        System.out.println(flowerList);
    }
}
