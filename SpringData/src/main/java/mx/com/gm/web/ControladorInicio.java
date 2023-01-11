package mx.com.gm.web;


import lombok.extern.slf4j.Slf4j;
import mx.com.gm.DAO.IPersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//Controlador MVC.

@Slf4j
public class ControladorInicio {
    
    @Autowired
    private IPersonaDao IPD;
    
    @GetMapping("/")
    public String inicio(Model model){
   
    var personas = IPD.findAll();
        
        log.info("Ejecuntando el controlador SpringMVC");
        model.addAttribute("personas", personas);
        return "index";
    }
    
}
