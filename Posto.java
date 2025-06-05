import java.util.Scanner;

public class Posto {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int produto;
        int alcool = 0, gasolina = 0, diesel = 0;

        while (true) {
            produto = sc.nextInt();
            if (produto == 1) {
                alcool += 1;
            }
            else if (produto == 2) {
                gasolina += 1;
            }
            else if (produto == 3) {
                diesel += 1;
            }
            else if (produto == 4) {
                break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);
    }
}
