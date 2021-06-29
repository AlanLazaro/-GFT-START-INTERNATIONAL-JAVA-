import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Random gerador = new Random();
        Scanner s = new Scanner(System.in);


        while (true){
            int numero = gerador.nextInt(10);
            System.out.println("Digite um numero: ");
            int numero2 = s.nextInt();
            System.out.println("numero sorteado: " + numero);

            if(numero == numero2)
                break;
        }
    }
}
