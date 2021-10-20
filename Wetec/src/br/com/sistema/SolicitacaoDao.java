package br.com.sistema;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;



public class SolicitacaoDao {
 
	public void cadastrar(Solicitacao solicitacao) {
		Connection con = Conexao.receberConexao();
		String sql = "insert into solicitacao (titulo, desc_solic, data_solic) values (?, ?, ?)";
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
}
