package br.edu.uniaeso;

import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class App {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("produtos.csv");

            CsvToBean<Produto> csvToBean = new CsvToBeanBuilder<Produto>(reader).withType(Produto.class).build();

            List<Produto> produtos = csvToBean.parse();

            for (Produto produto : produtos) {
                System.out.println(produto);
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
