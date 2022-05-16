package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente();
		
		cliente1.setId(1L);
		cliente1.setNome("Raquel");
		cliente1.setEmail("raquel@gmail.com");
		cliente1.setTelefone("99972873462");
		
		var cliente2 = new Cliente();
		
		cliente2.setId(2L);
		cliente2.setNome("Carlos");
		cliente2.setEmail("carlos@gmail.com");
		cliente2.setTelefone("1212121212");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
