import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int maior=0, menor=0, soma=0, mais10=0, mais50=0;


        int numeros[] = new int[10];

        for(int i = 0; i < 10; i ++){
            numeros[i] = s.nextInt();
            if(i == 0) {
                maior = numeros[i];
                menor = numeros[i];
                if (numeros[i] > 50) {
                    mais10 += 1;
                    mais50 += 1;
                } else if (numeros[i] > 10) {
                    mais10 += 1;
                }
            }

            else{
                if (numeros[i] > 50) {
                    mais10 += 1;
                    mais50 += 1;
                } else if (numeros[i] > 10) {
                    mais10 += 1;
                }

                if(maior < numeros[i])
                    maior = numeros[i];
                if (menor > numeros[i])
                    menor = numeros[i];
            }
            soma += numeros[i];
        }


        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);
        System.out.println("A Media é: " + soma/10);
        System.out.println("Foram digitas " + mais10 + " numeros maiores que 10");
        for(int j =0; j < 10; j ++)
            if(numeros[j] > 10)
                System.out.print(numeros[j]+ " ");
        System.out.println("");
        System.out.println("Foram digitas " + mais50 + " numeros maiores que 50");
            for(int j =0; j < 10; j ++)
                if(numeros[j] > 50)
                    System.out.print(numeros[j] + " ");
    }
}
