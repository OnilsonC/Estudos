package br.com.estudoscx;

import br.com.estudoscx.models.Pessoa;
import br.com.estudoscx.models.PessoaFisica;
import br.com.estudoscx.models.PessoaJuridica;
import br.com.estudoscx.singleton.PessoaSingleton;

import java.util.ArrayList;
import java.util.List;

      public class Treino {

    public static void main(String[] args) {


        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome("Maria");
        pessoa.setSobrenome("Helena");
        pessoa.setEmail("Maaah@gmail.com");
        pessoa.setIdade(63);
        System.out.println(pessoa);

        PessoaFisica pessoa2 = new PessoaFisica();
        pessoa2.setNome("Wanessa");
        pessoa2.setSobrenome("Patricio");
        pessoa2.setEmail("wanes07@gmail.com");
        pessoa2.setIdade(35);



        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Pjteste");
        pj.setCnpj("22.666.845/0002-7");
        pj.setEmail("pjteste@teste.com");

        System.out.println(pessoa2);

        List<Pessoa> cadastro = new ArrayList<>();
        cadastro.add(pessoa);
        cadastro.add(pessoa2);
        cadastro.add(pj);

        for (Pessoa item : cadastro) {
//            System.out.println(item);
//              System.out.println(item.getNome() + " " + item.getSobrenome());




        }
   }
}
