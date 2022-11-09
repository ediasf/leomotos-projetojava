public interface MotoRepository {
     void cadastrarMotocicleta(Moto moto);
     void editarMotocicleta(Moto moto);
     void listarTodas();
     void removerMotocicleta(int id);
     void buscarPorId(int id);


}
