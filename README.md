# Sistema de Controle de Notas e Frequência

## Descrição do Projeto

Este projeto foi desenvolvido como parte de um processo seletivo para estágio em desenvolvimento.

O sistema tem como objetivo auxiliar um professor a organizar as notas e a frequência de seus alunos. Cada aluno possui cinco notas, correspondentes às disciplinas lecionadas, além de um registro de frequência em percentual.

A aplicação permite cadastrar alunos, registrar suas notas e frequência, e realiza automaticamente cálculos importantes para acompanhamento do desempenho da turma.

---

# Instruções para executar o sistema

### 1. Pré-requisitos

É necessário possuir o Java instalado na máquina.

Verifique no terminal:

java -version
javac -version

---

### 2. Compilar o projeto

No diretório onde estão os arquivos `.java`, execute:

javac *.java

---

### 3. Executar o sistema

Após compilar, execute:

java Main

O sistema será executado no terminal e solicitará as informações necessárias para cadastro dos alunos.

---

# Lista de premissas assumidas

Algumas premissas foram consideradas para o desenvolvimento do sistema:

* Cada aluno possui exatamente **cinco notas**, correspondentes às cinco disciplinas ensinadas pelo professor.
* As notas devem estar no intervalo **0 a 10**.
* A frequência deve estar no intervalo **0% a 100%**.
* Alunos com **frequência inferior a 75%** são considerados em situação que requer atenção.
* A média do aluno é calculada pela **média das cinco notas**.

---

# Decisões de projeto

O sistema foi desenvolvido utilizando **Programação Orientada a Objetos em Java**.

Para organizar melhor o código e separar responsabilidades, o projeto foi dividido em três classes principais:

### Aluno

Responsável por representar um aluno, armazenando:

* nome
* notas
* frequência

Também contém o método responsável por calcular a média das notas.

### Turma

Responsável por armazenar a lista de alunos e realizar cálculos relacionados à turma, como:

* média da turma por disciplina
* média geral da turma

### Main

Classe principal do sistema, responsável por:

* interação com o usuário via terminal
* leitura dos dados
* validação de entradas
* exibição dos resultados

---

# Informações adicionais sobre o projeto

O sistema também implementa algumas melhorias para garantir maior robustez:

* **Validação de dados de entrada**, garantindo que notas e frequência estejam dentro dos limites definidos.
* **Formatação da saída**, exibindo médias com quatro casas decimais.
* Uso do método **toString()** para facilitar a exibição das informações dos alunos.

---

# Autor

Projeto desenvolvido para processo seletivo de estágio por Benjamin Doné.
