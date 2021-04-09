package br.edu.infnet.appatalineferreira.controller;

import br.edu.infnet.appatalineferreira.negocio.model.Cliente;
import br.edu.infnet.appatalineferreira.negocio.model.Produto;
import br.edu.infnet.appatalineferreira.negocio.servico.ClienteService;
import br.edu.infnet.appatalineferreira.negocio.servico.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProdutoService service;

    @Autowired
    private ClienteService clienteService;

    @RequestMapping("/home")
    public String cliente(Model model, @CookieValue(value = "usuario") String usuario) {

        Cliente clienteLocalizado = clienteService.buscarPor(usuario);

        List<Produto> produtos = clienteLocalizado.getVendas();
        model.addAttribute("produtos", produtos);

        return "/home";

    }
}
