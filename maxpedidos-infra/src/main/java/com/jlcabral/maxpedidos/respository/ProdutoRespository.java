package com.jlcabral.maxpedidos.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jlcabral.maxpedidos.entity.Produto;

@Repository
public interface ProdutoRespository extends JpaRepository<Produto, Long> {

}
