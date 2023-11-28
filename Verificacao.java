import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Verificacao {

  public Boolean verificarTamanho(String palavra, int tamanho) {

    if (palavra.length() <= tamanho) {

      return false;

    } else {

      return true;

    }

  }

  public Boolean verificarPalavraJaDigitada(String palavra) {

    List<String> palavrasList = Palavras.getPalavras();

    Boolean palavraJaDigitada = false;

    for(String palavraList : palavrasList){
      if(palavra.equals(palavraList)){
        palavraJaDigitada = true;
      }else{
        palavraJaDigitada = false;
      }
    }

    return palavraJaDigitada;
    
  }

  public Boolean verificarExistencia(String palavra) {

    try {
      URL url = new URL("https://www.ime.usp.br/~pf/dicios/br-sem-acentos.txt");
      Scanner scanner = new Scanner(url.openStream());

      while (scanner.hasNext()) {
        if (scanner.next().equalsIgnoreCase(palavra)) {
          return true;
        }
      }

      scanner.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return false;

  }

}