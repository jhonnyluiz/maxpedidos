package com.jlcabral.maxpedidos.resources;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Mensagem {

	private String descricao;
	private TipoMensagem tipoMensagem;
	
	public Mensagem() {
	}

	public Mensagem(String descricao, TipoMensagem tipoMensagem) {
		this.descricao = descricao;
		this.tipoMensagem = tipoMensagem;
	}


	@JsonIgnore
	public boolean isErro() {
		return tipoMensagem.equals(TipoMensagem.E);
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoMensagem getTipoMensagem() {
		return tipoMensagem;
	}

	public void setTipoMensagem(TipoMensagem tipoMensagem) {
		this.tipoMensagem = tipoMensagem;
	}

}
