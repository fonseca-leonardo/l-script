# Descrição da linguagem

### Iniciando o código

#### Java

```java
public class MainClass{
  public static void main(String args[]){
    // Comandos aqui
  }
}
```

#### L-script

```
inicio
    // Comandos aqui
fim;
```

### Tipos de variáveis

```
String -> txt
double -> num
boolean -> binario
```

### Criando variável e atribuindo valores

#### Java

```java
int variavel;
variavel = 1234;
```

#### L-script

```
num variavel;
variavel := 1234;
```

### IF

#### Java

```java
if(a>b) {
    // faz alguma coisa
} else {
    // faz outra coisa
}
```

#### L-script

```
caso(a>b) {
    // faz alguma coisa
} caso contrario {
    // faz outra coisa
}
```

### FOR

#### Java

```java
for(int i = 10; i <= 10; ++i) {
    // repete 10 vez
}
```

#### L-script

```
repete(10, contador) {
    // repete 10 vez, e a variavel contador é onde fica armazenado o valor da iteração
}
```

### WHILE

#### Java

```java
while(a==2) {
    // repete ate "a" deixar de ser igual a 2
}
```

#### L-script

```
enquanto (a == true) {
    // repete ate "a" deixar de se true
}
```

### Imprimindo e lendo valores

#### Java

```java
Scanner _key = new Scanner(System.in);
String leitura = _key.nextLine();
System.out.println(leitura)
```

#### L-script

```
txt leitura;
ler(leitura);
imprimir(leitura);
```
