import java.util.Arrays;

public class Print {

    public static void main(String[] args) {

        int[] age = {18, 19, 20, 21, 22, 23, 24};

        System.out.println("1st Element : " + age[0]);
        System.out.println("2nd Element : " + age[1]);
        System.out.println("3rd Element : " + age[2]);
        System.out.println("4th Element : " + age[3]);
        System.out.println("5th Element : " + age[4]);
        System.out.println("6th Element : " + age[5]);
        System.out.println("7th Element : " + age[6]);

        System.out.println(age.length);
        System.out.println(Arrays.stream(age).max());
        System.out.println(Arrays.stream(age).average());
        System.out.println(Arrays.stream(age).asDoubleStream());
        System.out.println(Arrays.stream(age).count());
        System.out.println(Arrays.stream(age).findAny());
    }
}
