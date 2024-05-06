package Ejemplo.pructo.demo.persona;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Persona {
    
    @Id
    private long id;
    private String name;

}
