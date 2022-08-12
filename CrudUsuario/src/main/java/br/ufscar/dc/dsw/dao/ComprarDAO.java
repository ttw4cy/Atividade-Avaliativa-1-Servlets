package br.com.pacote.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.pacote.domain.Comprar;
import br.com.pacote.domain.Pacote;

public class ComprarDAO extends GenericDAO {
	public void insert(Comprar comprar) {

        String sql = "INSERT INTO Comprar (Codigo, usuario, pacote) VALUES (?, ?, ?)";

        try {
            Connection conn = this.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);;

            statement = conn.prepareStatement(sql);
            statement.setInt(1, comprar.getCodigo());
            statement.setInt(2, comprar.getUsuario());
            statement.setInt(3, comprar.getPacote());
            
            statement.executeUpdate();

            statement.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}