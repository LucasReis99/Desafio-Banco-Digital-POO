# Descrição do Projeto: Banco Digital em Java com Programação Orientada a Objetos

Este projeto consiste na implementação de um banco digital em Java, utilizando os conceitos de Programação Orientada a Objetos (POO) para criar uma solução prática e interativa. O objetivo é reforçar o conhecimento em POO, explorando os pilares da orientação a objetos no contexto bancário.

## Funcionalidades Implementadas:

* ### Abstração: Foram criadas abstrações para representar entidades essenciais no domínio bancário, como clientes, contas correntes e contas poupança.

* ### Encapsulamento: A implementação das classes encapsula seus atributos e métodos, fornecendo interfaces claras para o uso e ocultando a implementação detalhada.

* ### Herança: Utilizando a herança, foi possível definir uma classe base Conta que contém funcionalidades comuns para contas correntes e poupanças, evitando duplicação de código e permitindo a extensão de comportamento.

* ### Polimorfismo: O polimorfismo foi empregado ao chamar métodos como imprimirExtrato, que são implementados de forma diferente em cada classe de conta, mas são referenciados de forma genérica através da interface IConta.

## Principais Alterações/Adaptações:

* Criadas as classes Cliente, Conta, ContaCorrente e ContaPoupanca para representar entidades do domínio bancário.
* Implementadas funcionalidades como depósito, saque, transferência e impressão de extrato.
* Utilização de herança para reutilização de código e extensão de comportamento entre diferentes tipos de conta.
* Abstração dos objetos essenciais do domínio bancário, como clientes e contas, para facilitar a representação e manipulação no código.
* Encapsulamento das implementações das classes para fornecer interfaces de uso concisas e fáceis de entender.
* Utilização de interfaces para promover o polimorfismo, permitindo que objetos de diferentes tipos de conta sejam tratados de forma genérica.

## Conclusão:

Este projeto demonstra uma implementação prática dos conceitos de POO em Java no contexto de um banco digital. Além de reforçar o conhecimento em POO, esta implementação serve como base para futuras evoluções e melhorias no sistema bancário.








-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### Descrição da proposta do desafio 
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Criando um Banco Digital com Java e Orientação a Objetos

## 02/08/2021 - [Mentoria #1: Tire Suas Dúvidas Sobre Orientação a Objetos](https://www.youtube.com/watch?v=YS6ouOhkyNI)

Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário:
“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

### Abstração
Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão.

### Encapsulamento
Encapsular significa esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

### Herança
Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

### Polimorfismo
Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.
