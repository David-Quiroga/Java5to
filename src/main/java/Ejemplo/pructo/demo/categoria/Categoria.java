package Ejemplo.pructo.demo.categoria;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import lombok.Data;

@Entity
//@Data
public class Categoria 
{
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    private long id;
    private String name;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEnable() {
        return enable;
    }
    public void setEnable(String enable) {
        this.enable = enable;
    }
    private String enable;
};
