import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        1 - Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        X, se for o caso.
        */

        int valorDeX;

        System.out.println("Informe um número inteiro: ");
        valorDeX = sc.nextInt();

        for (int i = 1; i <= valorDeX; i++ ) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
           
        }

        /*
        2 - Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
        */

        int valorDeN;

        System.out.println("Infome um número de vezes que quer digitar valores de 1 a infinito: ");
        valorDeN = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i=0; i < valorDeN; i++) {
            int X = sc.nextInt();
            if (X >= 10 && X <= 20) {
                in = in + 1;
            } else {
                out = out + 1; 
            }
        }

        System.out.println("in " + in);
        System.out.println("out " + out);


        /*
        3 - Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
        de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
        conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
        peso 5.
        */

        int testes;

        System.out.println("Digite o número de testes que quer fazer: ");
        testes = sc.nextInt();

        double primeiroValor, segundoValor, terceiroValor, somaValores, somaResultado;

        for (int i = 0; i < testes; i++) {
            primeiroValor = sc.nextDouble();
            segundoValor = sc.nextDouble();
            terceiroValor = sc.nextDouble();

            somaValores = (double) (primeiroValor * 2) + (segundoValor * 3) + (terceiroValor * 5);
            somaResultado = (double) somaValores / 10;

            System.out.printf("O resultado do teste foi: %.2f\n", somaResultado);
        }

        
        /*
        4 - Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
        */

        int numeroDePares;

        System.out.println("Digite o número de testes de pares que deseja realizar: ");
        numeroDePares = sc.nextInt();

        for (int i = 0; i < numeroDePares; i++) {
            double numeroUm = sc.nextDouble();
            double numeroDois = sc.nextDouble();

            double divisaoNumeros = numeroUm / numeroDois;
            if (numeroDois == 0) {
                System.out.println("Divisão Impossível!");
            } else {
                System.out.println("Resultado da divisão foi de: " + divisaoNumeros);
            }
        }


        /*
        5 - Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        Lembrando que, por definição, fatorial de 0 é 1.
        */

        int valorNumero, fat;

        System.out.println("Indique um número: ");
        valorNumero = sc.nextInt();

        fat = 1;

        for (int i = 1; i < valorNumero; i++ ) {
            fat = fat * 1;
        }

        System.out.println(fat);


        sc.close();
    }
}
