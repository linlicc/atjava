package br.edu.infnet.appatalineferreira.negocio.repository;

import br.edu.infnet.appatalineferreira.negocio.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
