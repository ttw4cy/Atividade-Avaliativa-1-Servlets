package br.com.pacote.domain;

import java.sql.Timestamp;

public class Comprar {
    private int Codigo;
    private int usuario;
    public int getCodigo() {
		return Codigo;
	}



	public void setCodigo(int codigo) {
		Codigo = codigo;
	}



	public int getPacote() {
		return pacote;
	}



	public void setPacote(int pacote) {
		this.pacote = pacote;
	}



	public int getUsuario() {
		return usuario;
	}



	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}



	private int pacote;



    public Comprar(Pacote Codigo, Usuario usuario, Pacote pacote) {
        this.setPacote(Codigo);
        this.setUsuario(usuario);
        this.setPacote(pacote);

    }


}
