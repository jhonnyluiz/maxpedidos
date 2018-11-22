package com.jlcabral.maxpedidos.service;

import org.springframework.stereotype.Service;

import com.jlcabral.maxpedidos.entity.Produto;
import com.jlcabral.maxpedidos.respository.ProdutoRespository;

@Service
public class ProdutoService extends BaseService<Produto, Long, ProdutoRespository> {

}
