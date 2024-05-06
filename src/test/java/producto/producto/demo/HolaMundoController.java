package producto.producto.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/Saludo")

public class HolaMundoController {
    @GetMapping("/Hola")
    public String hello()
        {
        return "Mensaje en pantalla";
}
}