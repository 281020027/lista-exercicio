package br.edu.uniaeso;

import com.opencsv.bean.CsvBindByName;

public class CsvAluno {

    @CsvBindByName
    private String nome;

    @CsvBindByName
    private int idade;

    @CsvBindByName
    private float nota;

    @Override
    public String toString() {
        return "Aluno [nome = " + nome + ", idade = " + idade + ", nota = " + nota + "]";
    }
}
