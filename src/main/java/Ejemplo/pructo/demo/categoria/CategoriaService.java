package Ejemplo.pructo.demo.categoria;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    //create
    public Categoria save(Categoria entity)
    {
        return categoriaRepository.save(entity);
    }


    //findbyid
    public Categoria findById(Long id)
    {
        return categoriaRepository.findById(id).orElse(null);
    }

    //delete

    public void deleteById( long id)
    {
        categoriaRepository.deleteById(id);
        {
            categoriaRepository.deleteById(id);
        }
    }

    //select all
    public List<Categoria> findAll()
    {
        return categoriaRepository.findAll();
    }

    //update by id

    public ResponseEntity<Categoria>updateById(Long id, Categoria categoriaActualizada)
    {
        try
        {
            Categoria categoriaExistente = findById(id);
            if (categoriaExistente == null) {
                return ResponseEntity.notFound().build();
            }

            //actualizar campos

            if (categoriaActualizada.getName()!=null) 
            {
                categoriaExistente.setName(categoriaActualizada.getName());                
            }

            if(categoriaActualizada.getEnable()!=null)
            {
                categoriaExistente.setEnable(categoriaActualizada.getEnable());
            }

            //guardar los datos 

            Categoria CategoriaGuardada = save(categoriaExistente);
            return ResponseEntity.ok(CategoriaGuardada);


        } catch(Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }
}