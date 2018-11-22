package com.jlcabral.maxpedidos.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jlcabral.maxpedidos.entity.BaseEntity;
import com.jlcabral.maxpedidos.service.BaseService;

import javassist.NotFoundException;

public class BaseResource<T extends BaseEntity, ID, S extends BaseService<T, ID, R>, R extends JpaRepository<T, ID>> {

	@Autowired
	S service;

	@GetMapping
	public ResponseEntity<Resposta> listarTodos() {
		return new ResponseEntity<Resposta>(Resposta.data(service.listarTodos()), HttpStatus.OK);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Resposta> buscarPorId(@PathVariable ID id) throws NotFoundException {
		return new ResponseEntity<Resposta>(Resposta.data(service.buscarPorId(id)), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Resposta> criar(@Valid @RequestBody T obj) {
		return new ResponseEntity<Resposta>(Resposta.objCriado(service.criar(obj)), HttpStatus.CREATED);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Resposta> atualizar(@PathVariable ID id, @Valid @RequestBody T obj)
			throws NotFoundException {
		return new ResponseEntity<Resposta>(Resposta.objAtualizado(service.atualizar(id, obj)),
				HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Resposta> deletar(@PathVariable ID id) throws NotFoundException {
		service.apagar(id);
		return new ResponseEntity<Resposta>(Resposta.objApagado(), HttpStatus.OK);
	}
}
