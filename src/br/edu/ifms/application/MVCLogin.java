package br.edu.ifms.application;

import br.edu.ifms.controller.UsuarioController;
import br.edu.ifms.model.Usuario;
import br.edu.ifms.view.LoginView;

public class MVCLogin {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("admin","admin");
        LoginView viewLogin = new LoginView();
        
        UsuarioController controller = new UsuarioController(usuario, viewLogin);
        viewLogin.setVisible(true);
    }
}
