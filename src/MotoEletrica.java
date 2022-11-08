public class MotoEletrica extends Moto{
    private int quantidadeBateria;

    public MotoEletrica(int id, int ano, String modelo, float preco, String marca, int quantidadeBateria) {
        super(id, ano, modelo, preco, marca);
        this.quantidadeBateria = quantidadeBateria;
    }

    public int getQuantidadeBateria() {
        return quantidadeBateria;
    }

    public void setQuantidadeBateria(int quantidadeBateria) {
        this.quantidadeBateria = quantidadeBateria;
    }
}
