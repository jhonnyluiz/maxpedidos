package com.jlcabral.maxpedidos.resources;

import com.jlcabral.maxpedidos.utils.ObjetoUtil;

public enum TipoMensagem {

	A("A", "Advertência"), I("I", "Informação"), E("E", "Erro"), S("S", "Sucesso");
	
	private TipoMensagem() {
	}
	
	private TipoMensagem(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	private String codigo;
	private String descricao;
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public TipoMensagem toEnum(String codigo) {
		if(ObjetoUtil.isNaoVazio(codigo)) {
			for (TipoMensagem e : TipoMensagem.values()) {
				if(e.getCodigo().equals(codigo)) {
					return  e;					
				}
			}
		}
		return null;
	}
}
