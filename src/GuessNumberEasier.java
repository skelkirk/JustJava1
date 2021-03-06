import java.util.Random;
import java.util.Scanner;

public class GuessNumberEasier {

    final static int   MIN_RANGE_VALUE = 0;
    final static int   MAX_RANGE_VALUE = 10;
    final static int NUMBER_OF_ATTEMPTS =3;
    static Random random = new Random ();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        game(); }

    public static void game() {
        System.out.println("Угадайте число от "+ MIN_RANGE_VALUE
                + " до "+ MAX_RANGE_VALUE);
        int gamesNumber = random.nextInt(MAX_RANGE_VALUE);
        int a;  //переменная для сканера
        for (int i = 0; i < NUMBER_OF_ATTEMPTS; i++) {

            if(scanner.hasNextInt()) {
                a = scanner.nextInt();
            } else {
                System.out.println("Вы ввели неверное число");
                continue;
            }
            if (a < MIN_RANGE_VALUE || a > MAX_RANGE_VALUE) {
                System.out.println("Вы ввели  число вне диапазона значений");
            } else if (a == gamesNumber) {
                System.out.println("Вы угадали!");
                break;
            } else if (a < gamesNumber) {
                System.out.println("Введенноё число меньше загаданного");
            } else {
                System.out.println("Введённое число больше загаданного");
            }
        }
        continueOrExit();
    }
    public static void continueOrExit() {
        System.out.println("Хотите ещё? \n 1 - yes, 2 - no");
        int answer = scanner.nextInt();
        switch(answer) {
            case 1:

                game();

            case 2:
                System.out.println("Thank you for playing!");
                System.exit(0);
        }

    }



}
