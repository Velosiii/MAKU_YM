import java.util.Scanner;

public class Ort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz");
        double V = input.nextDouble();
        System.out.println("Final notunuzu giriniz");
        double F = input.nextDouble();
        double Vx = V*0.4;
        double Fx = F*0.6;
        double ort = (Vx + Fx);
        System.out.println("Ortalamanız " + ort);
        if(ort >= 50){
            System.out.println("Geçtiniz");
        }else{
            System.out.println("Kaldınız");
        }
    }
}