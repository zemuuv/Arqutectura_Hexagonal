package aplicacion.puertos.salida;

import dominio.modelo.Pedido;

public interface PedidoRepositorio {
    void guardar(Pedido pedido);
    }