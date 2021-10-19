package br.com.sistema;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection receberConexao() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/wetec", "root", "");
			System.out.println("Banco conectado com sucesso");
		} catch (SQLException e) {
			System.err.println("Banco não conectado");
		}
		
		return con;
}
}
