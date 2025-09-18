public class App {
    public static void main(String[] args) throws Exception {
        Tela tel = new Tela();
        Processamento pro = new Processamento();

        tel.iniciar("\n---CALCULANDO VALOR TOTAL DA COMPRA DE AÇAÍ----");
        pro.qntdPeq = tel.pedirQntd("Digite a quantidade de açaí PEQUENO adquirida: ");
        pro.qntdMed = tel.pedirQntd("Digite a quantidade de açaí MÉDIO adquirida: ");
        pro.qntdGran = tel.pedirQntd("Digite a quantidade de açaí GRANDE adquirida: ");
        pro.desconto = tel.pedirQntd("Digite o desconto: ");

        pro.rodarProc();

        tel.exibirSaida(pro.qntdPeq, pro.qntdMed, pro.qntdGran,pro.desconto, pro.lerValorTotal());

    }
}
