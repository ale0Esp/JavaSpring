package mx.com.gm;


import java.util.ArrayList;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
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
        var persona = new Persona(); 
        var persona2 = new Persona();
        
        
        persona.setNombre("Ale");
        persona.setApellido("Espinoza");
        persona.setEmail("ale_1617@outlook.com");
        persona.setTelefono("5617700697");
       
        persona2.setNombre("Karla");
        persona2.setApellido("Perez");
        persona2.setEmail("Kperez167@out.om");
        persona2.setTelefono("554545754566");
        
        var personas = Arrays.asList(persona,persona2);
        //var personas = new ArrayList();
        
        log.info("Ejecuntando el controlador SpringMVC");
        model.addAttribute("saludar", mensaje);
        model.addAttribute("saludo", saludo);
        //model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";
    }
    
}
