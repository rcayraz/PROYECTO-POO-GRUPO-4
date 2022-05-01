package Pedidos;

import java.lang.invoke.StringConcatException;
import java.util.Date;
import java.util.Random;

public class Pedidos  {
    private String CodigoPedido;
    private String PedidosRealizado;
    private String Estados;

    public Pedidos(String codigoPedido, String pedidosRealizado, String estados) {
        CodigoPedido = codigoPedido;
        PedidosRealizado = pedidosRealizado;
        Estados = estados;
    }

    public String getCodigoPedido() {
        return CodigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
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

    @Override
    public String toString() {
        return "Pedidos{" +
                "CodigoPedido='" + CodigoPedido + '\'' +
                ", PedidosRealizado='" + PedidosRealizado + '\'' +
                ", Estados='" + Estados + '\'' +
                '}';
    }
    public boolean ValidarPedido(){
        return true;
    }
}
