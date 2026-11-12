import java.util.Scanner;

public class exercicio_estrutura_repeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        System.out.println("Execultando contagem em ordem crescente: ");
        for(int i = 0; i <= numero; i++){
            System.out.print(i + ", ");
        }

        System.out.println("\nExecultando contagem em ordem decrescente: ");
        for(int i = numero; i >= 0; i--){

            System.out.print(i + ", ");
        }

        System.out.println("\nverificando quantidade de letras que o nome possui:");
        if(nome.length() < 7){
            System.out.println(nome);
        }else{
            while(numero > 0){
                numero--;
                System.out.println(nome);
            }
        }

        sc.close();


    }
}
