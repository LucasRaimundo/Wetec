package br.com.sistema;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;



public class SolicitacaoDao {
 
	public void cadastrar(Solicitacao solicitacao) {
		Connection con = Conexao.receberConexao();
		String sql = "insert into solicitacao (tituo, tecnologia, desc_solic, data_solic) values (?, ?, ?, ?)";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, solicitacao.getTitulo());
			preparador.setString(2, solicitacao.getDesc_Solic());
			preparador.setString(3, solicitacao.getData_Solic());
			preparador.execute();
			System.out.println("Funcionario Cadastrado com sucesso");
		} catch(SQLException e) {
			System.err.println("Não foi possivel cadastrar");
		}
	}
	
	public ArrayList<Solicitacao>mostrarTodos(){
		Connection con = Conexao.receberConexao();
		ArrayList<Solicitacao> solicitacao = new ArrayList<>();
		String sql = "select * from vendas";
		PreparedStatement preparador;
		try {
			preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			while(resultado.next()) {
				Solicitacao solicitacaos = new Solicitacao();
				solicitacaos.setId_Solic(resultado.getInt("id"));
				solicitacaos.setTitulo(resultado.getString("titulo"));
				solicitacaos.setDesc_Solic(resultado.getString("nomeCliente"));
				solicitacaos.setPonto(resultado.getDouble("horaVenda"));
				solicitacaos.setData_Solic(resultado.getString("prodComprado"));
				solicitacaos.setResposta(resultado.getString("resposta"));
				solicitacaos.setId_user_resposta(resultado.getInt("id_user_resposta"));
				solicitacaos.setUser_resposta(resultado.getString("user_resposta"));
				solicitacao.add(solicitacaos);
			}
		} catch(SQLException e) {
			System.err.println("Não foi possivel realizar ação");
		}
		return solicitacao;
	}
	
	
	public ArrayList<Solicitacao>mostrarJava(){
		Connection con = Conexao.receberConexao();
		ArrayList<Solicitacao> solicitacao = new ArrayList<>();
		String sql = "select * from vendas where tecnologia = java";
		PreparedStatement preparador;
		try {
			preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			while(resultado.next()) {
				Solicitacao solicitacaos = new Solicitacao();
				solicitacaos.setId_Solic(resultado.getInt("id"));
				solicitacaos.setTitulo(resultado.getString("titulo"));
				solicitacaos.setDesc_Solic(resultado.getString("nomeCliente"));
				solicitacaos.setPonto(resultado.getDouble("horaVenda"));
				solicitacaos.setData_Solic(resultado.getString("prodComprado"));
				solicitacaos.setResposta(resultado.getString("resposta"));
				solicitacaos.setId_user_resposta(resultado.getInt("id_user_resposta"));
				solicitacaos.setUser_resposta(resultado.getString("user_resposta"));
				solicitacao.add(solicitacaos);
			}
		} catch(SQLException e) {
			System.err.println("Não foi possivel realizar ação");
		}
		return solicitacao;
	}
	
	public ArrayList<Solicitacao>mostrarPython(){
		Connection con = Conexao.receberConexao();
		ArrayList<Solicitacao> solicitacao = new ArrayList<>();
		String sql = "select * from vendas where tecnologia = python";
		PreparedStatement preparador;
		try {
			preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			while(resultado.next()) {
				Solicitacao solicitacaos = new Solicitacao();
				solicitacaos.setId_Solic(resultado.getInt("id"));
				solicitacaos.setTitulo(resultado.getString("titulo"));
				solicitacaos.setDesc_Solic(resultado.getString("nomeCliente"));
				solicitacaos.setPonto(resultado.getDouble("horaVenda"));
				solicitacaos.setData_Solic(resultado.getString("prodComprado"));
				solicitacaos.setResposta(resultado.getString("resposta"));
				solicitacaos.setId_user_resposta(resultado.getInt("id_user_resposta"));
				solicitacaos.setUser_resposta(resultado.getString("user_resposta"));
				solicitacao.add(solicitacaos);
			}
		} catch(SQLException e) {
			System.err.println("Não foi possivel realizar ação");
		}
		return solicitacao;
	}
	
	public ArrayList<Solicitacao>mostrarGo(){
		Connection con = Conexao.receberConexao();
		ArrayList<Solicitacao> solicitacao = new ArrayList<>();
		String sql = "select * from vendas where tecnologia = go";
		PreparedStatement preparador;
		try {
			preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			while(resultado.next()) {
				Solicitacao solicitacaos = new Solicitacao();
				solicitacaos.setId_Solic(resultado.getInt("id"));
				solicitacaos.setTitulo(resultado.getString("titulo"));
				solicitacaos.setDesc_Solic(resultado.getString("nomeCliente"));
				solicitacaos.setPonto(resultado.getDouble("horaVenda"));
				solicitacaos.setData_Solic(resultado.getString("prodComprado"));
				solicitacaos.setResposta(resultado.getString("resposta"));
				solicitacaos.setId_user_resposta(resultado.getInt("id_user_resposta"));
				solicitacaos.setUser_resposta(resultado.getString("user_resposta"));
				solicitacao.add(solicitacaos);
			}
		} catch(SQLException e) {
			System.err.println("Não foi possivel realizar ação");
		}
		return solicitacao;
	}
	
	
	public ArrayList<Solicitacao>mostrarC(){
		Connection con = Conexao.receberConexao();
		ArrayList<Solicitacao> solicitacao = new ArrayList<>();
		String sql = "select * from vendas where tecnologia = C";
		PreparedStatement preparador;
		try {
			preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			while(resultado.next()) {
				Solicitacao solicitacaos = new Solicitacao();
				solicitacaos.setId_Solic(resultado.getInt("id"));
				solicitacaos.setTitulo(resultado.getString("titulo"));
				solicitacaos.setDesc_Solic(resultado.getString("nomeCliente"));
				solicitacaos.setPonto(resultado.getDouble("horaVenda"));
				solicitacaos.setData_Solic(resultado.getString("prodComprado"));
				solicitacaos.setResposta(resultado.getString("resposta"));
				solicitacaos.setId_user_resposta(resultado.getInt("id_user_resposta"));
				solicitacaos.setUser_resposta(resultado.getString("user_resposta"));
				solicitacao.add(solicitacaos);
			}
		} catch(SQLException e) {
			System.err.println("Não foi possivel realizar ação");
		}
		return solicitacao;
	}
}
