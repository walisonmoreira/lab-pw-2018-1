package pw.venda.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VendaModel {

  private static Connection obterConexao() throws SQLException {
    //Estabelecer uma conexão com o banco de dados.
    String url = "jdbc:derby://localhost:1527/vendadb;create=true";
    String user = "app";
    String password = "app";
    return DriverManager.getConnection(url, user, password);
  }

  public static void incluir(Venda venda) throws SQLException {
    Connection conn = obterConexao();
    
    //Obter sentença SQL.
    String sql = "insert into venda (codigo, produto, quantidade) values (?, ?, ?)";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setString(1, venda.getCodigo());
    pstmt.setString(2, venda.getProduto());
    pstmt.setInt(3, venda.getQuantidade());
    pstmt.execute();
  }

  public static void salvar(Venda venda) throws SQLException {
    Connection conn = obterConexao();

    //Obter sentença SQL.
    String sql = "update venda set produto = ?, quantidade = ? where codigo = ?";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setString(1, venda.getProduto());
    pstmt.setInt(2, venda.getQuantidade());
    pstmt.setString(3, venda.getCodigo());
    pstmt.execute();
  }

  public static List<Venda> listar() throws SQLException {
    Connection conn = obterConexao();
    
    Statement stmt = conn.createStatement();
    String sql = "select codigo, produto, quantidade from venda order by codigo";
    ResultSet rs = stmt.executeQuery(sql);
  
    List<Venda> listaDeVendas = new ArrayList<Venda>();
    while (rs.next()) {
      // Cria um venda para o registro.
      Venda venda = new Venda();
      venda.setCodigo(rs.getString("codigo"));
      venda.setProduto(rs.getString("produto"));
      venda.setQuantidade(rs.getInt("quantidade"));
      // Adiciona o venda na lista de vendas.
      listaDeVendas.add(venda);
    }
    return listaDeVendas;
  }

  public static void excluir(Venda venda) throws SQLException {
    Connection conn = obterConexao();
    
    //Obter sentença SQL.
    String sql = "delete from venda where codigo = ?";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setString(1, venda.getCodigo());
    pstmt.execute();
  }

}
