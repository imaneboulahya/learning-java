import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le numero du mois (1-12) : ");
        int mois = sc.nextInt();

        switch (mois) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Ce mois contient 31 jours.");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Ce mois contient 30 jours.");
                break;

            case 2:
                System.out.println("Ce mois contient 28 jours (29 les annees bissextiles).");
                break;

            default:
                System.out.println("Numero de mois invalide.");
        }

        sc.close();
    }
}
