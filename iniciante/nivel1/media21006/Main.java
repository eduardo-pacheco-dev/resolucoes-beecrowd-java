package iniciante.nivel1.media21006;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.printf("MEDIA = %.1f\n", ((a * 2) + (b * 3) + (c * 5)) / 10);
    }
}
