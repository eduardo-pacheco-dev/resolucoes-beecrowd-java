package iniciante.nivel1.diferenca1007;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int calc = ((a * b) - (c * d));

        System.out.println("DIFERENCA = " + calc);
    }
}
