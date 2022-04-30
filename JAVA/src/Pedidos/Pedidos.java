package Pedidos;

import java.util.Date;
import java.util.Random;

public class Pedidos extends Cliente {
    private String CodigoPedido;
    private String PedidosRealizado;
    private String Estados;

    public Pedidos(String codigoCliente, String nombres, String apellidos, String medioContacto, String direccion, String distrito, String telefono, String correo, String codigoPedido, String pedidosRealizado, String estados) {
        super(codigoCliente, nombres, apellidos, medioContacto, direccion, distrito, telefono, correo);
        CodigoPedido = codigoPedido;
        PedidosRealizado = pedidosRealizado;
        Estados = estados;
    }

    public Pedidos() {

    }


    public void setCodigoPedido(String codigoPedido) {
        CodigoPedido = codigoPedido;
    }

    public void setPedidosRealizado(String pedidosRealizado) {
        PedidosRealizado = pedidosRealizado;
    }

    public void setEstados(String estados) {
        Estados = estados;
    }

    public String getCodigoPedido() {
        return CodigoPedido;
    }

    public String getPedidosRealizado() {
        return PedidosRealizado;
    }

    public String getEstados() {
        return Estados;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "CodigoPedido='" + CodigoPedido + '\'' +
                ", PedidosRealizado='" + PedidosRealizado + '\'' +
                ", Estados='" + Estados + '\'' +
                "} " + super.toString();
    }
    

}
