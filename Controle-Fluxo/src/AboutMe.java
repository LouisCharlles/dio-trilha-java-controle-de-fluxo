import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try{
            System.out.println("Digite seu nome");
            String nome = scanner.nextLine();
            
            
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
        }

        catch(InputMismatchException inputMismatchException){
            System.out.println("Um valor indevido foi atribuído em uma sessão...Por favor digite um valor válido.");
            System.out.println("Os campos idade e altura precisam ser numéricos.");
            System.out.println("Erro: "+inputMismatchException);
        }

        finally{
            System.out.println("Sessão finalizada!");
        }
    
        scanner.close();   
    }
}