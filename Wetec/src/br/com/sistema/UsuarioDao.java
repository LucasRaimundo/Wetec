package br.com.sistema;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;


public class UsuarioDao {

	public void cadastrar(Usuario usuario) {
		Connection con = Conexao.receberConexao();
		String sql = "insert into usuario (nome, dtNascimento, cpf, email, senha, nivel_conhecimento) values (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getDtNascimento());
			preparador.setString(3, usuario.getCpf());
			preparador.setString(4, usuario.getEmail());
			preparador.setString(5, usuario.getSenha());
			preparador.setString(6, usuario.getNivel_conhecimento());
			preparador.execute();
			System.out.println("Usuario Cadastrado com sucesso");
		} catch(SQLException e) {
			System.err.println("Não foi possivel cadastrar");
		}
	}
	
	public ArrayList<Usuario>mostrarTodos(){
		Connection con = Conexao.receberConexao();
		ArrayList<Usuario> usuarios = new ArrayList<>();
		String sql = "select * from usuario";
		PreparedStatement preparador;
		try {
			preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			while(resultado.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(resultado.getInt("id"));
				usuario.setNome(resultado.getString("nome"));
				usuario.setDtNascimento(resultado.getString("dtNascimento"));
				usuario.setCpf(resultado.getString("cpf"));
				usuario.setEmail(resultado.getString("email"));
				usuario.setNivel_conhecimento(resultado.getString("nivel_conhecimento"));
				usuario.setTecnologia(resultado.getString("tecnologia"));
				usuario.setPonto_acumulado(resultado.getDouble("ponto_acumulado"));
				usuarios.add(usuario);
				
			}
		}catch(SQLException e) {
			System.err.println("Não foi possivel realizar a busca");
		}
		return usuarios;
}
}
