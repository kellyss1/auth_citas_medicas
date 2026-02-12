package uce.citas.application.representation;

import lombok.Data;

@Data
public class UsuarioRepresentation {
    
    private String user;
    private String password;
    private String role;
}
