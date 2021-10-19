package br.com.sistema;

public class Solicitacao {

	private int id_Solic;
	private String titulo;
	private String desc_Solic;
	private double ponto;
	private String data_Solic;
	private String resposta;
	private int id_user_resposta;
	private String user_resposta;
	public int getId_Solic() {
		return id_Solic;
	}
	public void setId_Solic(int id_Solic) {
		this.id_Solic = id_Solic;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDesc_Solic() {
		return desc_Solic;
	}
	public void setDesc_Solic(String desc_Solic) {
		this.desc_Solic = desc_Solic;
	}
	public double getPonto() {
		return ponto;
	}
	public void setPonto(double ponto) {
		this.ponto = ponto;
	}
	public String getData_Solic() {
		return data_Solic;
	}
	public void setData_Solic(String data_Solic) {
		this.data_Solic = data_Solic;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public int getId_user_resposta() {
		return id_user_resposta;
	}
	public void setId_user_resposta(int id_user_resposta) {
		this.id_user_resposta = id_user_resposta;
	}
	public String getUser_resposta() {
		return user_resposta;
	}
	public void setUser_resposta(String user_resposta) {
		this.user_resposta = user_resposta;
	}
	
	
}
