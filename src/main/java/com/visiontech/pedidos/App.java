package com.visiontech.pedidos;
import com.visiontech.pedidos.factory.PedidoFactory;
import com.visiontech.pedidos.model.Pedido;
import com.visiontech.pedidos.observer.Cliente;
import com.visiontech.pedidos.service.PedidoService;
import com.visiontech.pedidos.service.FreteExpresso;
import com.visiontech.pedidos.service.FreteNormal;
import com.visiontech.pedidos.builder.PedidoBuilder;

public class App {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jairo");
        Cliente cliente2 = new Cliente("Maria");

        Pedido pedido1 = PedidoFactory.criarPedido("NORMAL", "PED-001", 100.0);
        Pedido pedido2 = PedidoFactory.criarPedido("EXPRESS", "PED-002", 200.0);

        pedido1.addObserver(cliente1);
        pedido2.addObserver(cliente2);

        PedidoService service = PedidoService.getInstance();
        service.adicionarPedido(pedido1);
        service.adicionarPedido(pedido2);

        pedido1.processarPedido();
        pedido2.processarPedido();

        FreteNormal freteNormal = new FreteNormal();
        FreteExpresso freteExpresso = new FreteExpresso();

        System.out.println("Frete pedido1: " + freteNormal.calcularFrete(pedido1));
        System.out.println("Frete pedido2: " + freteExpresso.calcularFrete(pedido2));

        Pedido pedido3 = new PedidoBuilder()
                .setCodigo("PED-003")
                .setValor(150.0)
                .build();
        pedido3.addObserver(cliente1);
        service.adicionarPedido(pedido3);
        pedido3.processarPedido();
        System.out.println("Frete pedido3: " + freteNormal.calcularFrete(pedido3));

        System.out.println("\nTodos os pedidos:");
        for (Pedido p : service.listarPedidos()) {
            System.out.println(p.getCodigo() + " - " + p.getStatus());
        }
    }
}