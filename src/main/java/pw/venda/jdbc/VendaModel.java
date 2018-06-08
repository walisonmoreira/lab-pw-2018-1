package pw.venda.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendaModel {
  
  private static VendaModel instance;
  private Connection conexao;
  
  public static VendaModel getInstance() {
    if (instance == null) {
      instance = new VendaModel();
    }
    return instance;
  }

  private VendaModel() {
    // Obter conexão com o banco de dados.
    try {
      conexao = DriverManager.getConnection("jdbc:derby://localhost:1527/vendadb;create=true", "app", "app");
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

  public String gravar(String codigo, String produto, int quantidade) {

    try {
      // Criando uma sentença.
      PreparedStatement stmt = conexao.prepareStatement(
          "insert into venda "
          + "(codigo, produto, quantidade) values (?, ?, ?)");
      
      stmt.setString(1, codigo);
      stmt.setString(2, produto);
      stmt.setInt(3, quantidade);

      stmt.executeUpdate();

    } catch (Exception e) {
      return e.getMessage();
    }

    return "Operação realizada com sucesso";
  }

}
