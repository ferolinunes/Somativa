package com.example.demo.entities;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name="cliente")
	public class Cliente {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String nome;
		private int contato;
		private String endereco;
		private int identidade;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getContato() {
			return contato;
		}
		public void setContato(int contato) {
			this.contato = contato;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public int getIdentidade() {
			return identidade;
		}
		public void setIdentidade(int identidae) {
			this.identidade = identidade;
		}
	}

