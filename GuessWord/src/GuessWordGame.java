import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessWordGame {

        final static int FAKE_WORD_LENGTH = 10;
        static Scanner scanner = new Scanner (System.in);
        static  String[] ARRAY =  {"брусника", "малина", "ежевика",
                "калина", "смородина", "арбуз", "арарат", "ежевый", "брусок", "сморозил"};

    public static void main(String[] args) {

        System.out.println("Ниже приведены слова, угадайте слово. \n"+ Arrays.toString(ARRAY));
        Random random = new Random();
        int index = random.nextInt(ARRAY.length);
        String targetWord = ARRAY[index];

        String userWord = null;

        do {
            userWord = scanner.next();
            if (isWin(userWord, targetWord)) {
                System.out.println("Вы угадали!");
                break;
            }
            System.out.println("Не угадали, но ниже подсказка совпадающих букв на тех же местах");
            hint(userWord, targetWord);
        } while (true);
    }

    public static boolean isWin(String userWord, String targetWord) {
        return userWord.equals(targetWord);
    }
    public static void hint(String userWord, String targetWord) {
        for (int i = 0; i < FAKE_WORD_LENGTH; i++) {
            char chr = '#';
            if (i < userWord.length() && i < targetWord.length() && userWord.charAt(i)
                    == targetWord.charAt(i)) {
                chr = userWord.charAt(i);
            }
            System.out.print(chr);
        }
        System.out.println();
    }
}
