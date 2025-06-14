package nascimento.thalles.src.entities;

/*
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.
*/

public class Ex03_Student {
    private String name;
    private float nota1;
    private float nota2;
    private float nota3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float notaFinal(){
        return nota1 + nota2 + nota3;
    }

    @Override
    public String toString(){
        float notaFinalAluno = this.notaFinal();

        if(notaFinalAluno >= 60){
            return String.format("Final Grade: %.2f%n" +
                    "PASS",
                    notaFinalAluno
            );
        }
        else{
            float diferenca = 60 - notaFinalAluno;
            return String.format("Final Grade: %.2f%n" +
                    "FAILED%n" +
                    "Missing %.2f Points",
                    notaFinalAluno,
                    diferenca
            );
        }
    }

}
