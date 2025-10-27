package dominio.modelo;

public class Pedido {
    private final String id;
    private final String cliente;
    private final double total;

    public Pedido(String id, String cliente, double total) {
        this.id = id;
        this.cliente = cliente;
        this.total = total;
    }

    public String getId() { return id; }
    public String getCliente() { return cliente; }
    public double getTotal() { return total; }

    public boolean esValido() {
        return total > 0 && cliente != null && !cliente.trim().isEmpty();
    }
}
