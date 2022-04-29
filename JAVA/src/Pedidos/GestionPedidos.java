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
}
