package br.com.estudoscx.data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

public class CadastroForm {

    @FormParam("nome")
    @Size(min = 3, max = 20, message = "O nome é obrigatório")
    private String nome;

    @FormParam("sobrenome")
    @Size(min = 3, max = 20, message = "O sobrenome é obrigatório")
    private String sobrenome;

    @FormParam("email")
    @Email(message = "E-mail inválido")
    private String email;

    @FormParam("idade")
    @Size(min = 1, max = 3, message = "A idade é obrigatória")
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
