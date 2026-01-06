import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        int[] tab = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("entrez un indice : ");
                int i =  sc.nextInt();
                System.out.println(tab[i]);
                break;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("indice invalida");
            }
        }
    }
}
