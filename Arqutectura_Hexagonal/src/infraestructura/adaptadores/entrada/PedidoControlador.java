package infraestructura.adaptadores.entrada;

import aplicacion.puertos.entrada.CrearPedidoCasoUso;
import dominio.modelo.Pedido;

public class PedidoControlador {

    private final CrearPedidoCasoUso casoUso;

    public PedidoControlador(CrearPedidoCasoUso casoUso) {
        this.casoUso = casoUso;
    }

    public void crearPedido(String id, String cliente, double total) {
        Pedido pedido = new Pedido(id, cliente, total);
        casoUso.crearPedido(pedido);
    }

}
