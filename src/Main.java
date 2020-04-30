import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String textTemp;
        String textA;
        String textB;

        Scanner scan = new Scanner(System.in);
        System.out.println("START:");
        textA = scan.nextLine();
        textB = scan.nextLine();
        if (textA.equals(textB)) {
            System.out.println("KONIEC");
        } else
            for (int i = 1; i > 0; i++) {
                textTemp = scan.nextLine();
                if (textTemp.equals(textB)) {
                    System.out.println("KONIEC");
                    break;
                } else
                    textB = textTemp;
            }
    }
}