<!DOCTYPE html>
<html>
  <head>
    <title>Maior Menor? - MVC</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top: 15px">
  <div class="container">
    <div class="row">
      <div class="col-md-offset-4 col-md-4">
        <div class="panel panel-default">
          <div class="panel-heading">
            <h3 class="panel-title">Maior menor - MVC</h3>
          </div>
          <div class="panel-body">
          	<form>
            <div class="form-group">
              <input
                name="idade"
                type="number"
                class="form-control"
                placeholder="Idade">
            </div>
            <button
              class="btn btn-default">Calcular</button>
            </form>
          </div>
        </div>
		<b>Mensagem: ${mensagem}</b>
      </div>
    </div>
  </div>
</body>
</html>