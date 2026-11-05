import java.util.Scanner;

public class Fak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        double N = input.nextDouble();
        double fak = 1;
        double sayi = 1;
        while(sayi <= N){
            fak *= sayi;
            sayi++;
        }
        System.out.println(fak);
    }
}