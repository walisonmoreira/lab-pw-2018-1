<!DOCTYPE html>
<html>
<head>
<title>Maior ou Menor? - MVC</title>
<meta charset="utf-8">
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top: 15px">
  <div class="container">
    <div class="row">
      <div class="col-md-offset-4 col-md-4">
        <ol class="breadcrumb">
          <li><a href="/">Menu</a></li>
          <li class="active">Menor ou Maior? MVC</li>
        </ol>
        <div class="panel panel-default">
          <div class="panel-body">
            <form>
              <div class="form-group">
                <input
                  name="idade"
                  value="${param.idade}"
                  type="number"
                  placeholder="Idade"
                  class="form-control">
              </div>
              <button class="btn btn-default">Calcular</button>
            </form>
          </div>
        </div>
        <div class="alert alert-info">${mensagem}</div>
      </div>
    </div>
  </div>
</body>
</html>