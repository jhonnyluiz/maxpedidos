package com.jlcabral.maxpedidos.resources;

import java.util.ArrayList;
import java.util.List;

public class Resposta {

	private Object data;
	private List<Mensagem> mensagens;

	public Resposta() {
		this.mensagens = new ArrayList<>();
	}

	public Resposta(Object data) {
		this.data = data;
		this.mensagens = new ArrayList<>();
	}

	public Resposta(Object data, List<Mensagem> mensagens) {
		this.data = data;
		this.mensagens = mensagens;
	}

	public static Resposta data(Object data) {
		return new Resposta(data);
	}

	public static Resposta objetoCriado(Object data) {
		return new Resposta(data).addSucesso("Objeto criado com sucesso!");
	}

	public static Resposta objetoAtualizado(Object data) {
		return new Resposta(data).addSucesso("Objeto atualizado com sucesso!");
	}

	public static Resposta objetoApagado() {
		return new Resposta().addSucesso("Objeto apagado com sucesso!");
	}

	public Resposta addErro(String descricaoMsg) {
		this.mensagens.add(new Mensagem(descricaoMsg, TipoMensagem.E));
		return this;
	}

	public Resposta addAdvertencia(String descricaoMsg) {
		this.mensagens.add(new Mensagem(descricaoMsg, TipoMensagem.A));
		return this;
	}

	public Resposta addSucesso(String descricaoMsg) {
		this.mensagens.add(new Mensagem(descricaoMsg, TipoMensagem.S));
		return this;
	}

	public Resposta addInformacao(String descricaoMsg) {
		this.mensagens.add(new Mensagem(descricaoMsg, TipoMensagem.I));
		return this;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public List<Mensagem> getMensagens() {
		return mensagens;
	}

	public void setMensagens(List<Mensagem> mensagens) {
		this.mensagens = mensagens;
	}

	public boolean isAsErros() {
		for (Mensagem mensagem : mensagens) {
			if (mensagem.getTipoMensagem().equals(TipoMensagem.E)) {
				return true;
			}
		}
		return false;
	}
}
