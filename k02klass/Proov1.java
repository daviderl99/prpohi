public class Proov1{
  public static void main(String[] arg){
    Tegelane juku=new Tegelane();
    juku.liigu();
    juku.muudaSuund(Suund.ALLA);
    juku.liigu();
    juku.liigu();
    juku.muudaSuund(Suund.PAREMALE);
    juku.liigu();
    juku.muudaSuund(Suund.YLES);
    juku.liigu();
    System.out.println(juku);
  }
}
