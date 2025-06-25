package cat.itacademy.s04.t02.n03.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "fruits")
public class Fruit {
    @Id
    private String id;
    private String name;
    private int kilograms;

}
