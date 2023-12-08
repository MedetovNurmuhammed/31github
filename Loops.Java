public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Введите предложение");
            String suilom = scanner.nextLine("");
            String[] slova = suilom.split();
            String akyrky = slova[slova.length - 1];
            int c = akyrky.length();
            System.out.println(c);
            System.out.println("Хотите продолжить?");
            answer = scanner1.nextLine();

        } while (answer.equals("да"));

    }}
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <10 ; j++) {
                int c= i*j;
                System.out.println(i+"*"+j+"="+c);

            }

        }
        }
}
