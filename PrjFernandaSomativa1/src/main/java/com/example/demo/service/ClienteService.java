package com.example.demo.service;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.example.demo.entities.Cliente;

import com.example.demo.repository.ClienteRepository;

	@Service
	public class ClienteService {
		private final ClienteRepository clienterepository;
		@Autowired
		public ClienteService(ClienteRepository clienterepository) {
			this.clienterepository = clienterepository;
		}
		public Cliente saveCliente(Cliente cliente) {
			return clienterepository.save(cliente);
		}
		public Cliente getClienteById(Long id) {
			return clienterepository.findById(id).orElse(null);
		}
		public List<Cliente>getAllCliente(){
			return clienterepository.findAll();	
		}
		public void deleteCliente(Long id) {
			clienterepository.deleteById(id);
		}
	}
