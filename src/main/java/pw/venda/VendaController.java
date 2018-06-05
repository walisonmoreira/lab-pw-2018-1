package pw.venda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/venda/vender")
public class VendaController extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

    	//Preparando os dados para o model.

    	String codigo = request.getParameter("codigo");
    	String produto = request.getParameter("produto");
    	String quantidadeStr = request.getParameter("quantidade");
        String mensagem = "Informe os dados.";
        if (codigo != null && !codigo.isEmpty() && 
        	produto != null && !produto.isEmpty() &&
        	quantidadeStr != null && !quantidadeStr.isEmpty() ) {

        	int quantidade = Integer.parseInt(quantidadeStr);

            //Executando o model.
            
            mensagem = VendaModel.gravar(codigo, produto, quantidade);
        }

        //Adiciona a variável na requisição para o JSP trabalhar.
        
        request.setAttribute("mensagem", mensagem);
        
        //Redireciona requisição para o JSP.
        request.
        	getRequestDispatcher("/venda/venda-view.jsp").
        	forward(request, response);
    }

}
