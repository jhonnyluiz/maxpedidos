package com.jlcabral.maxpedidos.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jlcabral.maxpedidos.entity.Produto;
import com.jlcabral.maxpedidos.respository.ProdutoRespository;
import com.jlcabral.maxpedidos.service.ProdutoService;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoResource extends BaseResource<Produto, Long, ProdutoService, ProdutoRespository> {

}
