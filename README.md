# 🚀 IPv4 Subnet Calculator API

API REST desenvolvida com Spring Boot para cálculo de sub-redes IPv4.

A aplicação recebe um endereço IPv4 com prefixo CIDR e retorna informações detalhadas da rede em formato JSON.

---

## 📖 Sobre o Projeto

O IPv4 Subnet Calculator API foi desenvolvido com o objetivo de disponibilizar cálculos de sub-redes IPv4 através de uma API REST, permitindo integração com aplicações web, desktop e mobile.

O projeto foi criado para praticar conceitos de desenvolvimento backend utilizando Java e Spring Boot, além de reforçar conhecimentos em Redes de Computadores e operações bitwise.

---

## 🚀 Funcionalidades

### Cálculos Disponíveis

* Endereço de Rede
* Endereço de Broadcast
* Primeiro Host Válido
* Último Host Válido
* Quantidade de Hosts
* Máscara de Rede
* Máscara Wildcard
* Tipo da Rede
* Representação Binária da Rede

### Validações

* IPv4 válido
* CIDR válido (0 a 32)
* Tratamento de erros HTTP
* Casos especiais `/31`
* Casos especiais `/32`

### Recursos da API

* Documentação automática com Swagger/OpenAPI
* Logs de requisições
* Logs de erros
* Tratamento global de exceções
* Respostas em formato JSON
* Testes unitários automatizados
* Testes de integração com MockMvc

---

## 📡 Endpoint

### Calcular Sub-rede

```http
GET /api/subnet?ip={IP/CIDR}
```

### Exemplo

```http
GET /api/subnet?ip=192.168.1.50/26
```

### Resposta de Sucesso

```json
{
  "rede": "192.168.1.0",
  "broadcast": "192.168.1.63",
  "primeiroHost": "192.168.1.1",
  "ultimoHost": "192.168.1.62",
  "quantidadeHost": 62,
  "mascara": "255.255.255.192",
  "wildCard": "0.0.0.63",
  "tipoRede": "Privada",
  "binarioRede": "11000000.10101000.00000001.00000000"
}
```

### Resposta de Erro

```json
{
  "erro": "IP inválido!"
}
```

---

## 📚 Documentação da API

Após iniciar a aplicação, a documentação Swagger estará disponível em:

```text
http://localhost:8080/swagger-ui/index.html
```

---

## 🛠️ Tecnologias Utilizadas

* Java 21
* Spring Boot
* Maven
* SpringDoc OpenAPI
* SLF4J
* Swagger UI
* Git
* GitHub
* Railway
* JUnit 5
* MockMvc

---

## 🧠 Conceitos Aplicados

### Redes de Computadores

* IPv4
* CIDR
* Máscara de Rede
* Broadcast
* Hosts
* Máscara Wildcard
* Sub-redes

### Programação

* Programação Orientada a Objetos
* Encapsulamento
* Conversão IPv4 ↔ Long
* Operações Bitwise
* Tratamento de Exceções
* Logging
* REST API

### Spring Boot

* Controllers
* Services
* Models
* Exception Handler
* JSON
* HTTP Status
* Swagger/OpenAPI
* MockMvc
* Testes de Integração

---

## 🔍 Logs

A aplicação registra eventos importantes para facilitar o monitoramento e a depuração.

### Requisições

```text
INFO - Requisição recebida para cálculo de sub-rede: 192.168.1.50/26
```

### Erros

```text
WARN - Erro de validação na requisição: IP inválido
```
## 🧪 Testes

O projeto possui testes automatizados para garantir a confiabilidade da aplicação.

### Testes Unitários

Validação da regra de negócio responsável pelos cálculos de sub-redes IPv4.

Cobertura dos cenários:

* Cálculo de sub-rede válido
* IPv4 inválido
* CIDR inválido
* Casos especiais `/31`
* Casos especiais `/32`

### Testes de Integração

Validação completa do fluxo da API utilizando MockMvc.

Cobertura dos cenários:

* Retorno HTTP 200 para requisições válidas
* Retorno HTTP 400 para IPv4 inválido
* Retorno HTTP 400 para CIDR inválido

### Resultado dos Testes

```text
Tests run: 9
Failures: 0
Errors: 0
BUILD SUCCESS 
```



## 👨‍💻 Autor

Desenvolvido por Davi Mancuso como projeto de estudo para praticar Java, Spring Boot, APIs REST e conceitos de Redes de Computadores.

---

## 🏷️ Versão Atual

v1.2.0

### Changelog

#### v1.2.0

* Adicionados testes unitários para validação das regras de negócio
* Adicionados testes de integração utilizando MockMvc
* Validação automatizada dos retornos HTTP da API
* Melhoria na qualidade e confiabilidade do código

#### v1.1.0

* Adicionado Swagger/OpenAPI
* Adicionado sistema de logs de requisições
* Adicionado sistema de logs de erros
* Melhorias na documentação da API

---

## 📄 Licença

Projeto desenvolvido para fins educacionais e aprendizado.
