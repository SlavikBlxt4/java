package interfaces;

public interface Repository<E> {
    void save(E entity);
    void find();
    void findOne();
    void delete();
    void update();

}
