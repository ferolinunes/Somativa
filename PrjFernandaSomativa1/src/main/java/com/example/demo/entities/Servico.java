package com.example.demo.entities;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name="servico")
	public class Servico {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private int preco;
		private String tipoServico;
		private String nomePet;
		private String nomeResponsavel;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getPreco() {
			return preco;
		}
		public void setPreco(int preco) {
			this.preco= preco;
		}
		public String getTipoServico() {
			return tipoServico;
		}
		public void setTipoServico(String tipoServico) {
			this.tipoServico = tipoServico;
		}
		public String getNomePet() {
			return nomePet;
		}
		public void setNomePet(String nomePet) {
			this.nomePet = nomePet;
		}
		public String getNomeResponsavel() {
			return nomeResponsavel;
		}
		public void setNomeResponsavel(String nomeResponsavel) {
			this.nomeResponsavel = nomeResponsavel;
		}
	}
