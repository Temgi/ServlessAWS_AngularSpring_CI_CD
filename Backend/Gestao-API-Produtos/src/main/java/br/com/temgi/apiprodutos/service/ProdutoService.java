package br.com.temgi.apiprodutos.service;

import java.util.List;

import br.com.temgi.apiprodutos.entity.Produto;

public interface ProdutoService {
	
	public List<Produto> buscarTodos();
	
	public Produto salvar(Produto produto);
	
	void delete(Long id);
}
