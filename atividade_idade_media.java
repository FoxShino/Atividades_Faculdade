import java.util.Scanner;
public class atividade_idade_media {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int idade1;
        int idade2;
        int idade3;
        int idade4;
        int idade5;
        int idade6;
        double media;

        System.out.println("Idade da pessoa 1: ");
        idade1 = sc.nextInt();
        System.out.println("Idade da pessoa 2: ");
        idade2 = sc.nextInt();
        System.out.println("Idade da pessoa 3: ");
        idade3 = sc.nextInt();
        System.out.println("Idade da pessoa 4: ");
        idade4 = sc.nextInt();
        System.out.println("Idade da pessoa 5: ");
        idade5 = sc.nextInt();
        System.out.println("Idade da pessoa 6: ");
        idade6 = sc.nextInt();

        media = (idade1 + idade2 + idade3 + idade4 + idade5 + idade6) / 6 ;

        System.out.println("Média de idades: " + media);




        sc.close();
        
    }
    
}
