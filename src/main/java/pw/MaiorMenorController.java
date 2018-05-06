package pw;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/exemplo-mvc")
public class MaiorMenorController extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String idadeStr = request.getParameter("idade");
        String mensagem = "Informe a idade.";
        if (idadeStr != null && !idadeStr.isEmpty()) {
            int idade = Integer.parseInt(idadeStr);
            if (idade >= 18) {
                mensagem = "Maior de idade.";
            } else {
                mensagem = "Menor de idade.";
            }
        }

        //"Imprimir a mensagem para o navegador."
        response.getOutputStream().print("Mensagem: " + mensagem);
    }
}
