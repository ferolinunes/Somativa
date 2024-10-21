package com.example.demo.entities;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name="produto")
	public class Produto {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String item;
		private int preco;
		private int quantidade;
		private String pagamento;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getItem() {
			return item;
		}
		public void setItem(String item) {
			this.item = item;
		}
		public int getPreco() {
			return preco;
		}
		public void setSexo(int preco) {
			this.preco = preco;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int qauntidade) {
			this.quantidade = quantidade;
		}
		public String getPagamento() {
			return pagamento;
		}
		public void setPagamento(String pagamento) {
			this.pagamento = pagamento;
		}
	}
