
import java.util.Timer;
import java.util.List;
import java.util.ArrayList;
import java.util.TimerTask;

public class Tempo {

  private int tempo;
  private Timer timer = new Timer();

  public Tempo(int tempo) {

    this.tempo = tempo;
    timer.schedule(new TimerTask() {
      public void run() {
        tempoEsgotado();
      }
    }, tempo);

  }

  public void tempoEsgotado() {

    this.timer.cancel();

    Exibir exibir = new Exibir();

    List<String> palavrasList = Palavras.getPalavras();

    exibir.fimDoJogo(palavrasList);

    System.exit(0);

  }

}