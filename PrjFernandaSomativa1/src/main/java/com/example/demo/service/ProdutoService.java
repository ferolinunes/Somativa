package com.example.demo.service;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.example.demo.entities.Produto;
import com.example.demo.repository.ProdutoRepository;


	@Service
	public class ProdutoService {
		private final ProdutoRepository produtorepository;
		@Autowired
		public ProdutoService(ProdutoRepository produtorepository) {
			this.produtorepository = produtorepository;
		}
		public Produto saveProduto(Produto produto) {
			return produtorepository.save(produto);
		}
		public Produto getProdutoById(Long id) {
			return produtorepository.findById(id).orElse(null);
		}
		public List<Produto>getAllProduto(){
			return produtorepository.findAll();	
		}
		public void deleteProduto(Long id) {
			produtorepository.deleteById(id);
		}
	}
