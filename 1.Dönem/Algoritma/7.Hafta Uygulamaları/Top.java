import java.util.Scanner;

public class Top {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int N = input.nextInt();
        int sum = 0 ;
        int sayı = 1;
        while(sayı <= N){
            sum += sayı;  //sum += sayı;  sum = sum + sayı;
            sayı++; //sayı = sayı + 1; 
        }
        System.out.println(sum);

    }
}
