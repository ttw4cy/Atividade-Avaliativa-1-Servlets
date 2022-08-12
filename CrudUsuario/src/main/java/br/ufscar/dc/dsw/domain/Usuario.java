package br.ufscar.dc.dsw.domain;

public class Usuario {
	private Long id;
	private String username;
	private String password;
	private String cpf;
	private String nome;
	private String telefone;
	private String sexo;
	private String datanasc;
	private String role;
	
	public Usuario(Long id) {
        this.id = id;
    }

    

   
	public Usuario(String username, String password, String cpf, String nome, String telefone, String sexo,
			String datanasc, String role) {
		super();
		this.username = username;
		this.password = password;
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.sexo = sexo;
		this.datanasc = datanasc;
		this.role = role;
	}




	public Usuario(Long id, String username, String password, String cpf, String nome, String telefone, String sexo,
			String datanasc, String role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.sexo = sexo;
		this.datanasc = datanasc;
		this.role = role;
	}




	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
