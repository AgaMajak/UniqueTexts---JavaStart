import java.util.Scanner;

public class TextCompare {

    public static void compareTextsFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("START:");
        String textA = scan.nextLine();
        String textB = scan.nextLine();
        if (textA.equals(textB)) {
            System.out.println("KONIEC");
        } else
            for (int i = 1; i > 0; i++) {
                String textTemp = scan.nextLine();
                if (textTemp.equals(textB)) {
                    System.out.println("KONIEC");
                    break;
                } else
                    textB = textTemp;
            }
    }
}
