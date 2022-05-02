package Pedidos;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private  String CodigoCliente;
    private  String Nombres ;
    private String Apellidos ;
    private String MedioContacto;
    private String Direccion;
    private String Distrito;
    private  String Telefono;
    private String Correo;
    private List<Pedidos> listaPedidos;

    public Cliente(String codigoCliente, String nombres, String apellidos, String medioContacto, String direccion, String distrito, String telefono, String correo) {
        CodigoCliente = codigoCliente;
        Nombres = nombres;
        Apellidos = apellidos;
        MedioContacto = medioContacto;
        Direccion = direccion;
        Distrito = distrito;
        Telefono = telefono;
        Correo = correo;
        listaPedidos = new ArrayList<>();
    }

    public Cliente() {

    }

    @Override
    public String toString() {
        return "\n " + CodigoCliente + '\'' +
                ", " + Nombres + '\'' +
                ", " + Apellidos + '\'' +
                ", " + MedioContacto + '\'' +
                ", " + Direccion + '\'' +
                ", " + Distrito + '\'' +
                ", " + Telefono + '\'' +
                ", " + Correo + '\'' +
                '}';
    }

    public String getCodigoCliente() {
        return CodigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        CodigoCliente = codigoCliente;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getMedioContacto() {
        return MedioContacto;
    }

    public void setMedioContacto(String medioContacto) {
        MedioContacto = medioContacto;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String distrito) {
        Distrito = distrito;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public List<Pedidos> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(List<Pedidos> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public void RegistrarPedido(String CodigoPedido,String PedidosRealizado,String Estados){
        Pedidos objPedidos = new Pedidos(CodigoPedido,PedidosRealizado,Estados);
        listaPedidos.add(objPedidos);

    }
}
