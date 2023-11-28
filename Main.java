
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    SortearLetra sortear = new SortearLetra();
    Verificacao verificar = new Verificacao();
    Exibir exibir = new Exibir();
    Palavras palavras = new Palavras();
    Tempo tempo = new Tempo(30000);
    Scanner scan = new Scanner(System.in);

    char letra = sortear.getLetra();
    int tamanhoMax = 3;

    exibir.apresentacao(letra, tamanhoMax);

    while (true) {

      exibir.pedirPalavra();
      
      String palavra = scan.nextLine();

      if (palavra.equals("fim")) {
        tempo.tempoEsgotado();
      } else {
        Boolean resultTamanho = verificar.verificarTamanho(palavra, tamanhoMax);

        if (resultTamanho) {

          Boolean palavraJaDigitada = verificar.verificarPalavraJaDigitada(palavra);
          Boolean palavraExiste = verificar.verificarExistencia(palavra);

          if (!palavraJaDigitada) {
            if (palavraExiste) {

              exibir.palavraExiste();
              palavras.adicionar(palavra);

            } else {

              exibir.palavraNaoExiste();

            }
          } else {
            exibir.palavraJaDigitada();
          }

        } else {

          exibir.tamanho(tamanhoMax);

        }

      }
    }
  }
}