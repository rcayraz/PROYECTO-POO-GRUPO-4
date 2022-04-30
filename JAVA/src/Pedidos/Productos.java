package Pedidos;
// se agrego el avanze de Abel
public abstract class Productos {
    private String tipoP;
    private String codigo;
    private String nombreProd;
    private double precio;
    private int stock;


    public Productos() {
    }

    public Productos(String codigo, String nombreProd, double precio, int stock) {
        this.codigo = codigo;
        this.nombreProd = nombreProd;
        this.precio = precio;
        this.stock = stock;
    }

    public Productos(String tipoP, String codigo, String nombreProd, double precio, int stock) {
        this.tipoP = tipoP;
        this.codigo = codigo;
        this.nombreProd = nombreProd;
        this.precio = precio;
        this.stock = stock;
    }

    public String getTipoP() {
        return tipoP;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "clasificacionP='" + tipoP + '\'' +
                ", codigo='" + codigo + '\'' +
                ", nombreProd='" + nombreProd + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

}




