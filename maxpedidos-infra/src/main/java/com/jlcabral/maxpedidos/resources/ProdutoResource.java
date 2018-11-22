package com.jlcabral.maxpedidos.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jlcabral.maxpedidos.entity.Produto;
import com.jlcabral.maxpedidos.service.ProdutoService;

import javassist.NotFoundException;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoResource {
	
	@Autowired
	ProdutoService service;

	@GetMapping
	public ResponseEntity<Resposta> listarTodos() {
		return new ResponseEntity<Resposta>(Resposta.data(service.listarTodos()), HttpStatus.OK);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Resposta> buscarPorId(@PathVariable Long id) throws NotFoundException {
		return new ResponseEntity<Resposta>(Resposta.data(service.buscarPorId(id)), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Resposta> criar(@Valid @RequestBody Produto objRequest) {
		return new ResponseEntity<Resposta>(Resposta.objetoCriado(service.criar(objRequest)), HttpStatus.CREATED);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Resposta> atualizar(@PathVariable Long id, @Valid @RequestBody Produto objRequest) throws NotFoundException {
		return new ResponseEntity<Resposta>(Resposta.objetoAtualizado(service.atualizar(id.longValue(), objRequest)), HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Resposta> deletar(@PathVariable Long id) throws NotFoundException {
		service.apagar(id);
		return new ResponseEntity<Resposta>(Resposta.objetoApagado(),HttpStatus.OK);
	}
	
	
}
