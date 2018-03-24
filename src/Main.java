import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilość rzutów kostką: ");
        int thow = scanner.nextInt();
        throwDice(thow);

    }

    public static int[] throwDice(int numbersOfThrows) {
        int[] list = new int[numbersOfThrows];
        Random random = new Random();
        for (int i = 0; i < numbersOfThrows; i++) {
            int newThrow = random.nextInt(7);
            if (newThrow != 0) {
                list[i] = newThrow;
            } else {
                list[i] = 1;
            }
        }

        System.out.println("Rzucam " + list.length + " razy! Wyrzuciłem:");
        for (int i : list) {
            System.out.print(" [" + i + "] ");
        }

        return list;
    }
}
