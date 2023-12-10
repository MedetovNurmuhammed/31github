import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите a:");
        Scanner scanner1 = new Scanner(System.in);
        int [] h = new int[]{1,33,45,67,5};
       int a = scanner1.nextInt();;
        System.out.println("Введите b:");
        int b = scanner1.nextInt();
koboituu(a,b);
koshuu(a,b);
array(h);
            }
            public static void koshuu(int a,int b){
        int c = a+b;
                System.out.println(a+"+"+b+"="+c);

        }
        public static void koboituu(int a,int b){
        int c = a*b;
            System.out.println(a+"*"+b+"="+c);
        }
        public static void array(int[] array){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < 10 ; j++) {


               int c =  array[i]*j;
                System.out.println( array[i]+"*"+i+"="+c);

            }}
        }
}
