package br.edu.infnet.appatalineferreira.negocio.servico;

import br.edu.infnet.appatalineferreira.negocio.model.Cliente;
import br.edu.infnet.appatalineferreira.negocio.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public void cadastrar(Cliente cliente) {
        repository.save(cliente);
    }

    public List<Cliente> listarTodos() {
        List<Cliente> localizados = repository.findAll();

        System.out.println(localizados);

        return localizados;
    }

    public Cliente buscarPor(String nome) {
        return repository.finbByNome(nome);

    }

    public void atualizar(Cliente clienteLocalizado) {
        repository.save(clienteLocalizado);
    }
}
