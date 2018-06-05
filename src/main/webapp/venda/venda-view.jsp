<!DOCTYPE html>
<html>
<head>
<title>Venda</title>
<meta charset="utf-8">
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top: 15px">
  <div class="container">
    <div class="row">
      <div class="col-md-offset-4 col-md-4">
        <ol class="breadcrumb">
          <li><a href="/">Menu</a></li>
          <li class="active">Venda</li>
        </ol>
        <div class="panel panel-default">
          <div class="panel-body">
            <form>
              <div class="form-group">
                <input
                  name="codigo"
                  value="${param.codigo}"
                  type="text"
                  placeholder="Código"
                  class="form-control">
              </div>
              <div class="form-group">
                <input
                  name="produto"
                  value="${param.produto}"
                  type="text"
                  placeholder="Produto"
                  class="form-control">
              </div>
              <div class="form-group">
                <input
                  name="quantidade"
                  value="${param.quantidade}"
                  type="number"
                  placeholder="Quantidade"
                  class="form-control">
              </div>
              <button class="btn btn-default">Gravar</button>
            </form>
          </div>
        </div>
        <div class="alert alert-info">${mensagem}</div>
      </div>
    </div>
  </div>
</body>
</html>