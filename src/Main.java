import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        int UnknownNumber, UserNumber, TrysCount = 0;
        StringBuilder builder = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.println("ЗАДАЧА: Угадать число (от 0 до 100).");
        UnknownNumber = (int)Math.floor(Math.random() * 100);
        UserNumber = 0;
        do {
            TrysCount++;
            System.out.print("Введите ваше число: ");

            UserNumber = input.nextInt();
            builder.append(UserNumber + " ");
            if (UserNumber > UnknownNumber)
                System.out.println("Моё число меньше.");
            else if (UserNumber < UnknownNumber) System.out.println("Моё число больше.");	else System.out.println("Вы угадали!");
        } while (UserNumber != UnknownNumber);
        String string  = builder.toString();
        System.out.println(" [" +string + "]");
        System.out.println("Количество попыток: " + TrysCount);
    }
}