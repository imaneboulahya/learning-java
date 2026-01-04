import java.util.Scanner;
public class Ex2 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez un nombre : ");
        int nbr = sc.nextInt();
        if (nbr % 2 == 0){
            System.out.println("pair");
        }
        else {
            System.out.println("impair");
        }
    }
}
