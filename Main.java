import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int senha;
        Scanner sc = new Scanner(System.in);
        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido");
    }
}
