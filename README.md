# Projeto de estudo de Microserviços com Spring Cloud

Este projeto é um serviço de gerenciamento de tarefas desenvolvido em Java utilizando o framework Spring Boot. 

## Funcionalidades e tecnologias:

- **Java**: Linguagem de programação principal utilizada no desenvolvimento do projeto.
- **Spring Boot**: Framework que facilita a criação de aplicações Java standalone, produção-ready, com configuração mínima.
- **Spring Scheduling**: Utilizado para agendar tarefas periódicas, como o envio de notificações para tarefas próximas do prazo.
- **Spring Data JPA**: Facilita a interação com o banco de dados, utilizando o Hibernate como implementação JPA.
- **H2 Database**: Banco de dados em memória utilizado para desenvolvimento e testes.
- **Spring Cloud Config**: Gerenciamento centralizado de configurações para aplicações distribuídas.
- **Eureka**: Serviço de descoberta utilizado para registrar e localizar serviços.
- **Maven**: Ferramenta de gerenciamento de dependências e build do projeto.

O projeto inclui um serviço de notificação que envia alertas por e-mail para tarefas que estão prestes a vencer, utilizando um cliente de notificação. As tarefas são verificadas e notificadas periodicamente através de um agendamento configurado com Spring Scheduling. Além disso, o projeto expõe uma API REST para criação e gerenciamento de tarefas.
