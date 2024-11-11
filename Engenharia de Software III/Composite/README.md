# Composite
Composite é um Design Pattern que aplica a recursividade para retornar um calor comum em todas as entidades.
Ex: Retornar a soma do lucro total de diferentes variações de um modelo de carro.

## Diagrama UML
```mermaid
classDiagram
    class EmpresaComponent {
        <<interface>> 
        +calcularLucro() double
        +calcularGastos() double
    }

    class Empresa {
        -nome: String
        -lucro: double
        -gastos: double
        +calcularLucro() double
        +calcularGastos() double
    }

    class EmpresaMae {
        -nome: String
        -filiais: List<EmpresaComponent>
        +adicionarFilial(empresa: EmpresaComponent) void
        +removerFilial(empresa: EmpresaComponent) void
        +calcularLucro() double
        +calcularGastos() double
    }

    EmpresaComponent <|-- Empresa
    EmpresaComponent <|-- EmpresaMae
    EmpresaMae *--> EmpresaComponent
```