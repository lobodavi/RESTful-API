## Desafio de projeto

Construção de uma API RESTful usando java 17, springboot 3 e Railway.

Os codigos foram baseados nos codigos disponiveis no repositorio https://github.com/falvojr/santander-dev-week-2023/tree/master

## Diagrama de Classes
```mermaid
classDiagram
    class User {
        - name: String
        - account: Account
        - features: Feature[]
        - card: Card
        - news: News[]
    }
    
    class Account {
        - number: String
        - agency: String
        - balance: Double
        - limit: Double
    }

    class Feature {
        - icon: String
        - description: String
    }

    class Card {
        - number: String
        - limit: Double
    }

    class News {
        - icon: String
        - description: String
    }

    User --> Account
    User --> Feature
    User --> Card
    User --> News
