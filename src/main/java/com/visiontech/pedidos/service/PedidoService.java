package com.visiontech.pedidos.service;
import com.visiontech.pedidos.model.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoService {
    private static PedidoService instance;
    private List<Pedido> pedidos = new ArrayList<>();
    private PedidoService() {}
    public static PedidoService getInstance() {
        if (instance == null) instance = new PedidoService();
        return instance;
    }
    public void adicionarPedido(Pedido pedido) { pedidos.add(pedido); }
    public List<Pedido> listarPedidos() { return pedidos; }
}