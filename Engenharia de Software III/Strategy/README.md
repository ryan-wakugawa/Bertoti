# Strategy

Strategy é um Design Pattern que busca relacionar entidades de uma forma melhor do que a Herança, removendo código
redundante das classes filhas.
Para atingir esse objetivo, é utlizada uma interface.

- A classe principal é chamada de Contexto(Context)
- As classes filhas são chamadas de Estratégias(Strategies).

## Diagrama UML

```mermaid
classDiagram
    class Nivel {
        <<interface>>
        + double calcular(double multiplicador, double distancia)
        + double getMultiplicador()
    }

    class Economica {
        + double multiplicador = 0.8
        + double calcular(double multiplicador, double distancia)
        + double getMultiplicador()
    }

    class Executiva {
        + double multiplicador = 1.25
        + double calcular(double multiplicador, double distancia)
        + double getMultiplicador()
    }

    class Padrao {
        + double multiplicador = 1
        + double calcular(double multiplicador, double distancia)
        + double getMultiplicador()
    }

    class Passagem {
        - Nivel nivel
        - double distancia
        + void setNivel(Nivel nivel)
        + void setDistancia(double distancia)
        + double calcularPassagem()
    }

    Nivel <|.. Economica
    Nivel <|.. Executiva
    Nivel <|.. Padrao
    Passagem o-- Nivel
```
