package Ejemplo.pructo.demo.compania;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompaniaService {
    
    @Autowired
    private CompaniaRepository companiaRepository;

    //metodo create
    public Compania save(Compania entity){
        return companiaRepository.save(entity);
    }

    //metodo select by id
   
    public Compania findById(Long id)
    {
        return companiaRepository.findById(id).orElse(null);
    }

   //metodo delete
   public void deleteById(Long id)
   {
        companiaRepository.deleteById(id);
   }

   //metodo select all
   public List<Compania> findAll()
   {
    return companiaRepository.findAll();
   }
    }
