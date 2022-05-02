package Pedidos;

public class ArtefactosElec extends Productos {
    private String nombreProducto;
    private double precio;

    public ArtefactosElec(String codigo, String nombreProducto, double precio, String tipoProducto) {
        super(codigo, tipoProducto);
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }



    @Override
    public String toString() {
        return "ArtefactosElec{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                "} " + super.toString();
    }
}






