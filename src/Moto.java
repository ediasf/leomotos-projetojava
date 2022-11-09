public abstract class  Moto {
    private int id;
    private int ano;
    private String modelo;
    private float preco;
    private String marca;
    private int tipo;

    public Moto(int id, int ano, String modelo, float preco, String marca,int tipo) {
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.preco = preco;
        this.marca = marca;
        this.tipo=tipo;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void visualizar(){
        System.out.println("\n\n*********************************************************************");
        System.out.println("LISTA DE MOTOS:");
        System.out.println("*********************************************************************");
        System.out.println("ID: " + this.id);
        System.out.println("Ano:"+ this.ano);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preço: " + this.preco);
        System.out.println("Marca: " + this.marca);
    }
}
