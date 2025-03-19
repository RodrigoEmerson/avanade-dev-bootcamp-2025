# Avanade Dev Bootcamp 2025

## Decola Tech 2025

### Java RESTful API criada para a Bootcamp 2025.

```mermaid
classDiagram
    class Product {
        +int id
        +String name
        +String description
        +String category
        +String brand
        +String barcode
        +double price
        +int stock
        +String expirationDate
    }

    class Supplier {
        +String name
        +String cnpj
        +String phone
    }

    class Feature {
        +String icon
        +String description
    }

    class Promotion {
        +double discount
        +double promotionalPrice
    }

    

    Product "1" -- "1..*" Feature : contains
    Product "1" -- "1" Supplier : has
    Product "1" -- "0..1" Promotion : offers
   

