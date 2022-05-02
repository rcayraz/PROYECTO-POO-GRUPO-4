package Pedidos;

public class Ventas extends Pedidos{
    private String CodigoVenta;
    private String FechaVenta;
    private int Cantidad;
    private Double PrecioBruto;
    private  Double PrecioNeto;

    public Ventas(String codigoPedido, String pedidosRealizado, String estados, String codigoVenta, String fechaVenta, int cantidad, Double precioBruto, Double precioNeto) {
        super(codigoPedido, pedidosRealizado, estados);
        CodigoVenta = codigoVenta;
        FechaVenta = fechaVenta;
        Cantidad = cantidad;
        PrecioBruto = precioBruto;
        PrecioNeto = precioNeto;
    }

    @Override
    public String toString() {
        return "" +
                "" + CodigoVenta + '\'' +
                "" + FechaVenta + '\'' +
                "" + Cantidad +
                "" + PrecioBruto +
                "" + PrecioNeto +
                "} " .toString();
    }

    public String getCodigoVenta() {
        return CodigoVenta;
    }

    public void setCodigoVenta(String codigoVenta) {
        CodigoVenta = codigoVenta;
    }

    public String getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        FechaVenta = fechaVenta;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double getPrecioBruto() {
        return PrecioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        PrecioBruto = precioBruto;
    }

    public Double getPrecioNeto() {
        return PrecioNeto;
    }

    public void setPrecioNeto(Double precioNeto) {
        PrecioNeto = precioNeto;
    }
    private  Double Descuento(){
        if(getProductos().getTipoProducto()=="MUEBLES"){
            return 10.00;

        }
        else if(getProductos().getTipoProducto()=="Artefactos")
        {
            return 5.00;
        }
        else{
            return 15.00;
        }
    }
/*
    public Double PrecioNeto(){

        return getProductos().getPrecio()- Descuento();

    }*/
}
