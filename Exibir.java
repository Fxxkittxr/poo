import java.io.PrintStream;
import java.util.List;
import java.util.ArrayList;

public class Exibir {

  public PrintStream apresentacao(char letra, int tamanho) {

    System.out.printf("%60s\n", "-------------------------------------------------------------");
    System.out.printf("%60s\n", "                      Jogo das Palavras                      ");
    System.out.printf("%60s\n", "-------------------------------------------------------------");
    System.out.printf("%60s\n\n", "                       Letra da vez: " + letra + "                      ");
    System.out.printf("%60s\n\n", "          Digite palavras maiores que: " + tamanho + " caracteres         ");
    System.out.printf("%60s\n", "-------------------------------------------------------------");
    System.out.printf("%60s\n\n", "              Para encerrar o jogo digite: fim               ");
    System.out.printf("%60s\n", "                       Vamos começar??                       ");

    return null;

  }

  public PrintStream pedirPalavra() {

    System.out.printf("%60s\n\n", "                     Digite uma palavra:                     ");
    System.out.printf("%20s", "                     ");

    return null;
  }

  public PrintStream tamanho(int tamanho) {

    System.out.printf("%60s\n", "------------------------------------------------------------");
    System.out.printf("%60s\n", "            A palavra precisa ser maior que: " + tamanho + "             ");

    return null;
  }

  public PrintStream palavraExiste() {

    System.out.printf("%60s\n\n", "------------------------------------------------------------");
    System.out.printf("%60s\n", "              Palavra adicionada com sucesso                ");
    System.out.printf("%60s\n\n", "------------------------------------------------------------");

    return null;

  }

  public PrintStream palavraJaDigitada() {

    System.out.printf("%60s\n\n", "------------------------------------------------------------");
    System.out.printf("%60s\n", "         Essa palavra já foi digitada anteriormente!!         ");
    System.out.printf("%60s\n\n", "------------------------------------------------------------");

    return null;

  }

  public PrintStream palavraNaoExiste() {

    System.out.printf("%60s\n\n", "------------------------------------------------------------");
    System.out.printf("%60s\n", "    Essa palavra não existe no nosso banco de palavras      ");
    System.out.printf("%60s\n\n", "------------------------------------------------------------");

    return null;

  }

  public PrintStream fimDoJogo(List<String> palavras) {

    System.out.printf("\n%60s\n", "------------------------------------------------------------");
    System.out.printf("%60s\n", "                   Tempo encerradooooo                      ");
    System.out.printf("%60s\n\n", "               As palavras informadas foram:                ");

    if (palavras.size() == 0) {
      System.out.printf("\n%60s\n", "              Nenhuma palavra foi adicionada!               ");

    } else {
      for (String palavra : palavras) {

        int tamanhoPalavra = palavra.length();
        int calculo = (60 - tamanhoPalavra) / 2;

        for (int i = 0; i < calculo; i++) {

          System.out.printf("%s", " ");

        }

        System.out.printf("%s", palavra);

        for (int i = 0; i < calculo; i++) {

          System.out.printf("%s", " ");

        }
        System.out.println(" ");

      }
    }
    System.out.printf("\n%60s\n", "------------------------------------------------------------");
    System.out.printf("%60s\n\n", "                   Obrigado por jogar:)                   ");

    return null;
  }
}