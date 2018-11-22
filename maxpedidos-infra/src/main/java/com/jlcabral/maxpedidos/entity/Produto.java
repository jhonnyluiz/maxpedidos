package com.jlcabral.maxpedidos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "produtos")
public class Produto extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "produtos_generator")
	@SequenceGenerator(name = "produtos_generator", sequenceName = "produtos_sequence", initialValue = 1, allocationSize = 1)
	private Long id;

	@Column
	@NotNull
	private String descricao;

	@Column
	@NotNull
	private Double preco;

	public Produto() {
	}

	public BaseEntity atualizarCampos(BaseEntity obj) {
		this.descricao = ((Produto) obj).getDescricao();
		this.preco = ((Produto) obj).getPreco();
		return this;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
