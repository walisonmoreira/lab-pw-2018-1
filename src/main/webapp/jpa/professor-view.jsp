<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<%@page import="pw.professor.jpa.Professor"%>
<html>

  <head>
    <title>Professores</title>
  </head>

  <body>
    <h1>Professores</h1>
    <form>
      <table>
        <tr>
          <td>Matr�cula</td>
          <td><input name="matricula"></td>
        </tr>
        <tr>
          <td>Nome:</td>
          <td><input name="nome"></td>
        </tr>
      </table>
      <button name="operacao" value="incluir">Incluir</button>
      <button name="operacao" value="excluir">Excluir</button>
      <button name="operacao" value="alterar">Alterar</button>
    </form>
    <b>${msg}</b>
    <hr>
    <table border="1">
      <tr>
        <th>Matr�cula</th>
        <th>Nome</th>
        <th>A��es</th>
      </tr>
      <%
      ArrayList<Professor> professores =
        (ArrayList<Professor>) request.getAttribute("professores");
      for (Professor professor : professores) {
      %>
      <tr>
        <td><%=professor.getMatricula()%></td>
        <td><%=professor.getNome()%></td>
        <td><a href="professores?operacao=excluir&matricula=<%=professor.getMatricula()%>">Excluir</a></td>
      </tr>
      <%}%>
    </table>
  </body>

</html>