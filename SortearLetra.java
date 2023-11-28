public class SortearLetra {

  private char letra;

  public SortearLetra() {
    this.letra = (char) ('A' + Math.random() * 26);
  }

  public char getLetra() {
    return this.letra;
  }

}