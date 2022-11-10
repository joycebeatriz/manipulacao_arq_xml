import java.io.FileOutputStream;

// import java.util.ArrayList;
// import java.util.Scanner;

public class funcionario { // classe funcionario com atributos e metodos
    private static final XStream X_STREAM = new XStream();
    public static void main(String[] args) throws Exception {             
            // String cpf;  // atributos 
            // String nome;
            // int idade; 
            // double salario;
            // String cargo; 
            // ArrayList habilidades = new ArrayList();   
            

            funcionario Ana = new funcionario(); // instanciando objeto Ana
            Ana.nome("Ana"); // setando atributos do objeto Ana
            Ana.idade(25);   
            Ana.cpf("123456789");
            Ana.salario(1000);
            Ana.cargo("Analista de Sistemas");
            Ana.habilidades("Java");

            funcionario Joao = new funcionario(); // instanciando objeto Joao
            Joao.nome("Joao"); // setando atributos do objeto Joao
            Joao.idade(30);
            Joao.cpf("987654321");
            Joao.salario(2000);
            Joao.cargo("Gerente de TI");
            Joao.habilidades("Python");
        
        
            // System.out.println("\nCaro funcionário, preencha os campos abaixo com seus dados.\n"); // entrada de dados (ler dados do teclado)
            // System.out.println("CPF:");
            // Scanner cpfScanner = new Scanner(System.in); // ler dados do teclado   
            // cpf = cpfScanner.nextLine(); // atribuir dados a variável
            // System.out.println("\nNome:");
            // Scanner nomeScanner = new Scanner(System.in);
            // nome = nomeScanner.nextLine();
            // System.out.println("\nIdade: ");
            // Scanner idadeScanner = new Scanner(System.in);
            // idade = idadeScanner.nextInt();
            // System.out.println("\nSalário: ");
            // Scanner salarioScanner = new Scanner(System.in);
            // salario = salarioScanner.nextDouble();
            // System.out.println("\nCargo: ");
            // Scanner cargoScanner = new Scanner(System.in);
            // cargo = cargoScanner.nextLine();
            // System.out.println("\nHabilidades: ");
            // Scanner habilidadesScanner = new Scanner(System.in);
            // habilidades.add(habilidadesScanner.nextLine());    

            // System.out.println("Insira o cpf : ");            
            
    }

    private void habilidades(String string) {
    }

    private void cargo(String string) {
    }

    private void salario(int i) {
    }

    private void cpf(String string) {
    }

    private void idade(int i) {
    }

    private void nome(String string) {
    }
}