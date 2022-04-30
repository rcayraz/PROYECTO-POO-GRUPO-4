package Pedidos;

public class Cliente {
    private  String CodigoCliente;
    private  String Nombres ;
    private String Apellidos ;
    private String MedioContacto;
    private String Direccion;
    private String Distrito;
    private  String Telefono;
    private String correo;

    public Cliente(String codigoCliente, String nombres, String apellidos, String medioContacto, String direccion, String distrito, String telefono, String correo) {
        CodigoCliente = codigoCliente;
        Nombres = nombres;
        Apellidos = apellidos;
        MedioContacto = medioContacto;
        Direccion = direccion;
        Distrito = distrito;
        Telefono = telefono;
        this.correo = correo;
    }

    public Cliente() {
    }

    public String getCodigoCliente() {
        return CodigoCliente;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getMedioContacto() {
        return MedioContacto;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getDistrito() {
        return Distrito;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCodigoCliente(String codigoCliente) {
        CodigoCliente = codigoCliente;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public void setMedioContacto(String medioContacto) {
        MedioContacto = medioContacto;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void setDistrito(String distrito) {
        Distrito = distrito;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "CodigoCliente='" + CodigoCliente + '\'' +
                ", Nombres='" + Nombres + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", MedioContacto='" + MedioContacto + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", Distrito='" + Distrito + '\'' +
                ", Telefono='" + Telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }


}
