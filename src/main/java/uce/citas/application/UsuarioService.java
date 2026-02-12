package uce.citas.application;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.citas.application.representation.UsuarioRepresentation;
import uce.citas.domain.Usuario;
import uce.citas.infraestructure.UsuarioRepository;

@ApplicationScoped
public class UsuarioService {

    @Inject
    private UsuarioRepository usuarioRepository;

    public UsuarioRepresentation consultarPorId(Integer id) {
        Usuario usuario = this.usuarioRepository.findById(id.longValue());
        return this.mapper(usuario);
    }

    public UsuarioRepresentation validarUsuario(String user, String password) {
        Usuario usuario = this.usuarioRepository.find("user = ?1 and password = ?2", user, password).firstResult();
        return this.mapper(usuario);
    }

    private UsuarioRepresentation mapper(Usuario usuario) {
        if (usuario == null) {
            return null;
        }
        UsuarioRepresentation usuarioR = new UsuarioRepresentation();
        usuarioR.setUser(usuario.getUser());
        usuarioR.setPassword(usuario.getPassword());
        usuarioR.setRole(usuario.getRole());
        return usuarioR;
    }
}
