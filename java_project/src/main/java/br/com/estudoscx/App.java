package br.com.estudoscx;

import br.com.estudoscx.models.Pessoa;
import br.com.estudoscx.models.PessoaFisica;
import br.com.estudoscx.models.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;


public class App {


    public static void main(String[] args) {

//      Método Casting;
        int x = 10;
        int y = 3;

        double a = 3.0; double b = 5.0;
        double c =(double)x/y;

//        System.out.println(c);

        PessoaJuridica pj = new PessoaJuridica();
        pj.setId("1");
        pj.setCnpj("22.333.666/0001-02");
        pj.setNome("TesteSA");
        pj.setEmail("testesa@gmail.com");


        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome("Michel");
        pessoa.setSobrenome("Cardoso");
        pessoa.setEmail("cardomichel@gmail.com");
        pessoa.setIdade(40);

        PessoaFisica pessoa2 = new PessoaFisica();
        pessoa2.setNome("Danilo");
        pessoa2.setSobrenome("Barros");
        pessoa2.setEmail("danilo@gmail.com");
        pessoa2.setIdade(33);

//        System.out.println(pessoa.getNome() + " " +pessoa2.getNome());


//            Pessoa pessoa = new Pessoa("Onilson");
//            pessoa.setSobrenome("Cardoso");
//            pessoa.setEmail("onill@gmail.com");
//            pessoa.setIdade(33);
//                System.out.println(pessoa.toString());
//                System.out.println(pessoa.getSobrenome());

//            Pessoa pessoa2 = new Pessoa("Helena");
//            pessoa2.setSobrenome("Urbano");
//            pessoa2.setEmail("maah@gmail.com");
//            pessoa2.setIdade(63);
//                System.out.println(pessoa2.toString());
//                System.out.println(pessoa2.getSobrenome());

            List<Pessoa> pessoas = new ArrayList<>();
            pessoas.add(pessoa);
            pessoas.add(pessoa2);
            pessoas.add(pj);

            for (Pessoa cadastro: pessoas) {
//               System.out.println(cadastro);

               if (cadastro instanceof PessoaFisica) {
                   System.out.println(((PessoaFisica)cadastro).getSobrenome());
               }

               if (cadastro instanceof PessoaJuridica) {
                   System.out.println(((PessoaJuridica)cadastro).getCnpj());
               }
            }





//        pessoa.setNome("Onilson");
//            System.out.println(pessoa);



       // fors();
    }



        public static void fors() {


            String meuNome = "Onilson";
            String sobrenome = "Cardoso";
            int idade = 33;
            double preco = 30.75;

            System.out.println(meuNome + " " + sobrenome);
            System.out.println("idade: " + idade + " anos");
            System.out.println("Preço: " + preco);

            double valor1 = 22.60;
            double valor2 = 30.50;
            double soma = valor1 + valor2;


            System.out.println("soma = " + (valor1 + valor2));
            System.out.println("soma = " + soma);

            double total = soma(valor1, valor2);
            System.out.println("Total: " + total);

            List<String> numerais = new ArrayList<>();
            numerais.add(meuNome);
            numerais.add(sobrenome);
            numerais.add("Posição 2");

            for (int i = 0; i < numerais.size(); i++) {
                System.out.println(i);
//            - mostra todos os valores da lista.

                System.out.println(numerais.get(i));
//            - O get pega o item da posição específica, como foi colocado
//            o get na na variável i, ele vai escrever todos os itens da lista. se fosse 0 iria pegar o nome e se
//            fosse 1 iria pegar o sobrenome.

            }

            for (String item : numerais) {
                if (item.equals("Cardoso")) {
                    System.out.println(item);
                } else {
                    System.out.println("Não é Cardoso");

                }


                for (int i = 0; i < 100; i++) {

                    int valor = (i % 2);

                    if ((i % 2) == 0) {
                        System.out.println(i + " " + "É par");

                    } else {
                        System.out.println(i + " " + "É impar");
                    }
                }
            }
        }


        public static double soma ( double valor1, double valor2){
            return valor1 + valor2;


        }

//    }
    }

