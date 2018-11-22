package com.jlcabral.maxpedidos.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlcabral.maxpedidos.entity.Produto;
import com.jlcabral.maxpedidos.respository.ProdutoRespository;

import javassist.NotFoundException;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRespository repo;

	public List<Produto> listarTodos() {
		return repo.findAll();
	}

	public Produto buscarPorId(Long idObj) throws NotFoundException {
		return repo.findById(idObj).orElseThrow(getThrowsObjetoNaoEncontrado(idObj));
	}

	public Produto criar(Produto objRequest) {
		return repo.save(objRequest);
	}

	public Produto atualizar(Long idObj, Produto objRequest) throws NotFoundException {
		return repo.findById(idObj).orElseThrow(getThrowsObjetoNaoEncontrado(idObj)).atualizarCampos(objRequest);
	}

	public void apagar(Long idObj) throws NotFoundException {
		repo.delete(repo.findById(idObj).orElseThrow(getThrowsObjetoNaoEncontrado(idObj)));
	}

	private Supplier<? extends NotFoundException> getThrowsObjetoNaoEncontrado(Long idObj) {
		return () -> new NotFoundException("Objeto com id:" + idObj.toString() + ", não foi encontrado!");
	}
}
