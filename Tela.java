import java.util.Scanner;

public class Tela {
    Scanner leitor = new Scanner(System.in);

    public void iniciar(String msg){
        System.out.println(msg);
    }

    public int pedirQntd(String pedido){
        System.out.println(pedido);
        return leitor.nextInt();
    }

    public void exibirSaida(int qntdPeq, int qntdMed, int qntdGran, int desconto, double total){
        System.out.println("Seu pedido foi registrado.");
        System.out.printf("\nAçaí P: %d", qntdPeq);
        System.out.printf("\nAçaí M: %d", qntdMed);
        System.out.printf("\nAçaí G: %d", qntdGran);
        System.out.println();
        System.out.println("Desconto de " + desconto +"% aplicado");
        System.out.printf("\nTotal a pagar: R$ %.2f\n", total);
    }
}
