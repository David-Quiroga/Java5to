package Ejemplo.pructo.demo.libro;

import java.util.Date;

import Ejemplo.pructo.demo.categoria.Categoria;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
//import lombok.Data;

@Entity
//@Data

public class Libro {
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    private long id;
    private String title;
    private int pages;
    private Date created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @ManyToOne
    private Categoria categoria;
};
