# Projeto Arquitetura RPC - Estudo

Este projeto é um exemplo de arquitetura de comunicação via RPC (Remote Procedure Call) utilizando Spring Boot. Ele possui um servidor SOAP que fornece um serviço, e um cliente REST que se comunica com este serviço para obter informações de schemas.

## Visão Geral

O projeto consiste em dois módulos principais:
1. **Servidor SOAP (RPC)**: Serviço SOAP que expõe um endpoint dinâmico para cada schema disponível.
2. **Cliente REST**: Serviço que se conecta ao servidor SOAP e permite realizar requisições para testar a conexão e acessar os dados dos schemas.

## Estrutura do Projeto

- circuit-client: configuration -> resource -> service (rest template)
- circuit-server: configuration -> infrasctructure -> jdbc -> ws
