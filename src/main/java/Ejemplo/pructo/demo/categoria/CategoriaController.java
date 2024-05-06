package Ejemplo.pructo.demo.categoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/api/")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    @PostMapping(value = "categoria")
    public Categoria save(@RequestBody Categoria entity)
    {
        return categoriaService.save(entity);
    }

    //select by id
    @GetMapping(value = "categoria/{id}")
    public Categoria findById(Long id)
    {
        return categoriaService.findById(id);
    }


    //update
    @PutMapping(value = "categoria")
    public Categoria update(Categoria entity)
    {
        return categoriaService.save(entity);
    }

    //delete
    @DeleteMapping(value = "categoria/{id}")
    public void deleteById(Long id)
    {
        categoriaService.deleteById(id);
    }

    //select all
    @GetMapping(value = "categoria")
    public List <Categoria> findAll()
    {
        return categoriaService.findAll();
    }
}
