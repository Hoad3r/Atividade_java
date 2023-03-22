import java.util.Scanner;

public class Questão04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        double numero = scanner.nextInt();

        if(numero %2==0){//par
            System.out.println("A raiz cúbica de "+numero+" é "+Math.cbrt(numero)); //cbrt cubica
        }else{
            System.out.println("A raiz quadrada de "+numero+" é "+Math.sqrt(numero));
        }

    }
}