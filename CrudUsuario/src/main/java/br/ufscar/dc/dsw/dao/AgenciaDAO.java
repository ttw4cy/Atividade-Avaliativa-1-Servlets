package br.ufscar.dc.dsw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.ufscar.dc.dsw.domain.Agencia;


public class AgenciaDAO extends GenericDAO {
  ublic void insert(Agencia agencia){
        String sql = "INSERT INTO agencia (email, senha, cnpj, nome, descricao, role) VALUES (?, ?, ?, ?) ";

        try{
            Connection conn = this.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);

            statement = conn.prepareStatement(sql);
            statement.setString(1, usuario.getEmail());
            statement.setString(2, usuario.getSenha());
            statement.setString(3, usuario.getCnpj());
            statement.setString(5, usuario.getNome());
            statement.setString(6, usuario.getDescricao());
            statement.setString(9, usuario.getRole());
            statement.executeUpdate();

            statement.close();
            conn.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
	
	public List<Agencia> getAll() {

        List<Agencia> listaAgencia = new ArrayList<>();

        String sql = "SELECT * from Agencia";

        try {
            Connection conn = this.getConnection();
            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String email = resultSet.getString("email");
                String senha = resultSet.getString("senha");
                String cnpj = resultSet.getString("cnpj");
                String nome = resultSet.getString("nome");
                String descricao = resultSet.getString("descricao");
                String role = resultSet.getString("role");
                Agencia agencia = new Agen(id, email, senha, cnpj, nome , descricao, role);
                listaAgencia.add(agencia);
            }

            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaAgencia;
    }

    public void update(Agencia agencia) {
        String sql = "UPDATE agencia SET email = ?, senha = ?, cnpj = ?, nome = ?, descricao = ?, role = ?, WHERE id = ?";

        try {
            Connection conn = this.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);

            statement = conn.prepareStatement(sql);
            statement.setString(1, agencia.getEmail());
            statement.setString(2, agencia.getsenha());
            statement.setString(3, agencia.getCnpj());
            statement.setString(5, agencia.getNome());
            statement.setString(6, agencia.getDescricao());
            statement.setString(9, agencia.getRole());
            statement.setLong(10, agencia.getId());
            statement.executeUpdate();

            statement.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(Agencia agencia){
        String sql = "DELETE FROM agencia where id = ?";

        try{
            Connection conn = this.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setLong(1, agencia.getId());
            statement.executeUpdate();

            statement.close();
            conn.close();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public Agencia getbyLogin(String login) {
        Agencia agencia = null;

        String sql = "SELECT * from Agencia WHERE login = ?";

        try {
            Connection conn = this.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, login);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
            	long id = resultSet.getLong("id");
            	String email = resultSet.getString("email");
                String senha = resultSet.getString("senha");
                String cnpj = resultSet.getString("cnpj");
                String nome = resultSet.getString("nome");
                String descricao = resultSet.getString("descricao");
                String role = resultSet.getString("role");

               agencia = new Agencia(id, email, senha, cnpj, nome , descricao, role);
            }

            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return agencia;
    }
  
  
}
