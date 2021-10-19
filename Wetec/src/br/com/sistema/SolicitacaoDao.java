package br.com.sistema;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;



public class SolicitacaoDao {
 
	public void cadastrar(Solicitacao Solicitaacao) {
		Connection con = Conexao.receberConexao();
		String sql = "insert into funcionario (nome, cpf, idade, rg, funcao, endereco, salario) values (?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, funcionario.getNome());
			preparador.setString(2, funcionario.getCpf());
			preparador.setInt(3, funcionario.getIdade());
			preparador.setString(4, funcionario.getRg());
			preparador.setString(5, funcionario.getFuncao());
			preparador.setString(6, funcionario.getEndereco());
			preparador.setDouble(7, funcionario.getSalario());
			preparador.execute();
			System.out.println("Funcionario Cadastrado com sucesso");
		} catch(SQLException e) {
			System.err.println("Não foi possivel cadastrar");
		}
	}
}
