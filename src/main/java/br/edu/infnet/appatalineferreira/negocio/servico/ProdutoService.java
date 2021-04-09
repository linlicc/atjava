package br.edu.infnet.appatalineferreira.negocio.servico;

import br.edu.infnet.appatalineferreira.negocio.model.Produto;
import br.edu.infnet.appatalineferreira.negocio.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto cadastrar(Produto produto){
        return repository.save(produto);
    }

    public List<Produto> listarProdutos() {
      return repository.findAll();
    }

    public Produto buscarProdutoPor(Integer id) {
        return repository.findById(id).get();
    }

}
