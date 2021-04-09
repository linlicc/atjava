package br.edu.infnet.appatalineferreira.controller;

import br.edu.infnet.appatalineferreira.negocio.model.Cliente;
import br.edu.infnet.appatalineferreira.negocio.servico.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @Autowired
    private ClienteService service;

    @RequestMapping("/login")
    public String login() {

        return "login";
    }

    @PostMapping(value = "/login")
    public String login(Cliente cliente, Model model, HttpServletResponse response) {

        Cliente clienteLocalizado = service.buscarPor(cliente.getNome());

        // se usuario está cadastrado
        if (cliente.getSenha().equals(clienteLocalizado.getSenha())) {
            // entao -> guardar dados do usuario para utilizar no futuro
            Cookie cookie = new Cookie("usuario", cliente.getNome());
            response.addCookie(cookie);

            model.addAttribute("produtos", clienteLocalizado.getVendas());
            // redirecionar usuario para tela de home
            return "home";
        }

        // se usuario não esta cadastrado
        model.addAttribute("senha_invalida", "CREDENCIAIS INVALIDAS");
        // entao -> exibe mensagem de erro, mantem na mesma tela
        return "login";
    }
}
