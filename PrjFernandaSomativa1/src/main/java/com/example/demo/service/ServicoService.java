package com.example.demo.service;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.example.demo.entities.Servico;
import com.example.demo.repository.ServicoRepository;


	@Service
	public class ServicoService {
		private final ServicoRepository servicorepository;
		@Autowired
		public ServicoService(ServicoRepository servicorepository) {
			this.servicorepository = servicorepository;
		}
		public Servico saveServico(Servico servico) {
			return servicorepository.save(servico);
		}
		public Servico getServicoById(Long id) {
			return servicorepository.findById(id).orElse(null);
		}
		public List<Servico>getAllServico(){
			return servicorepository.findAll();	
		}
		public void deleteServico(Long id) {
			servicorepository.deleteById(id);
		}
	}
