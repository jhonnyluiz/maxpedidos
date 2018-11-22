package com.jlcabral.maxpedidos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "item_pedidos")
public class ItemPedido extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "item_pedidos_generator")
	@SequenceGenerator(name = "item_pedidos_generator", sequenceName = "item_pedidos_sequence", initialValue = 1, allocationSize = 1)
	private Long id;

	@Column
	@NotNull
	private Double precoUnitario;

	@Column
	@NotNull
	private Integer quantidade;

	@ManyToOne
	@JoinColumn(name = "pedidos_id")
	@NotNull
	private Pedido pedido;

	@ManyToOne
	@JoinColumn(name = "produtos_id")
	@NotNull
	private Produto produto;
	
	public ItemPedido() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoTotal() {
		return this.quantidade * this.precoUnitario;
	}
}
