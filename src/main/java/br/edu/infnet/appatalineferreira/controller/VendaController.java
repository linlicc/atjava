package br.edu.infnet.appatalineferreira.controller;

import br.edu.infnet.appatalineferreira.negocio.model.Cliente;
import br.edu.infnet.appatalineferreira.negocio.model.Produto;
import br.edu.infnet.appatalineferreira.negocio.repository.ClienteRepository;
import br.edu.infnet.appatalineferreira.negocio.servico.ClienteService;
import br.edu.infnet.appatalineferreira.negocio.servico.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class VendaController {

    @Autowired
    private ProdutoService service;

    @Autowired
    private ClienteService clienteService;


    @RequestMapping("/venda")
    public String index (Model model){
        List<Produto> produtos = service.listarProdutos();
        model.addAttribute("produtos", produtos);
        return "venda";
    }

    @GetMapping("/venda/{id}/comprar")
    public String efetuarVenda(@CookieValue(value = "usuario") String usuario, @PathVariable Integer id) {

        Cliente clienteLocalizado = clienteService.buscarPor(usuario);
        Produto produtoSelecionado = service.buscarProdutoPor(id);


        clienteLocalizado.getVendas().add(produtoSelecionado);

        clienteService.atualizar(clienteLocalizado);

        return "redirect:/home";
    }

    @PostMapping("/venda")
    public String cadastrar(Produto produto){
        service.cadastrar(produto);
        return "redirect:/produto";
    }


}
