package Ejemplo.pructo.demo.categoria;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService
{
    @Autowired
    private CategoriaRepository categoriaRepository;

    //create
    public Categoria save(Categoria entity){
        return categoriaRepository.save(entity);
    }
    
    //findById
    public Categoria findById(long id)
    {
        return categoriaRepository.findById(id).orElse(null);
    }

    //delete
    public void deleteById(Long id)
    {
        categoriaRepository.deleteById(id);
    }
    //select all
    public List<Categoria> findAll()
    {
        return categoriaRepository.findAll();
    }
}