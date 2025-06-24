package cat.itacademy.s04.t02.n02.services;



import cat.itacademy.s04.t02.n02.model.Fruit;

import java.util.List;

public interface FruitService {
    Fruit add(Fruit fruit);
    Fruit update(Fruit fruit);
    void delete(int id);
    Fruit getOne(int id);
    List<Fruit> getAll();
}
