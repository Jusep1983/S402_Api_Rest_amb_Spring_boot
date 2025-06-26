package cat.itacademy.s04.t02.n03.services;

import cat.itacademy.s04.t02.n03.exceptions.FruitNotFoundException;
import cat.itacademy.s04.t02.n03.model.Fruit;
import cat.itacademy.s04.t02.n03.repository.FruitRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@AllArgsConstructor
@Service
public class FruitServiceImpl implements FruitService {
    private final FruitRepository repo;

    @Override
    public Fruit add(Fruit fruit) {
        return repo.save(fruit);
    }

    @Override
    public Fruit update(Fruit fruit) {
        if (!repo.existsById(fruit.getId())) {
            throw new FruitNotFoundException("Fruit with id " + fruit.getId() + " not found");
        }
        return repo.save(fruit);
    }

    @Override
    public void delete(String id) {
        if (!repo.existsById(id)) {
            throw new FruitNotFoundException("Fruit with id " + id + " not found");
        }
        repo.deleteById(id);
    }

    @Override
    public Fruit getOne(String id) {
        return repo.findById(id).orElseThrow(() -> new FruitNotFoundException("Fruit with id " + id + " not found"));
    }

    @Override
    public List<Fruit> getAll() {
        return repo.findAll();
    }

}
