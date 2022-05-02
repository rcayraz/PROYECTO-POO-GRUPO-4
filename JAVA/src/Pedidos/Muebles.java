package Pedidos;
//se agrego codigo de abel

public class Muebles extends Productos {
    private String nombreProd;
    private double precio;

    public Muebles(String codigo, String nombreProd, double precio, String tipoProducto) {
        super(codigo, tipoProducto);
        this.nombreProd = nombreProd;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Muebles{" +
                "nombreProd='" + nombreProd + '\'' +
                ", precio=" + precio +
                "} " + super.toString();
    }
}
