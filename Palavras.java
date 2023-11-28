
import java.util.List;
import java.util.ArrayList;

public class Palavras {

  private static List<String> palavras = new ArrayList<>();

  public void adicionar(String palavra) {

    palavras.add(palavra);

  }

  public static List<String> getPalavras() {

    return palavras;

  }
}