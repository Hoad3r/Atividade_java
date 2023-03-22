import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Seja bem-vindo a sua calculadora\n [1] Soma \n [2] Subtração \n [3] Divisão \n [4] Multiplicação \n [5] Potenciação \n [6] Raiz Cúbica  \n [7] Raiz Quadrada ");
        int opção = scanner.nextInt();
        if (opção < 5) {
            System.out.println("Digite o numero");
            int x = scanner.nextInt();
            System.out.println("Digite o outro numero");
            int y = scanner.nextInt();
            switch (opção) {
                case 1: {
                    int soma = x + y;
                    System.out.println(soma);
                }
                case 2: {
                    int subtração = x - y;
                    System.out.println(subtração);
                }
                case 3: {
                    int divisão = x / y;
                    System.out.println(divisão);
                }
                case 4: {
                    int multi = x * y;
                    System.out.println(multi);
                }
            }
        } else if (opção >= 5) {
            if (opção == 5) {
                System.out.println("Digite o numero a ser elevado");
                int x = scanner.nextInt();
                System.out.println("Digite a quantidade de vezes a ser elevado");
                int y = scanner.nextInt();
                double potencia = Math.pow(x, y);
                System.out.println(potencia);
            } else if (opção == 6) {
                System.out.println("Digite um numero");
                int x = scanner.nextInt();
                double raiz_cúbica = Math.cbrt(x);
                System.out.println(raiz_cúbica);
            } else if (opção == 7) {
                System.out.println("Digite um numero");
                int x = scanner.nextInt();
                double raiz_quadrada = Math.sqrt(x);
                System.out.println(raiz_quadrada);
            }

        }
    }
}