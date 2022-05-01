package Pedidos;

import java.util.ArrayList;
import java.util.List;

public class GestionPedidos {
    private List<Cliente> ListaCliente;

    public  GestionPedidos(){
        ListaCliente= new ArrayList<>();
    }

    @Override
    public String toString() {
        return "GestionPedidos{" +
                "ListaCliente=" + ListaCliente +
                '}';
    }

    public List<Cliente> getListaCliente() {
        return ListaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        ListaCliente = listaCliente;
    }
    public void RegistrarCliente(String codigoCliente, String nombres, String apellidos, String medioContacto, String direccion, String distrito, String telefono, String correo)
    {
        Cliente objCliente = new Cliente( codigoCliente,  nombres,  apellidos,  medioContacto,  direccion,  distrito,  telefono,  correo);
        ListaCliente.add(objCliente);
    }

    public void AsignarPedidoCliente(String codigoCliente,String codigoPedido,String pedidosRealizado,String estados){
        for (Cliente obClient:ListaCliente){
            if(obClient.getCodigoCliente().equals("codigoCliente")){
                obClient.RegistrarPedido(codigoPedido,pedidosRealizado,estados);
            }
        }

    }
}
