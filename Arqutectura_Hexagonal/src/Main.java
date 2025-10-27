

import aplicacion.casosdeuso.CrearPedidoServicio;
import dominio.servicio.ServicioPedido;
import infraestructura.adaptadores.entrada.PedidoControlador;
import infraestructura.adaptadores.salida.PedidosRepositorioMemoria;

public class Main {
    public static void main(String[] args) {
        // Adaptador de salida (persistencia)
        PedidosRepositorioMemoria repo = new PedidosRepositorioMemoria();

        // Lógica de dominio
        ServicioPedido servicio = new ServicioPedido(repo);

        // Caso de uso (aplicación)
        CrearPedidoServicio casoUso = new CrearPedidoServicio(servicio);

        // Adaptador de entrada (controlador)
        PedidoControlador controlador = new PedidoControlador(casoUso);

        // Simulación de ejecución
        controlador.crearPedido("1", "Samuel Vargas", 250.0);
    }
}
