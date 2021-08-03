package br.com.estudoscx;

import br.com.estudoscx.models.Pessoa;
import br.com.estudoscx.models.PessoaFisica;

import java.util.ArrayList;
import java.util.List;

      public class Treino {

    public static void main(String[] args) {


        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome("Joao");
        pessoa.setSobrenome("Jonas");
        pessoa.setEmail("joca@gmail.com");
        pessoa.setIdade(30);
//        System.out.println(pessoa);

        PessoaFisica pessoa2 = new PessoaFisica();
        pessoa2.setNome("Wanessa");
        pessoa2.setSobrenome("Patricio");
        pessoa2.setEmail("wanes07@gmail.com");
        pessoa2.setIdade(35);

//        System.out.println(pessoa2);

        List<PessoaFisica> cadastro = new ArrayList<>();
        cadastro.add(pessoa);
        cadastro.add(pessoa2);

        for (PessoaFisica item : cadastro) {

                System.out.println(item.getNome() + " " + item.getSobrenome());




        }
    }
}
