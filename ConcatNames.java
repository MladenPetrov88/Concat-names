import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        String secondName = scanner.next();
        String sign = scanner.next();

        System.out.printf("%s%s%s", firstName, sign, secondName);

    }
}
