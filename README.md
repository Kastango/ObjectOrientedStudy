# Orientação de Objetos

## Tópicos da segunda prova

### Week 8 - Classes Abstratas
  **Classe Abstrata** é desenvolvida para representar entidades e conceitos abstratos, ela é sempre uma superclasse que não possui instâncias. Nela cria-se metodos
  abstratos, com o objetivo de serem implementado em suas classes concretas derivadas.
  ```JAVA 
    public abstract class Pessoa {
      private String nome;
      private int idade;
      
      public abstract void exibirDados();
      
      public String getNome() {  return nome; }
      public void setNome(String nome) { this.nome = nome; }
      
      public int getIdade() { return idade; }
      public int setIdade(int idade) { this.idade = idade; }
  }   
  ```
  
  **Classe Concretas** são classes que implementam todos os seus metodos e permitem a criação de instâncias, uma classe concreta também não possui métodos abstratos,
  e geralmente são derivadas de classes abstratas.
  ```JAVA
  public class Aluno extends Pessoa {
    public void exibirDados() {
      System.out.println("Nome: "+getNome()+" Idade: "+getIdade());
    }
  }
  ```
  
  **Classe Final** ou **Métodos Finais** são coisas que não poderam ser estendidas ou sobrescritas, variando de projeto para projeto a necessidade de uma implementação como essa.
  `public final class Aluno extends Pessoa` ou 
  `public final void exibirDados()`. Além disso atributos também poderão ser finais, retornando um erro caso a tentativa de sobrescrever, representa a declaração de uma constante.
### Week 9 - Interfaces
A interface determina quais são os métodos que obrigatoriamente devem ser declaradoss e implementados na classe, entretanto não define como eles devem ser implementados, apenas definir entradas e sainda, como uma especie de contrato entre a classe e interface.
Interface utiliza `Implements` e é um corpo dos métodos que vao ser usado

### Week 10 - Tratamento de Exceções

### Week 11 - Java Colections
