package br.com.temgi.apiprodutos.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.temgi.apiprodutos.entity.Produto;
import br.com.temgi.apiprodutos.repository.ProdutoRepository;
import br.com.temgi.apiprodutos.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{
	
	private final ProdutoRepository produtoRepository;
	
	public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

	@Override
	public List<Produto> buscarTodos() {
		return produtoRepository.findAll();
	}

	@Override
	public Produto salvar(Produto produto) {
		return produtoRepository.save(produto);
	}

	@Override
	public void delete(Long id) {
		try {
			produtoRepository.deleteById(id);
		}catch(Exception ex) {
			throw new RuntimeException("Ocorreu um Erro ao Excluir o Produto");
		}
	}

}
