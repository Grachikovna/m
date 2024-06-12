import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
    }

    public static void task5() {
        System.out.println("task 5");
        int value = 33;
        changeValue(value);
        System.out.println(value);

    }

    private static void changeValue(int value) {
        value = 22;
        System.out.println("value = " + value);
    }

    public static void task6() {
        System.out.println("task 6");
        Integer value = 33;
        changeValueInteger(value);
        System.out.println(value);
    }

    private static void changeValueInteger(Integer value) {
        value = 22;
        System.out.println("value = " + value);
    }

    public static void task7() {
        System.out.println("task 7");
        Integer[] value = new Integer[]{3, 4};
        changeValue(value);
        System.out.println(Arrays.toString(value));
    }

    private static void changeValue(Integer[] value) {
        value = new Integer[]{1, 2};
        System.out.println(Arrays.toString(value));
    }

    public static void task8() {
        System.out.println("task 8");
        Integer[] value = new Integer[]{99};
        changeValue(value);
        System.out.println(Arrays.toString(value));
    }

}


