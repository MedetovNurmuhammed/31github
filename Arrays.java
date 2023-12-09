import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length ; i++) {
            a [i] = random.nextInt(1,100);
            System.out.print(a[i]+", ");
        }

        System.out.println("Введите число =");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int index = 0;
        boolean isTrue = false;
        for (int i = 0; i < a.length; i++) {
            if (b==a[i]) {
                index = i;
                isTrue = true;
                break;
            }
        }
        System.out.println(isTrue ?" индекс =" + index : "Мындай массив сандын ичинде жок!" );

    }
}
