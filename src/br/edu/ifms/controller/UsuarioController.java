package br.edu.ifms.controller;

import br.edu.ifms.model.Usuario;
import br.edu.ifms.view.LoginView;
import br.edu.ifms.view.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class UsuarioController{
    private Usuario usuario;
    private LoginView loginView;
    
    public UsuarioController(Usuario usuario, LoginView view){
        this.usuario = usuario;
        this.loginView = view;
        
        this.loginView.addLoginListener(new LoginListener());
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LoginView getLoginView() {
        return loginView;
    }

    public void setLoginView(LoginView view) {
        this.loginView = view;
    }
    
    class LoginListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(usuario.getLogin().equals(loginView.getLogin()) && usuario.getSenha().equals(loginView.getSenha())){
                JOptionPane.showMessageDialog(loginView, "Login realizado com sucesso", "Login message", JOptionPane.PLAIN_MESSAGE);
                Principal viewPrincipal = new Principal();
                viewPrincipal.setVisible(true);
                viewPrincipal.setLocationRelativeTo(null);
                loginView.dispose();
            }else{
                JOptionPane.showMessageDialog(loginView, "Login/Senha inválidos", "Login message", JOptionPane.ERROR_MESSAGE);
            }
        }

        
    }
}
