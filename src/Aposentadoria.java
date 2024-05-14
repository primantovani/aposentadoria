import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idadeUsuario;
        int anosContribuicao;

        // Solicitação da idade ao usuário
        System.out.print("Digite sua idade: ");
        idadeUsuario = scanner.nextInt();

        // Solicitação da tempo de trabalho ao usuário
        System.out.print("Digite quantos anos de contribuição: ");
        anosContribuicao = scanner.nextInt();

        // Verificação dos critérios
        if (idadeUsuario >= 60 && anosContribuicao >= 15) {
            System.out.println("Você já atende aos requisitos para se aposentar");
        } else if (idadeUsuario < 60 && anosContribuicao >= 15) {
            System.out.println("Você ainda não possui idade mínima de 60 anos para contemplar a aposentadoria.");
        } else if (idadeUsuario >= 60 && anosContribuicao < 15) {
            System.out.println("Você ainda não contribuiu o mínimo de 15 anos então ainda não está apto para aposentadoria.");
        } else {
            System.out.println("Você não atende aos 2 requisitos para contemplar a aposentadoria");
        }
    }
}
