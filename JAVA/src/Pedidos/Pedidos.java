package Pedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedidos  {
    private String CodigoPedido;
    private String PedidosRealizado;
    private String Estados;
    private  Productos productos;
    private List<Productos> ListaProductos;

    public Pedidos(String codigoPedido, String pedidosRealizado, String estados) {
        CodigoPedido = codigoPedido;
        PedidosRealizado = pedidosRealizado;
        Estados = estados;
        productos = productos;
        ListaProductos = new ArrayList<>();



    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "CodigoPedido='" + CodigoPedido + '\'' +
                ", PedidosRealizado='" + PedidosRealizado + '\'' +
                ", Estados='" + Estados + '\'' +
                ", productos=" + productos +
                ", ListaProductos=" + ListaProductos +
                '}';
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

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public List<Productos> getListaProductos() {
        return ListaProductos;
    }

    public void setListaProductos(List<Productos> listaProductos) {
        ListaProductos = listaProductos;
    }

 /*   public boolean  validarProductoSolicitado(String ProductoBuscado){
        for(Productos objProductos:getListaProductos()){
            if(objProductos.getNombreProd().equals(ProductoBuscado)){
                ListaProductos.add(objProductos);
                return  true;
            }

        }

        return false;
    }*/
}
