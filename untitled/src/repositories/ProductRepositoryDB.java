package repositories;

import entidades.Producto;
import interfaces.Repository;

public class ProductRepositoryDB implements Repository<Producto> {

    @Override
    public void save(Producto entity) {
        System.out.println("Guardando en DB");
    }

    @Override
    public void find() {

    }

    @Override
    public void findOne() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }
}