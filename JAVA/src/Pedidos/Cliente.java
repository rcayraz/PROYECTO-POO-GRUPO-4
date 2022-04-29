package Pedidos;

public class Cliente extends Pedidos{
    private  String CodigoCliente;
    private  String Nombres ;
    private String Apellidos ;
    private String MedioContacto;
    private String Direccion;
    private String Distrito;
    private  String Telefono;
    private String correo;

    public Cliente(int codigoPedido, String pedidosRealizado, String estados, String codigoCliente, String nombres, String apellidos, String medioContacto, String direccion, String distrito, String telefono, String correo) {
        super(codigoPedido, pedidosRealizado, estados);
        CodigoCliente = codigoCliente;
        Nombres = nombres;
        Apellidos = apellidos;
        MedioContacto = medioContacto;
        Direccion = direccion;
        Distrito = distrito;
        Telefono = telefono;
        this.correo = correo;
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
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
