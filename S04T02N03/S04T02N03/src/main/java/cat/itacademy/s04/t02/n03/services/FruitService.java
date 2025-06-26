package cat.itacademy.s04.t02.n03.services;

import cat.itacademy.s04.t02.n03.model.Fruit;

import java.util.List;

public interface FruitService {
    Fruit add(Fruit fruit);

    Fruit update(Fruit fruit);

    void delete(String id);

    Fruit getOne(String id);

    List<Fruit> getAll();
}
