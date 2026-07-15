package cl.sphinxgo.feriapos.model.entity;

public class Producto {
    private int id;
    private String nombre;
    private Categoria categoria;
    private int precio;
    private boolean disponible;
    private boolean controlaStock;
    private int stock;
    private int alertaStock;

    public Producto(){

    }

    public Producto(int id, String nombre, Categoria categoria, int precio){
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.disponible = true;
        this.controlaStock= false;
        this.stock = 0;
        this.alertaStock = 5;
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public int getPrecio(){
        return precio;
    }

    public boolean isDisponible(){
        return disponible;
    }

    public boolean getControlaStock(){
        return controlaStock;
    }

    public int getStock(){
        return stock;
    }

    public int getAlertaStock(){
        return alertaStock;
    }

        // Metodos setters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public void setControlaStock(boolean controlaStock){
        this.controlaStock = controlaStock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public void setAlertaStock(int alertaStock){
        this.alertaStock = alertaStock;
    }

}
