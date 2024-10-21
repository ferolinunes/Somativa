package com.example.demo.service;

import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.example.demo.entities.Agendamento;
import com.example.demo.repository.AgendamentoRepository;



	@Service
	public class AgendamentoService {
		private final AgendamentoRepository agendamentorepository;
		@Autowired
		public AgendamentoService(AgendamentoRepository agendamentorepository) {
			this.agendamentorepository = agendamentorepository;
		}
		public Agendamento saveAgendamento(Agendamento agendamento) {
			return agendamentorepository.save(agendamento);
		}
		public Agendamento getAgendamentoById(Long id) {
			return agendamentorepository.findById(id).orElse(null);
		}
		public List<Agendamento>getAllAgendatemento(){
			return agendamentorepository.findAll();	
		}
		public void deleteAgendamento(Long id) {
			agendamentorepository.deleteById(id);
		}
	}

