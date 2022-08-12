package br.com.pacote.domain;

import java.util.Date;

public class Pacote {
	
	private int Codigo;
	private int CNPJ;
	private String destino;
	private int dataPartida;
	private int Duracao;
	private int valor;
	private String foto;
	private Date dataPartida1;
	

	public Pacote(int Codigo, String destino, int dataPartida, int Duracao, int valor, String foto,int CNPJ) {
		super();
		this.Codigo = Codigo;
		this.CNPJ = CNPJ;
		this.destino = destino;
		this.dataPartida = dataPartida;
		this.Duracao = Duracao;
		this.valor = valor;
		this.foto = foto;
	}

	public int getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(int CNPJ) {
		this.CNPJ = CNPJ;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getDataPartida() {
		return dataPartida;
	}
	public void setDataPartida(int dataPartida) {
		this.dataPartida = dataPartida;
	}
	public int getDuracao() {
		return Duracao;
	}
	public void setDuracao(int Duracao) {
		this.Duracao = Duracao;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Date getDataPartida1() {
		return dataPartida1;
	}
	public void setDataPartida1(Date dataPartida1) {
		this.dataPartida1 = dataPartida1;
	}
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int Codigo) {
		this.Codigo = Codigo;
	}
}
