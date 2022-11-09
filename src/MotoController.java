import java.util.ArrayList;

public class MotoController implements MotoRepository{

    private ArrayList<Moto> listaMotos = new ArrayList<Moto>();

    @Override
    public void cadastrarMotocicleta(Moto moto) {
        listaMotos.add(moto);

        System.out.println("Moto Cadastrada com sucesso!");
    }

    @Override
    public void editarMotocicleta(Moto moto) {
        var buscaMoto = buscarNaCollection(moto.getId());

        if (buscaMoto != null) {
            listaMotos.set(listaMotos.indexOf(buscaMoto), moto);
            System.out.println("\nA moto com o ID: " + moto.getId() + " foi atualizada com sucesso");
        }else
            System.out.println("\nA moto com o ID: " + moto.getId() + " não foi encontrada!");
    }

    @Override
    public void listarTodas() {
        for (var moto : listaMotos) {
            moto.visualizar();
        }
    }

    @Override
    public void removerMotocicleta(int id) {
        var moto = buscarNaCollection(id);

        if (moto != null) {
            if(listaMotos.remove(moto))
                System.out.println("\nA A moto com ID: " + id + " foi removida com sucesso!");
        }else
            System.out.println("\nA A moto com ID: " + id + " não foi encontrada!");
    }

    @Override
    public void buscarPorId(int id) {
        var moto = buscarNaCollection(id);

        if (moto != null)
            moto.visualizar();
        else
            System.out.println("\nA moto com o ID: " + id + " não foi encontrada!");
    }

    public int gerarID() {
        return listaMotos.size() + 1;
    }
    public Moto buscarNaCollection(int id) {
        for (var moto : listaMotos) {
            if (moto.getId() == id) {
                return moto;
            }
        }

        return null;
    }
    public int retornaTipo(int numero) {
        for (var moto : listaMotos) {
            if (moto.getId() == numero) {
                return moto.getTipo();
            }
        }

        return 0;
    }

}
