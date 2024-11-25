# Observer

Observer é um Design Pattern que busca otimizar a atualização de informações pertinentes, como o placar de um jogo de
futebol, quando determinado evento ocorre (um jogador marcou um gol, por exemplo)

## Diagrama UML

```mermaid
classDiagram
    class EventListener {
        <<interface>>
        + void sendMail(String data, String type, List<Client> clients)
    }

    class Loja {
        + List<Client> clients
        - List<EventListener> eventListeners
        - List<String> products
        + void addListener(EventListener eventListener)
        + void addProduct(String product)
        + void startSale()
        - void notifyClients(String data, String type)
    }

    class NewProductListener {
        + void sendMail(String data, String type, List<Client> clients)
    }

    class NewSaleListener {
        + void sendMail(String data, String type, List<Client> clients)
    }

    Loja o-- EventListener
    EventListener <|.. NewProductListener
    EventListener <|.. NewSaleListener
```
