package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.Endereco;
import br.com.joalheriajoiasjoia.app.services.EnderecoService;

@RestController
@RequestMapping("/Enderecocliente")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;
	
	@PostMapping
	public Endereco createEndereco(@RequestBody Endereco endereco) {
		return enderecoService.saveEndereco(endereco);
	}
	
	@GetMapping("/{id}")
	public List<Endereco> getAllEndereco() {
		return enderecoService.getAllEndereco();
	}
	
	@PutMapping
	public Endereco editEndereco(@RequestBody Endereco endereco) {
		return enderecoService.saveEndereco(endereco);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEndereco(@PathVariable Long id) {
		enderecoService.deleteEndereco(id);
	}
	

}
