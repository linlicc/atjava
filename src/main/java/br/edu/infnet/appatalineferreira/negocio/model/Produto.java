package br.edu.infnet.appatalineferreira.negocio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private Long preco;

    @Deprecated
    public Produto() {
        //nao utilizar - usado para jpa
    }

    public Produto(Integer id, String nome, Long preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Long getPreco() {
        return preco;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Long preco) {
        this.preco = preco;
    }
}
