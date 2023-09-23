package ControlEst;
import java.util.Scanner;
public class Main {

    public static int teste;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Produto produtoA= new Produto ();

        do{

            System.out.println("Insira a quantidade em estoque:");
            produtoA.quant= ler.nextInt();

            produtoA.adicionar();

            System.out.println("Deseja adicionar mais estoque desse produto?");
            produtoA.resposta = ler.toString();
        }
        while(produtoA.resposta == "s");



    }


}