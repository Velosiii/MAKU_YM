import java.util.Scanner;

public class DaireTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçap giriniz");
        double r = input.nextDouble();
        double pi = 3.14;
        double alan = pi * r * r;
        double cevre = pi * 2 * r;
        System.out.println("Alan = " + alan);
        System.out.println("Çevre = " + cevre);

    }
}
