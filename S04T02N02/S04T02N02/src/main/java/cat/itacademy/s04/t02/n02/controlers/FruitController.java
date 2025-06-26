package cat.itacademy.s04.t02.n02.controlers;

import cat.itacademy.s04.t02.n02.model.Fruit;
import cat.itacademy.s04.t02.n02.services.FruitService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruits")
@AllArgsConstructor
public class FruitController {
    private final FruitService service;

    @PostMapping("/add")
    public ResponseEntity<Fruit> add(@RequestBody Fruit fruit) {
        return ResponseEntity.ok(service.add(fruit));
    }

    @PutMapping("/update")
    public ResponseEntity<Fruit> update(@RequestBody Fruit fruit) {
        return ResponseEntity.ok(service.update(fruit));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit> getOne(@PathVariable int id) {
        return ResponseEntity.ok(service.getOne(id));
    }

}
