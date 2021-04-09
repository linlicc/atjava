package br.edu.infnet.appatalineferreira.controller;

import br.edu.infnet.appatalineferreira.negocio.model.Produto;
import br.edu.infnet.appatalineferreira.negocio.servico.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @RequestMapping("/produto")
    public String index (Model model){
        List<Produto> produtos = service.listarProdutos();
        model.addAttribute("produtos", produtos);
        return "produto";
    }

    @PostMapping("/produto")
    public String cadastrar(Produto produto){
        service.cadastrar(produto);
        return "redirect:/produto";
    }


}
