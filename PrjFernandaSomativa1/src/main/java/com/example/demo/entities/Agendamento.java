package com.example.demo.entities;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name="agendamento")
	public class Agendamento {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private int horario;
		private int diaMarcado;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getHorario() {
			return horario;
		}
		public int getDiaMarcado() {
			return diaMarcado;
		}
		public void setDiaMarcado(int diaMarcado) {
			this.diaMarcado = diaMarcado;
		}
	}

