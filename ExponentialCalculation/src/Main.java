import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number,exponential,result=1;
        System.out.print("Üssü alınacak sayı :");
        number=scan.nextInt();
        System.out.print("üs olacak sayı :");
        exponential=scan.nextInt();

        for(int i=1;i<=exponential;i++){
            result*=number;
        }
        System.out.println(number+" üssü"+exponential+" eşittir : "+result);
    }
}