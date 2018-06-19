package pw.venda.jdbc;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/venda-jdbc/venda")
public class VendaController extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    String op = request.getParameter("op");
    op = (op == null ? "" : op);

    Venda venda = new Venda();
    venda.setCodigo(request.getParameter("codigo"));
    venda.setProduto(request.getParameter("produto"));
    String quantidadeStr = request.getParameter("quantidade");
    quantidadeStr = (quantidadeStr == null ? "0" : quantidadeStr);
    venda.setQuantidade(Integer.parseInt(quantidadeStr));

    List<Venda> vendas = null;
    try {
      if (op.equals("incluir")) {
        VendaModel.incluir(venda);
      } else if (op.equals("salvar")) {
        VendaModel.salvar(venda);
      } else if (op.equals("excluir")) {
        VendaModel.excluir(venda);
      }

      vendas = VendaModel.listar();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    
    //Adiciona a variável na requisição para o JSP trabalhar.
    request.setAttribute("vendas", vendas);

    //Redireciona requisição para o JSP.
    request.
      getRequestDispatcher("/venda-jdbc/venda-view.jsp").
      forward(request, response);
  }
}
