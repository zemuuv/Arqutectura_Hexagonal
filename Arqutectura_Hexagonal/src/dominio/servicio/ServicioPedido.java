package dominio.servicio;

import aplicacion.puertos.salida.PedidoRepositorio;
import dominio.modelo.Pedido;

public class ServicioPedido {
    private final PedidoRepositorio repositorio;

    public ServicioPedido(PedidoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void procesarPedido(Pedido pedido) {
        if (!pedido.esValido()) {
            throw new IllegalArgumentException("Pedido inválido: total o cliente incorrecto");
        }
        repositorio.guardar(pedido);
        System.out.println("✅ Pedido procesado correctamente");
    }
}