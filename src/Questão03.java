import java.util.Scanner;
public class Questão03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro nome");
        String nome = scanner.nextLine();
        System.out.println("Digite o sobrenome");
        String sobrenome = scanner.nextLine();

        if(nome.equals("bruce") || nome.equals("Bruce")){
            if(sobrenome.equals("wayne")|| sobrenome.equals("Wayne")){
                System.out.println("Acesso liberado, Sr. Wayne");
            }else {
                System.out.println("Get out impostor!");
            }

        } else if(sobrenome.equals("kent")|| sobrenome.equals("Kent")){
            System.out.println("Saí daí, mané!");
        } else if(nome.equals("diana") || nome.equals("Diana")){
            System.out.println("Bem-vinda, Princesa de Themyscara");
        } else{
            System.out.println("Cai fora");
        }

    }
}
