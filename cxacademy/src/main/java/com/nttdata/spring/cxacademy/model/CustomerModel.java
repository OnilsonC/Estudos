package com.nttdata.spring.cxacademy.model;


import javax.persistence.*;

@Entity(name = "Customer")
public class CustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer code;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sobrenome;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private boolean availableOnline;

    @Column(nullable = false)
    private String endereco;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

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

    public boolean isAvailableOnline() {
        return availableOnline;
    }

    public void setAvailableOnline(boolean availableOnline) {
        this.availableOnline = availableOnline;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "endereco='" + endereco + '\'' +
                '}';
    }
}
