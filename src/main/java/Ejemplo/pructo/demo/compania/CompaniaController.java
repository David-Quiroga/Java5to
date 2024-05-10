package Ejemplo.pructo.demo.compania;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/api/prueba")
public class CompaniaController {
    @Autowired
    private CompaniaService companiaService;

    //api create
    @PostMapping("/")
    public Compania save(@RequestBody Compania entity)
    {
        return companiaService.save(entity);
    }

    //api find by id
    @GetMapping("/{id}")
    public Compania findById(@PathVariable Long id)
    {
        return companiaService.findById(id);
    }

    //api update
    @PutMapping("/")
    public Compania update(@RequestBody Compania entity)
    {
        return companiaService.save(entity);
    }

        //metodo delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id)
    {
        companiaService.deleteById(id);
    }

    //metodo select all
    @GetMapping("/")
    public List<Compania> findAll()
    {
        return companiaService.findAll();
    }
}