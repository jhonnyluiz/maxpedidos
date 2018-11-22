package com.jlcabral.maxpedidos.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "pedidos_generator")
	@SequenceGenerator(name = "pedidos_generator", sequenceName = "pedidos_sequence", initialValue = 1, allocationSize = 1)
	private Long id;

	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	private List<ItemPedido> itensPedido;

	public Pedido() {
	}
	
	public Date getData() {
		return getCreatedAt();
	}

	public Double getValorTotal() {
		return this.itensPedido.stream().mapToDouble(f -> f.getPrecoTotal()).sum();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(List<ItemPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}

}
