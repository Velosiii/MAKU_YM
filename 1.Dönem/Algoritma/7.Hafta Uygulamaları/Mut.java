import java.util.Scanner;

    public class Mut {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("bir sayı giriniz");
            double N = input.nextDouble();
            double mutlak = N;
            if(N < 0){
                mutlak = N * -1;
            }
            System.out.println(mutlak);
        }
    }
