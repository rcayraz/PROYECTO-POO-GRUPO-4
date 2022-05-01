package Pedidos;
// se agrego el avanze de Abel
public abstract class Productos {
    private String codigo;
    private String nombreProd;
    private double precio;
    private String tipoProducto;

    public Productos() {
    }

    public Productos(String codigo, String nombreProd, double precio) {
        this.codigo = codigo;
        this.nombreProd = nombreProd;
        this.precio = precio;
        establecerTipoProducto();
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public double getPrecio() {
        return precio;
    }




    @Override
    public String toString() {
        return "Productos{" +
                "codigo='" + codigo + '\'' +
                ", nombreProd='" + nombreProd + '\'' +
                ", precio=" + precio +
                ", tipoProducto='" + tipoProducto + '\'' +
                '}';
    }

    public void establecerTipoProducto() {
        if (codigo.contains("AE")) {
            tipoProducto = "Artefactos";
        } else if (codigo.contains("RC")) {
            tipoProducto = "Ropa";
        } else
            tipoProducto = "Muebles";
    }


    public boolean validarProducto() {
        if (this.codigo != null) {
            return true;
        }else {
            return false;
        }
    }

}




