package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//Controlador MVC
@Slf4j
public class ControladorInicio {
    
    @Value("${index.saludo}")//inyecta el valor a saludo
    private String saludo;
    
    
    @GetMapping("/")
    public String inicio(Model model){
        var mensaje = "Hola mundo(thymeleaf)"; 
        log.info("Ejecuntando el controlador SpringMVC");
        model.addAttribute("saludar", mensaje);
        model.addAttribute("saludo", saludo);
        return "index";
    }
    
}
