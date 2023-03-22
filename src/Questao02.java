import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a escala de temperatura entre Celsius, Fahrenheit ou Kelvin digitando a primeira letra");
        char escala = scanner.next().charAt(0);
        System.out.println("Digite a temperatura");
        double numero = scanner.nextDouble();

        if(escala == 'c' || escala == 'C'){
            double celsius = numero;
            double kelvin = numero + 273.15;
            double fahrenheit = (celsius*1.8)+32;
            System.out.println("A temperatura em K é "+kelvin+" ,em F é "+fahrenheit+" em C é"+celsius);
        } else if(escala == 'f' || escala == 'F'){
            double fahrenheit = numero;
            double celsius = (numero-32) * 5/9;
            double kelvin = celsius + 273.15;
            System.out.println("A temperatura em K é "+kelvin+" ,em F é "+fahrenheit+" em C é"+celsius);
        } else if(escala == 'k' || escala == 'K'){
            double kelvin = numero;
            double celsius = (numero-273.15);
            double fahrenheit = (celsius * 9/5)+32;
            System.out.println("A temperatura em K é "+kelvin+" ,em F é "+fahrenheit+" em C é "+celsius);

        }
    }
}
