Em Java, o tratamento de exceções é realizado utilizando as palavras-chave try, catch, finally e, opcionalmente, throws. Aqui estão as principais palavras-chave e práticas comuns para lidar com exceções:

##1.try:
- A palavra-chave try é usada para envolver o código que pode lançar uma exceção.
- O bloco try contém o código que deve ser monitorado quanto a exceções.

##2.catch:
- A palavra-chave catch é usada para capturar e tratar exceções.
- O bloco catch é executado se uma exceção do tipo especificado ocorrer dentro do bloco try.
- Pode haver múltiplos blocos catch para tratar diferentes tipos de exceções.

##3.finally:
- A palavra-chave finally é usada para definir um bloco de código que será executado independentemente de ocorrer ou não uma exceção.
- É útil para ações que devem ser realizadas, como liberação de recursos, independentemente do sucesso ou falha do bloco try.

##4.throws:
- A palavra-chave throws é usada na assinatura de um método para indicar que o método pode lançar exceções de um determinado tipo.
- Ela transfere a responsabilidade de lidar com a exceção para quem chama o método.
- Útil quando o método não pode lidar adequadamente com uma exceção e deseja sinalizar que algo inesperado pode ocorrer.


Práticas comuns para lidar com exceções em Java:

##1.Especificar exceções apropriadas:
- Capture e trate exceções específicas em vez de usar blocos genéricos.
- Isso ajuda a lidar de maneira mais precisa com diferentes situações excepcionais.

##2.Evitar blocos catch vazios:
- Evite deixar blocos catch vazios, pois isso pode dificultar a depuração de problemas.

##3.Liberação de recursos em finally:
- Utilize o bloco finally para garantir a liberação de recursos, como fechamento de arquivos ou conexões de banco de dados.

##4.Não engula exceções sem necessidade:
- Evite engolir exceções sem tratamento adequado. Se não for possível lidar com a exceção, pelo menos logue-a para facilitar a identificação de problemas.

##5.Utilizar try-with-resources:
- A partir do Java 7, é possível utilizar a declaração try-with-resources para garantir o fechamento automático de recursos como AutoCloseable ou Closeable.