public class MotoCombustao extends Moto{
    private int cilindrada;
    private String tipoCombustivel;

    public MotoCombustao(int id, int ano, String modelo, float preco, String marca,int tipo, int cilindrada, String tipoCombustivel) {
        super(id, ano, modelo, preco, marca, tipo);
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Tipo de Combustível: "+this.tipoCombustivel);
        System.out.println("Quantidade de cilindradas: "+this.cilindrada);
    }
}
