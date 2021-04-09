package br.edu.infnet.appatalineferreira.negocio.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    private String senha;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "cliente_venda",
            joinColumns = @JoinColumn(name = "id_cliente", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_produto", referencedColumnName = "id")
    )
    private List<Produto> vendas = new ArrayList<>();

    @Deprecated
    public Cliente() {
        //nao utilizar - usado para jpa
    }

    public Cliente(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Produto> getVendas() {
        return vendas;
    }

    public void setVendas(List<Produto> vendas) {
        this.vendas = vendas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
