import java.util.Scanner;

public class ungen {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen bir kenar giriniz");
    int k1 = input.nextInt();
    System.out.println("Lütfen bir kenar giriniz");
    int k2 = input.nextInt();
    double hipo = Math.sqrt(k1 * k1 + k2 *k2);
    System.out.println("Hipo = " + hipo);
    }
}
