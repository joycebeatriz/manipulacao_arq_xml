import java.util.ArrayList;
import java.util.Scanner;

public class funcionario {
    public static void main(String[] args) throws Exception {             
            String cpf;  // atributos 
            String nome;
            int idade; 
            double salario;
            String cargo; 
            ArrayList habilidades = new ArrayList();   
        
            System.out.println("\nCaro funcionário, preencha os campos abaixo com seus dados.\n"); // entrada de dados
            System.out.println("CPF:");
            Scanner cpfScanner = new Scanner(System.in); // ler dados do teclado   
            cpf = cpfScanner.nextLine(); // atribuir dados a variável
            System.out.println("\nNome:");
            Scanner nomeScanner = new Scanner(System.in);
            nome = nomeScanner.nextLine();
            System.out.println("\nIdade: ");
            Scanner idadeScanner = new Scanner(System.in);
            idade = idadeScanner.nextInt();
            System.out.println("\nSalário: ");
            Scanner salarioScanner = new Scanner(System.in);
            salario = salarioScanner.nextDouble();
            System.out.println("\nCargo: ");
            Scanner cargoScanner = new Scanner(System.in);
            cargo = cargoScanner.nextLine();
            System.out.println("\nHabilidades: ");
            Scanner habilidadesScanner = new Scanner(System.in);
            habilidades.add(habilidadesScanner.nextLine());    

            // System.out.println("Insira o cpf : ");
            
    }
}
