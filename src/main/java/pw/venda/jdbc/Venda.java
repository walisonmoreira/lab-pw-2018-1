package pw.venda.jdbc;

public class Venda {
  private String codigo;
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  private String produto;
  public String getProduto() {
    return produto;
  }
  public void setProduto(String produto) {
    this.produto = produto;
  }

  private Integer quantidade;
  public Integer getQuantidade() {
    return quantidade;
  }
  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public boolean hasCodigo() {
    return codigo != null && !codigo.trim().equals("");
  }
}
