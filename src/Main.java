import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
String[] teste = {"f","z","x","v"};
        System.out.println( teste[0]);
        System.out.println( Arrays.toString (teste));
        int hh = Arrays.binarySearch(teste, "x");
        System.out.println(hh);
    }

}
