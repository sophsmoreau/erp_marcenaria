package controller;

import model.Usuario;
import service.UsuarioService;

public class UsuarioController {
    private UsuarioService service = new UsuarioService();

    public boolean login(String email, String senha) {
        return service.autenticar(email, senha);
    }

    public void registrarUsuario(Usuario usuario) {
        service.registrarUsuario(usuario);
    }
}
