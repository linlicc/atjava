package br.edu.infnet.appatalineferreira.negocio.repository;

import br.edu.infnet.appatalineferreira.negocio.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query("SELECT t FROM Cliente t WHERE t.nome = :nome")
    public Cliente finbByNome(@Param("nome") String nome);
}
