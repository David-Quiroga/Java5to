package Ejemplo.pructo.demo.compania;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Compania 
{
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    private long id;
    private String name;
    private String address;
};