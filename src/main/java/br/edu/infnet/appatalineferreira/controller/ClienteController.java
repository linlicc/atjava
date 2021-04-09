package br.edu.infnet.appatalineferreira.controller;

import br.edu.infnet.appatalineferreira.negocio.model.Cliente;
import br.edu.infnet.appatalineferreira.negocio.servico.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClienteController {

    @Autowired
    private ClienteService service;

    @RequestMapping("/cliente")
    public String cliente(Model model) {

        List<Cliente> clientes = service.listarTodos();

        model.addAttribute("clientes", clientes);

        return "/cliente";

    }

    @PostMapping(value = "/cliente")
    public String cadastrarUsuario(Cliente cliente, Model model) {

        try {
            service.cadastrar(cliente);
        } catch (Exception e) {
            return "home";
        }



        return "redirect:/cliente";
    }
}
