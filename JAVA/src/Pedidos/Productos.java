package Pedidos;
// se agrego el avanze de Abel
 public abstract class Productos {
    private String codigo;
    private String tipoProducto;

    public Productos() {
    }

    public Productos(String codigo, String tipoProducto) {
        this.codigo = codigo;
        this.tipoProducto = tipoProducto;
        establecerTipoProducto();
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public String getCodigo(){
        return codigo;
    }




    @Override
    public String toString() {
        return "\nProductos{" +
                "codigo='" + codigo + '\'' +
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




