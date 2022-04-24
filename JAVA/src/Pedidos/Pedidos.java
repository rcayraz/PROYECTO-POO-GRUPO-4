package Pedidos;

public class Pedidos {
    private int CodigoPedido;
    private String PedidosRealizado;
    private String Estados;

    public Pedidos(int codigoPedido, String pedidosRealizado, String estados) {
        CodigoPedido = codigoPedido;
        PedidosRealizado = pedidosRealizado;
        Estados = estados;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "CodigoPedido=" + CodigoPedido +
                ", PedidosRealizado='" + PedidosRealizado + '\'' +
                ", Estados='" + Estados + '\'' +
                '}';
    }

    public int getCodigoPedido() {
        return CodigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        CodigoPedido = codigoPedido;
    }

    public String getPedidosRealizado() {
        return PedidosRealizado;
    }

    public void setPedidosRealizado(String pedidosRealizado) {
        PedidosRealizado = pedidosRealizado;
    }

    public String getEstados() {
        return Estados;
    }

    public void setEstados(String estados) {
        Estados = estados;
    }
}
