package Pedidos;

import java.util.ArrayList;
import java.util.List;

public class GestionPedidos {
    private List<Cliente> ListaCliente;
    private List<Pedidos> ListaPedidos;


    public  GestionPedidos(){
        ListaPedidos=new ArrayList<>();
        ListaCliente= new ArrayList<>();
    }
    public  void AgregarPedido(Pedidos objpedidos){
        ListaPedidos.add(objpedidos);
    }
    public  void AgregarCliente(Cliente obCliente){
        ListaCliente.add(obCliente);
    }
    public void ListarPedidos(){
        for (Pedidos obpedidos: ListaPedidos){
            System.out.println(obpedidos.toString());
        }
    }
    public void ListarClientes(){
        for (Cliente objcliente: ListaCliente){
            System.out.println(objcliente.toString());
        }
    }
}
