package interfaces;

public interface Repository<Producto> {
    void save();
    void find();
    void findOne();
    void delete();
    void update();

}
