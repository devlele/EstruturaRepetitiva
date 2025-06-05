import java.util.Scanner;

public class Cartesiaano {
    public static void main (String[] args) {
        int x, y;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0.0 && y > 0.0) {
                System.out.println("Primeiro");
            }
            else if (x < 0.0 && y > 0.0) {
                System.out.println("Segundo");
            }
            else if (x < 0.0 && y < 0.0) {
                System.out.println("Terceiro");
            }
            else {
                System.out.println("Quarto");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}
