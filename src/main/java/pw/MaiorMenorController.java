package pw;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/exemplo-mvc/maior-menor")
public class MaiorMenorController extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

    	//Preparando os dados para o model.

    	String idadeStr = request.getParameter("idade");
        String mensagem = "Informe a idade.";
        if (idadeStr != null && !idadeStr.isEmpty()) {
            int idade = Integer.parseInt(idadeStr);

            //Executando o model.
            
            mensagem = MaiorMenorModel.calcular(idade);
        }

        //Adiciona a variável na requisição para o JSP trabalhar.
        
        request.setAttribute("mensagem", mensagem);
        
        //Redireciona requisição para o JSP.
        request.
        	getRequestDispatcher("/exemplo-mvc/maior-menor-view.jsp").
        	forward(request, response);
    }
}
