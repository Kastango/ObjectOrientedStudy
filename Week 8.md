# 1.

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

# 2 

Observe o código fonte das classes abaixo:
```
public class Pessoa {
   private String nome;
   public String getNome() {  return nome; }
   public void setNome(String nome) { this.nome = nome; }
}

public abstract class Aluno extends Pessoa {
    private int ra;
    private double notaDisciplinas;

    public abstract double getNotaFinal();

    public int getRa() { return ra; }
    public void setRa(int ra) { this.ra = ra; }
    public double getNotaDisciplinas() { return notaDisciplinas; }
    public void setNotaDisciplinas(double notaDisciplinas) { this.notaDisciplinas = notaDisciplinas; }
}
```
Implemente as classes AlunoGraduacao e AlunoMestrado, que herdam de Aluno, atendendo as seguintes afirmações:

Atributos:
 - AlunoGraduacao tem o atributo notaTCC do tipo double.
 - AlunoMestrado tem os atributos notaDissertacao do tipo double e artigosPublicados do tipo inteiro.

Construtores:
 - Ambas as classes têm construtor para inicializar os atributos.
 - Siga a ordem dos atributos estabelecida no caso de teste abaixo.

Métodos:
 - Implemente get e set para todos os atributos.
 - Defina a implementação do método getNotaFinal(), de acordo com as seguintes regras:
    - AlunoGraduacao: a nota final é composta pela média aritmética simples entre a nota das disciplinas e nota do TCC.
    - AlunoMestrado: a nota final é composta pela média aritmética simples entre a nota das disciplinas e nota da dissertação. No entanto, se o aluno não publicou artigos a nota deve ser 0 (zero).

A sua implementação deve atender aos casos de teste abaixo:
```
Aluno alunos[] = new Aluno[4];
alunos[0] = new AlunoGraduacao("Jonas", 1234, 7.8, 10.0); // nome, ra, notadisciplinas, notatcc
alunos[1] = new AlunoGraduacao("Maria", 5522, 9.8, 7.0);
alunos[2] = new AlunoMestrado("Pedro", 3311, 7.5, 8.5, 0); // nome, ra, notadisciplinas, notadissertacao, artigos
alunos[3] = new AlunoMestrado("Patricia", 7098, 9.5, 9.5, 3);
for (int i=0; i<alunos.length; i++){
    System.out.printf("Aluno(a): %s, Nota Final: %.2f\n", alunos[i].getNome(), alunos[i].getNotaFinal());
}
```

Resultado
```
Aluno(a): Jonas, Nota Final: 8.90
Aluno(a): Maria, Nota Final: 8.40
Aluno(a): Pedro, Nota Final: 0.00
Aluno(a): Patricia, Nota Final: 9.50
````
Response
```JAVA 
public class AlunoMestrado extends Aluno {
    double notaDissertacao;
    int artigosPublicados;
    
    public AlunoMestrado(String nome, int ra, double notaDisciplinas, double notaDissertacao, int artigosPublicados){
        this.setNome(nome);
        this.setRa(ra);
        this.setNotaDisciplinas(notaDisciplinas);
        
        this.notaDissertacao = notaDissertacao;
        this.artigosPublicados = artigosPublicados;
        
    }

    public double getNotaDissertacao() {
        return notaDissertacao;
    }

    public void setNotaDissertacao(double notaDissertacao) {
        this.notaDissertacao = notaDissertacao;
    }

    public int getArtigosPublicados() {
        return artigosPublicados;
    }

    public void setArtigosPublicados(int artigosPublicados) {
        this.artigosPublicados = artigosPublicados;
    }
    
    @Override
    public double getNotaFinal(){
        if(this.artigosPublicados < 1){
            return 0;
        }
        else{
            return (getNotaDisciplinas() + this.notaDissertacao)/2;
        }
        
    }
    
    
}

public class AlunoGraduacao extends Aluno {
    private double notaTCC;
    
    public AlunoGraduacao(String nome, int ra, double notaDisciplinas, double notaTCC){
        this.setNome(nome);
        this.setRa(ra);
        this.setNotaDisciplinas(notaDisciplinas);
        this.notaTCC = notaTCC;
        
    }
    
    public double getNotaTCC() {
        return notaTCC;
    }

    public void setNotaTCC(double notaTCC) {
        this.notaTCC = notaTCC;
    }
    
    @Override
    public double getNotaFinal(){
        return (getNotaDisciplinas() + this.notaTCC)/2;
    } 
}
```
