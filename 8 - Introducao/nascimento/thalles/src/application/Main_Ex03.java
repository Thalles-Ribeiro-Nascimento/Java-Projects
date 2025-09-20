package nascimento.thalles.src.application;

/*
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.
 */

import nascimento.thalles.src.entities.Ex03_Student;

import java.util.Locale;

public class Main_Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Ex03_Student student = new Ex03_Student();
        student.setName("Alex Green");
        student.setNota1(20.0f);
        student.setNota2(30.0f);
        student.setNota3(0.0f);

        System.out.print(student);

    }

}
