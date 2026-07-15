package cl.sphinxgo.feriapos.model.entity;

public class Categoria {
    private int id;
    private String nombre;
    private boolean activa;

    public Categoria(){

    }

    public Categoria(int id,String nombre){
        this.id = id;
        this.nombre = nombre;
        this.activa = true;
    };

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public boolean isActiva(){
        return activa;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setActiva(boolean activa){
        this.activa = activa;
    }
}
