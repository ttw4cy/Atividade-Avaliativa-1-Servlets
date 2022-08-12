package br.com.pacote.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.pacote.domain.Pacote;


public class PacoteDAO extends GenericDAO {
	public void insert(Pacote pacote) {

        String sql = "INSERT INTO Pacote (codigo, CNPJ, destino, dataPartida, Duracao, valor, foto) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = this.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);;

            statement = conn.prepareStatement(sql);
            statement.setInt(1, pacote.getCodigo());
            statement.setInt(2, pacote.getCNPJ());
            statement.setString(3, pacote.getDestino());
            statement.setInt(4, pacote.getDataPartida());
            statement.setInt(5, pacote.getDuracao());
            statement.setInt(6, pacote.getValor());
            statement.setString(7, pacote.getFoto());
            
            statement.executeUpdate();

            statement.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Pacote> getAll() {

        List<Pacote> listaPacote = new ArrayList<>();

        String sql = "SELECT * from Pacote u";

        try {
            Connection conn = this.getConnection();
            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int Codigo = resultSet.getInt("Codigo");
                int CNPJ = resultSet.getInt("CNPJ");
                String destino = resultSet.getString("destino");
                int dataPartida = resultSet.getInt("dataPartida");
                int Duracao = resultSet.getInt("Duracao");
                int valor = resultSet.getInt("valor");
                String foto = resultSet.getString("foto");
                Pacote pacote = new Pacote(Codigo, destino, dataPartida, Duracao, valor, foto, CNPJ);
                listaPacote.add(pacote);
            }

            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaPacote;
    }
    public void delete(Pacote pacote) {
        String sql = "DELETE FROM Pacote where Codigo = ?";

        try {
            Connection conn = this.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setInt(1, pacote.getCodigo());
            statement.executeUpdate();

            statement.close();
            conn.close();
        } catch (SQLException e) {
        }
    }

    public void update(Pacote pacote) {
        String sql = "UPDATE Pacote SET CNPJ = ?, destino = ?, dataPartida = ?, Duracao = ?, valor = ?, foto = ? WHERE Codigo = ?";

        try {
            Connection conn = this.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);

    
            statement.setInt(1, pacote.getCNPJ());
            statement.setString(2, pacote.getDestino());
            statement.setInt(3, pacote.getDataPartida());
            statement.setInt(4, pacote.getDuracao());
            statement.setInt(5, pacote.getValor());
            statement.setString(6, pacote.getFoto());
            statement.executeUpdate();

            statement.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Pacote getbyCodigo(int Codigo) {
    	Pacote pacote = null;

        String sql = "SELECT * from Pacote WHERE Codigo = ?";

        try {
            Connection conn = this.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setInt(1, Codigo);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String destino = resultSet.getString("destino");
                int dataPartida = resultSet.getInt("dataPartida");
                int Duracao = resultSet.getInt("Duracao");
                int valor = resultSet.getInt("valor");
                String foto = resultSet.getString("foto");
                int CNPJ = resultSet.getInt("CNPJ");

                pacote = new Pacote(Codigo, destino, dataPartida, Duracao, valor, foto, CNPJ);
                
            }

            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pacote;
    }
    public Pacote getbyCNPJ(int CNPJ) {
    	Pacote pacote = null;

        String sql = "SELECT * from pacote WHERE CNPJ = ?";

        try {
            Connection conn = this.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setInt(1, CNPJ);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
            	int Codigo = resultSet.getInt("Codigo");
            	String destino = resultSet.getString("destino");
            	int dataPartida = resultSet.getInt("dataPartida");
            	int Duracao = resultSet.getInt("Duracao");
            	int valor = resultSet.getInt("valor");
                String foto = resultSet.getString("foto");

                pacote = new Pacote(Codigo, destino, dataPartida, Duracao, valor, foto, CNPJ);
                
            }

            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pacote;
    } 
}
