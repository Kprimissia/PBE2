package br.com.joalheriasjoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriasjoiasjoia.app.entities.Cliente;
import br.com.joalheriasjoiasjoia.app.repositories.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepostory;
    
    public Cliente saveCliente(Cliente cliente) {
        return clienteRepostory.save(cliente);
    }
    
    public List<Cliente> getAllCliente(){
        return clienteRepostory.findAll();
    }
    
    public Cliente getClienteById (Long id) {
        return clienteRepostory.findById(id).orElse(null);
    }
    
    public void deleteCliente(Long id) {
        clienteRepostory.deleteById(id);
    }
}