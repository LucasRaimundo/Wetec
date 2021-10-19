package br.com.sistema;

public class Usuario {

	private int id;
	private String nome;
	private String dtNascimento;
	private String cpf;
	private String email;
	private String senha;
	private String nivel_conhecimento;
	private String tecnologia;
	private double ponto_acumulado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNivel_conhecimento() {
		return nivel_conhecimento;
	}
	public void setNivel_conhecimento(String nivel_conhecimento) {
		this.nivel_conhecimento = nivel_conhecimento;
	}
	public String getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}
	public double getPonto_acumulado() {
		return ponto_acumulado;
	}
	public void setPonto_acumulado(double ponto_acumulado) {
		this.ponto_acumulado = ponto_acumulado;
	}
	
	
	
}
