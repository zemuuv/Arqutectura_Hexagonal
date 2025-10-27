package aplicacion.casosdeuso;

import aplicacion.puertos.entrada.CrearPedidoCasoUso;
import dominio.modelo.Pedido;
import dominio.servicio.ServicioPedido;

public class CrearPedidoServicio implements CrearPedidoCasoUso{
    private final ServicioPedido servicio;

    public CrearPedidoServicio(ServicioPedido servicio) {
        this.servicio = servicio;
    }

    @Override
    public void crearPedido(Pedido pedido) {
        servicio.procesarPedido(pedido);
    }
}
