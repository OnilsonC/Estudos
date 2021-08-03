package br.com.estudoscx.models;

public class PessoaFisica extends Pessoa {

    private String sobrenome;
    private Integer idade;



    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

}