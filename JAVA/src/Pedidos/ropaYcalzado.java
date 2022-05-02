package Pedidos;
// se agrego el codigo de Abel

public class ropaYcalzado extends Productos {
    private String nombreProducto;
    private double precio;

    public ropaYcalzado(String codigo, String nombreProducto, double precio, String tipoProducto) {
        super(codigo, tipoProducto);
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ropaYcalzado{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                "} " + super.toString();
    }
 }

