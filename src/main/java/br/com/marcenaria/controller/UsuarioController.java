package br.com.marcenaria.controller;


import br.com.marcenaria.model.Usuario;
import br.com.marcenaria.service.UsuarioService;

public class UsuarioController {
    private UsuarioService service = new UsuarioService();

    public boolean login(String email, String senha) {
        return service.autenticar(email, senha);
    }

    public void registrarUsuario(Usuario usuario) {
        service.registrarUsuario(usuario);
    }
}
