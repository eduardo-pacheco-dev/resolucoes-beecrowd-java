package iniciante.nivel1.consumo1014;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        double gas = scanner.nextDouble();

        System.out.printf("%.3f km/l\n", distance / gas);
    }
}
