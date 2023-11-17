import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);

        System.out.println("Введите ваше предположение:");
        int attempt = new Scanner(System.in).nextInt();

        while (attempt != value) {
            if (attempt < value) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
            attempt = new Scanner(System.in).nextInt();
        }
        System.out.println("Вы угадали!");
    }
}
