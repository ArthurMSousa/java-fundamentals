import java.util.Scanner; 

public class KeyCheckWh {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

        int key = sc.nextInt();

        while (key != 1472) {
            System.out.println ("Senha incorreta");
            key = sc.nextInt();
        }

        System.out.println("Acesso permitido");


      sc.close();
    }
}
