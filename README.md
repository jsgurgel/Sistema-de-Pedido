# Sistema de Pedidos em Java – Padrões de Projeto - Bootcamp DIO e Accenture

## **Descrição do Projeto**
Este projeto é um exemplo completo de **Sistema de Pedidos** em Java, desenvolvido para demonstrar a aplicação prática de **Padrões de Projeto (Design Patterns)**. Ele permite criar pedidos, processá-los, calcular frete e notificar clientes sobre alterações de status.  

O projeto é modular e organizado em pacotes que separam responsabilidades, seguindo boas práticas de programação orientada a objetos.

---

## **Funcionalidades**
- Criar pedidos de tipos diferentes: **Normal** e **Express**.
- Processar pedidos e atualizar seu status.
- Calcular frete usando diferentes estratégias.
- Notificar clientes automaticamente quando o status do pedido muda.
- Criar pedidos complexos usando **Builder**.
- Gerenciar todos os pedidos usando um serviço **Singleton**.

---

## **Padrões de Projeto Utilizados**

| Padrão       | Descrição                                                                 |
|--------------|---------------------------------------------------------------------------|
| **Singleton** | `PedidoService`: garante instância única para gerenciamento de pedidos. |
| **Factory**   | `PedidoFactory`: cria diferentes tipos de pedidos sem acoplamento.      |
| **Strategy**  | `FreteStrategy`, `FreteNormal`, `FreteExpresso`: cálculos de frete flexíveis. |
| **Observer**  | `Cliente`, `PedidoStatusObserver`: notificação automática de mudança de status. |
| **Builder**   | `PedidoBuilder`: facilita criação de pedidos complexos de forma clara e fluida. |

---

## **Estrutura do Projeto**

```
src/main/java/com/visiontech/pedidos/
├── model/
│   ├── Pedido.java
│   ├── PedidoNormal.java
│   └── PedidoExpress.java
├── factory/
│   └── PedidoFactory.java
├── service/
│   ├── PedidoService.java
│   ├── FreteStrategy.java
│   ├── FreteNormal.java
│   └── FreteExpresso.java
├── observer/
│   ├── PedidoStatusObserver.java
│   └── Cliente.java
├── builder/
│   └── PedidoBuilder.java
└── App.java
```

---

## **Como Executar**

1. Abra o projeto em uma IDE compatível com Java (IntelliJ, Eclipse ou VSCode com Java).
2. Compile todos os arquivos `.java`.
3. Execute a classe principal `App.java`.
4. Observe a saída no console, que mostrará:
   - Processamento de pedidos
   - Notificações para clientes
   - Cálculo de frete
   - Listagem de todos os pedidos e seus status

---

## **Exemplo de Saída**

```
Processando pedido NORMAL: PED-001
Notificação para Jairo dos Santos Gurgel: Pedido PED-001 mudou para PROCESSADO
Processando pedido EXPRESS: PED-002
Notificação para Maria: Pedido PED-002 mudou para PROCESSADO EXPRESS
Frete pedido1: 10.0
Frete pedido2: 40.0
Processando pedido NORMAL: PED-003
Notificação para Jairo: Pedido PED-003 mudou para PROCESSADO
Frete pedido3: 15.0

Todos os pedidos:
PED-001 - PROCESSADO
PED-002 - PROCESSADO EXPRESS
PED-003 - PROCESSADO
```

---

## **Conclusão**
Este projeto demonstra como aplicar diferentes **Padrões de Projeto** em Java, proporcionando um sistema modular, extensível e fácil de manter. Ele serve como referência prática para **Singleton, Factory, Strategy, Observer e Builder**, sendo ideal para estudo e experimentação com design patterns.