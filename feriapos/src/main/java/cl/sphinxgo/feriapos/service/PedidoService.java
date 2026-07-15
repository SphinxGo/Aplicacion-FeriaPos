package cl.sphinxgo.feriapos.service;

import java.util.ArrayList;
import java.util.List;

import cl.sphinxgo.feriapos.model.entity.DetallePedido;
import cl.sphinxgo.feriapos.model.entity.Pedido;
import cl.sphinxgo.feriapos.model.enums.EstadoPedido;
import cl.sphinxgo.feriapos.model.enums.TipoPago;

public class PedidoService {
    private int siguienteId;
    private List<Pedido> pedidos;

    public PedidoService(){
        this.siguienteId =1;
        this.pedidos = new ArrayList<>();

    
    }



    public Pedido crearPedido(String nombreCliente,TipoPago tipoPago, List<DetallePedido> detalles){
        Pedido pedido = new Pedido(siguienteId,nombreCliente,tipoPago);
        for (DetallePedido detalle : detalles){
            pedido.agregarDetalle(detalle);
        }
        pedidos.add(pedido);
        siguienteId ++;
        return pedido;
    }

    /*public List<Pedido> obtenerPedidos(){

    }

    public Pedido buscarPedido(int id){
        return pedido;
    }

    public void cambiarEstadoPedido(int id, EstadoPedido estado){

    }*/


    
}
