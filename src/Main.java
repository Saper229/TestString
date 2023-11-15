public class Main {
    public static void main(String[] args) {


    String wartosc = "costam";
    int wartosc2 = wartosc.length();

    String wartosc3 =wartosc.substring(0,wartosc.length()-2);
    int wartosc4 = wartosc3.length();
    String wartosc5 = wartosc.substring(0,2) + wartosc4;

    if(wartosc2 > 2){
        System.out.println(wartosc4);
        }

    }
}