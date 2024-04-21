package br.edu.uniaeso;

import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class App {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("alunos.csv");

            CsvToBean<CsvAluno> csvToBean = new CsvToBeanBuilder<CsvAluno>(reader).withType(CsvAluno.class).build();

            List<CsvAluno> alunos = csvToBean.parse();

            for (CsvAluno aluno : alunos) {
                System.out.println(aluno);
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
