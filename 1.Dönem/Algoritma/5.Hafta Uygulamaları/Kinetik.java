import java.util.Scanner;

public class Kinetik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hızı girin");
        double m = input.nextDouble();
        System.out.println("Kütleyi girin");
        double k = input.nextDouble();
        System.out.println("Yükseklik girin");
        double h = input.nextDouble();
        double g = 9.81;
        double Kinetik = 0.5 * m * m * k;
        double Potansiyal = g * h * k;
        double Enerji = Kinetik + Potansiyal;
        System.out.println("Kinetik = " + Kinetik);
        System.out.println("Potansiyal = " + Potansiyal);
        System.out.println("Enerji = " + Enerji);

    }
} 
//Vize hesaplayan 
//6. bölüm ilk soru üçgen alanı,6.2 dereceyiradyan ve granda çevir, 2 keanr açı üçgen alanı,6.bölümdeki ilk 15 soru