public class Processamento {
    
    //Valores de cada açaí
    private final double valorPeq = 13.5;
    private final double valorMed = 15;
    private final double valorGran = 17.5;

    public int qntdPeq;
    public int qntdMed;
    public int qntdGran;
    public int desconto;
    private double descDec;
    private double valorTotal;

    public void rodarProc(){
        this.descDec = this.calcularDesc();
        this.valorTotal = this.calcularTotal();
    }

    public double lerValorTotal(){
        return this.valorTotal;
    }

    private double calcularDesc(){
        double desc = this.desconto/100.0;
        return desc;
    }

    private double calcularTotal(){
        double total = (this.valorPeq * this.qntdPeq) + (this.valorMed * this.qntdMed) + (this.valorGran * this.qntdGran);
        double totalComDesc = total * (1 - this.descDec);
        return totalComDesc;
    }

}

