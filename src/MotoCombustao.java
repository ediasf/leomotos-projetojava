public class MotoCombustao extends Moto{
    private int cilindrada;
    private String TipoCombustivel;

    public MotoCombustao(int id, int ano, String modelo, float preco, String marca, int cilindrada, String tipoCombustivel) {
        super(id, ano, modelo, preco, marca);
        this.cilindrada = cilindrada;
        TipoCombustivel = tipoCombustivel;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoCombustivel() {
        return TipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        TipoCombustivel = tipoCombustivel;
    }
}
