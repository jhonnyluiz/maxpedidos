package com.jlcabral.maxpedidos.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jlcabral.maxpedidos.entity.BaseEntity;

import javassist.NotFoundException;

public class BaseService<T extends BaseEntity,ID, R extends JpaRepository<T, ID>> {

	@Autowired
	R repo;

	public List<T> listarTodos() {
		return repo.findAll();
	}

	public T buscarPorId(ID idObj) throws NotFoundException {
		return repo.findById(idObj).orElseThrow(getThrowsObjetoNaoEncontrado(idObj));
	}

	public T criar(T objRequest) {
		return repo.save(objRequest);
	}

	public BaseEntity atualizar(ID idObj, T objRequest) throws NotFoundException {
		return repo.findById(idObj).orElseThrow(getThrowsObjetoNaoEncontrado(idObj)).atualizarCampos(objRequest);
	}

	public void apagar(ID idObj) throws NotFoundException {
		repo.delete(repo.findById(idObj).orElseThrow(getThrowsObjetoNaoEncontrado(idObj)));
	}

	private Supplier<? extends NotFoundException> getThrowsObjetoNaoEncontrado(ID idObj) {
		return () -> new NotFoundException("Objeto com id:" + idObj.toString() + ", não foi encontrado!");
	}
}
