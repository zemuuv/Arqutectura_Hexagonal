package infraestructura.adaptadores.salida;

import aplicacion.puertos.salida.PedidoRepositorio;
import dominio.modelo.Pedido;

import java.util.HashMap;
import java.util.Map;

public class PedidosRepositorioMemoria implements PedidoRepositorio{
    private final Map<String, Pedido> pedidos = new HashMap<>();

    @Override
    public void guardar(Pedido pedido) {
        pedidos.put(pedido.getId(), pedido);
        System.out.println("💾 Pedido guardado en memoria: " + pedido.getCliente());
    }
}
