# Santnder-bootcamp-2024
##Diagrama de classes
```mermaid
classDiagram
    class Cliente {
        +String name
        +Account account
        +Card card
        +Feature[] features
        +News[] news
    }
    
    class Account {
        +String number
        +String agency
        +float balance
        +float limit
    }
    
    class Feature {
        +String icon
        +String description
    }
    
    class Card {
        +String cardNumber
        +float cardLimit
    }
    
    class News {
        +String newsIcon
        +String newsDescription
    }

    Cliente *-- Account
    Cliente *-- Card
    Cliente *-- Feature
    Cliente *-- News
```_
 
