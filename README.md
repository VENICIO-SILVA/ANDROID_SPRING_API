Perfeito. Segue um **README profissional**, claro e bem organizado, no padrão que recrutador e dev experiente respeitam.
Você pode **copiar e colar direto no `README.md`** do repositório.

---

# ANDROID-SPRING-API

Projeto de estudo desenvolvido com o objetivo de **consolidar conhecimentos práticos** em desenvolvimento **Android + Back-end Java (Spring Boot)**, aplicando boas práticas desde o início, mesmo em um projeto simples.

A ideia central foi construir uma **API REST** integrada a um **aplicativo Android**, simulando um cenário real de comunicação cliente-servidor.

---

## 📌 Visão Geral

O projeto é dividido em três partes principais:

* **Android (Cliente)**
* **API Back-end (Java + Spring Boot)**
* **Banco de Dados (MySQL)**

Toda a comunicação entre o aplicativo e a API é feita via **requisições HTTP**, utilizando **Retrofit** no Android.

---

## 📱 Android (Cliente)

No aplicativo Android foi desenvolvido:

* Interface simples para cadastro de usuário
* Configuração completa do **Retrofit**
* `ApiService` para definição dos endpoints
* Uso de **DTOs** para envio e recebimento de dados
* Configuração de permissões (Internet)
* Organização do projeto em camadas

As requisições foram testadas **localmente**, utilizando a rede local (Wi-Fi), consumindo a API rodando na máquina.

### Tecnologias utilizadas

* Java
* Android Studio
* SpringBoot 4.0
* MySQL

---

## ⚙️ API / Back-end

A API foi desenvolvida utilizando **Spring Boot**, seguindo princípios de organização e responsabilidade bem definidas.

Mesmo sendo um projeto de estudo, foi aplicada uma estrutura pensada para **manutenibilidade e segurança**, incluindo:

* Separação de camadas (Controller, Service, Repository)
* Uso de **DTOs (Request / Response)** para controle de dados
* Validações claras
* Controle do que entra e sai da API
* Código legível e organizado
* Facilidade para futuras evoluções (ex: autenticação, segurança, regras de negócio)

---

## 🗄️ Banco de Dados

O banco de dados foi mantido simples para foco no aprendizado da integração:

Tabela `usuarios`:

* `id`
* `email`
* `senha`

---

## 🎯 Objetivo do Projeto

* Consolidar o aprendizado em **Spring Boot**
* Praticar integração **Android + API REST**
* Aplicar boas práticas desde projetos pequenos
* Evitar vícios técnicos
* Criar uma base sólida para projetos futuros mais complexos (ex: SaaS)

---

## 👨‍💻 Autor

**Venício Silva**
Estudante de Análise e Ciências da Computação
Focado em Back-end Java, Android e arquitetura de software.
