package cl.sphinxgo.feriapos.model.entity;

public class DetallePedido {
    private Producto producto;
    private int cantidad;
    private int precioUnitario;
    

    public DetallePedido(){

    }

    public DetallePedido(Producto producto, int cantidad){
        this.producto = producto;
        this.precioUnitario = producto.getPrecio();
        this.cantidad = cantidad;
        
    }

    public int calcularSubtotal(){
        return cantidad * precioUnitario;
    }

    public Producto getProducto(){
        return producto;
    }

    public int getCantidad(){
        return cantidad;
    }

    public int getPrecioUnitario(){
        return precioUnitario;
    }

    public String getNombreProducto(){
        return producto.getNombre();
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }


}
