**Considere a classe Pessoa abaixo:**

public abstract class Pessoa {
    public abstract String getNome();
    public abstract void setNome(String nome);
    public abstract String getCpf();
    public abstract void setCpf(String cpf);
    public abstract String getRg();
    public abstract void setRg(String rg);
}

Implemente uma classe chamada **Professor, que herda de Pessoa.**

Além de cumprir com os requisitos impostos pelo relacionamento de herança, a classe Professor deve conter o atributo salario e respectivos métodos get e set.

Observe o caso de teste abaixo:
Test
```
Professor p1 = new Professor();
p1.setNome("Fulano");
p1.setCpf("12345678901");
p1.setRg("5321789-0");
p1.setSalario(5000.0);
System.out.printf("Nome: %s\n", p1.getNome());
System.out.printf("CPF: %s\n", p1.getCpf());
System.out.printf("RG: %s\n", p1.getRg());
System.out.printf("Salario: %.2f\n", p1.getSalario());
```
Result
```
Nome: Fulano
CPF: 12345678901
RG: 5321789-0
Salario: 5000.00
```
Response
```JAVA
public class Professor extends Pessoa {
    private double Salario;
    private String Cpf;
    private String nome;
    private String Rg;

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }
    
    
}
```
