package cl.sphinxgo.feriapos.model.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import cl.sphinxgo.feriapos.model.enums.TipoPago;
import cl.sphinxgo.feriapos.model.enums.EstadoPedido;

public class Pedido {
    private int id;
    private String nombreCliente;
    private List<DetallePedido> detalles;
    private TipoPago tipoPago;
    private EstadoPedido estado;
    private LocalDate fecha;
    private LocalTime hora;

    
    public Pedido (int id,String nombreCliente,TipoPago tipoPago){
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.detalles = new ArrayList<>();
        this.tipoPago = tipoPago;
        this.estado = EstadoPedido.PENDIENTE;
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();

    }

    public int getId(){
        return id;
    }

    public String getNombreCliente(){
        return nombreCliente;
    }

    public List<DetallePedido> getDetalles(){
        return detalles;
    }

    public TipoPago getTipoPago(){
        return tipoPago;
    }

    public EstadoPedido getEstado(){
        return estado;
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public LocalTime getHora(){
        return hora;
    }

    // METODOS SETTERS

    public void setTipoPago(TipoPago tipoPago){
        this.tipoPago = tipoPago;
    }

    public void setEstado(EstadoPedido estado){
        this.estado = estado;
    }






    public void agregarDetalle(DetallePedido detalle){
        detalles.add(detalle);
    }

    public void eliminarDetalle(DetallePedido detalle){
        detalles.remove(detalle);
    }

    public int calcularTotal(){
        int total = 0;
        for (DetallePedido detalle : detalles){
            total += detalle.calcularSubtotal();
        }
        return total;
    }
}
