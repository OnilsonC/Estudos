package br.com.estudoscx.data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
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
    @NotEmpty(message = "E-mail Obrigatório")
    private String email;

    @FormParam("idade")
    private Integer idade;
    
    @FormParam("rua")
    @Size(min = 3, max = 60, message = "O nome da rua é obrigatório")
    private String rua;
    
    @FormParam("numero")
    private Integer numero;
    
    @FormParam("complemento")
    @Size(min = 3, max = 60, message = "O complemento é obrigatório")
    private String complemento;
    
    @FormParam("bairro")
    @Size(min = 3, max = 60, message = "O nome do bairro é obrigatório")
    private String bairro;
    
    @FormParam("cidade")
    @Size(min = 3, max = 60, message = "O nome da cidade é obrigatório")
    private String cidade;
    
    @FormParam("estado")
    @Size(min = 3, max = 20, message = "O nome do estado é obrigatório")
    private String estado;
    
    @FormParam("cep")
    @Size(min = 3, max = 20, message = "O cep obrigatório")
    private String cep;

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

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
