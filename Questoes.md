# Biancardy Lima - Instrução Pratica 01

1. O que é uma classe em Java e qual é a diferença entre uma classe e um
objeto? Dê 5 exemplos mostrando-os em C++ e em Java.

R: Uma classe em Java é uma estrutura que define um tipo de objeto. Ela é uma espécie de modelo para criar objetos. Uma classe encapsula dados (atributos) e comportamentos (métodos) que operam nesses dados. Em outras palavras, uma classe é um projeto ou um plano para criar objetos.

Diferença entre uma classe e um objeto:
Classe: É um modelo ou um plano para criar objetos. Define os atributos e métodos comuns a todos os objetos de um tipo específico.

Objeto: É uma instância de uma classe. Representa uma entidade do mundo real e é criado a partir de uma classe. Um objeto possui valores específicos para seus atributos.

Cinco exemplos de classes em C++ e suas equivalentes em Java:

Exemplo 1: Classe Pessoa
C++:

class Pessoa {
public:
    string nome;
    int idade;
};
Java:

public class Pessoa {
    String nome;
    int idade;
}
Exemplo 2: Classe Carro
C++:

class Carro {
public:
    string modelo;
    int ano;
};
Java:

public class Carro {
    String modelo;
    int ano;
}
Exemplo 3: Classe Retângulo
C++:

class Retangulo {
public:
    float comprimento;
    float largura;
};
Java:

public class Retangulo {
    float comprimento;
    float largura;
}
Exemplo 4: Classe Conta Bancária
C++:

class ContaBancaria {
public:
    string titular;
    double saldo;
};
Java:

public class ContaBancaria {
    String titular;
    double saldo;
}
Exemplo 5: Classe Livro
C++:

class Livro {
public:
    string titulo;
    string autor;
};
Java:

public class Livro {
    String titulo;
    String autor;
}

2. Como você declara uma variável em Java e quais são os tipos de dados
primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na
linguagem C++

R:  Em Java, você declara variáveis especificando o tipo de dado seguido pelo nome da variável.
Exemplo:
int idade;
idade = 25;

int numero = 42;

Tipos de Dados Primitivos em Java:
Os tipos de dados primitivos em Java são divididos em quatro categorias:

Inteiros:

byte (8 bits)
short (16 bits)
int (32 bits)
long (64 bits)
Ponto Flutuante:

float (32 bits)
double (64 bits)
Caracteres:

char (16 bits)
Booleanos:

boolean (representa verdadeiro ou falso)
Paralelo em C++:
A declaração de variáveis em C++ é semelhante, mas você pode precisar incluir cabeçalhos específicos e 
usar a palavra-chave auto para deduzir o tipo automaticamente. Exemplo comparativo:

int idade;
idade = 25;

int numero = 42;


3. Explique o conceito de herança em Java e como você pode criar uma
subclasse a partir de uma classe existente. Faça um paralelo com C++,
apresentando 5 exemplos.

R: Herança em Java:
A herança é um conceito fundamental na programação orientada a objetos (OOP) que permite criar uma nova classe 
baseada em uma classe existente. Em Java, você pode criar uma subclasse (também chamada de classe derivada) que 
herda os atributos e métodos da classe base (também chamada de superclasse). 
Isso facilita a reutilização de código e a criação de hierarquias de classes.
Sintaxe em Java:
// Definição da superclasse (classe base)
public class Animal {
    String nome;

    public void fazerBarulho() {
        System.out.println("Algum som genérico");
    }
}

// Definição da subclasse (classe derivada)
public class Cachorro extends Animal {
    public void fazerBarulho() {
        System.out.println("Au au!");
    }

    public void cavarBuraco() {
        System.out.println("Cavando um buraco...");
    }
}

Paralelo em C++:
A herança em C++ é semelhante a Java, mas com algumas diferenças na sintaxe.

4. Quando declaramos uma variável em Java, temos, na verdade, um ponteiro.
Em C++ é diferente. Discorra sobre esse aspecto. 

R: A declaração de variáveis em Java e C++ difere fundamentalmente no tratamento de ponteiros. Vou explicar essas diferenças em cada linguagem.

Em Java:
Java é uma linguagem de programação que foi projetada com um foco forte em segurança e simplicidade. Em Java, você não lida diretamente com ponteiros como em C++. Quando você declara uma variável em Java, está criando uma referência a um objeto ou um valor primitivo, mas não um ponteiro direto para a memória.

Por exemplo, ao declarar uma variável em Java:

int idade = 25;
A variável idade contém o valor 25, mas não é um ponteiro que aponta diretamente para a posição de memória onde esse valor está armazenado. Em Java, você lida com referências, mas não tem acesso direto aos ponteiros subjacentes, o que contribui para a segurança e simplicidade da linguagem.

Em C++:
C++ é uma linguagem que oferece mais controle direto sobre a memória, e você pode usar ponteiros para manipular essa memória de forma mais direta. Ao contrário de Java, em C++ você pode declarar variáveis que são ponteiros, e esses ponteiros podem ser usados para apontar diretamente para posições de memória.

Exemplo em C++:

int idade = 25;  // Variável com valor inteiro
int* ponteiroIdade = &idade;  // Ponteiro para a posição de memória de 'idade'
No exemplo acima, ponteiroIdade é um ponteiro que armazena o endereço de memória de idade. Isso permite manipular diretamente o valor de idade por meio do ponteiro.

Essa capacidade de manipular ponteiros em C++ oferece flexibilidade, mas também requer cuidado para evitar erros de acesso indevido à memória, como vazamentos de memória ou referências a áreas inválidas da memória.

Em resumo, em Java, as variáveis são referências a objetos ou valores primitivos, enquanto em C++, você pode trabalhar diretamente com ponteiros, o que oferece mais controle sobre a manipulação de memória, mas também exige mais responsabilidade por parte do programador.





