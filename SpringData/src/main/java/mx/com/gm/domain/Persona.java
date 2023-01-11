package mx.com.gm.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable{
 private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Persona;
    private String nombre_Persona;
    private String apellido_Persona;
    private String email_Persona;
    private String telefono_Persona;
}
