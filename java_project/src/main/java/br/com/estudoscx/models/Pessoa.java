package br.com.estudoscx.models;

public class Pessoa {
   protected String id;
   protected String nome;
   protected String email;

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   @Override
   public String toString() {
      return "Pessoa{" +
              "id=" + id +
              ", nome='" + nome + '\'' +
              ", email='" + email + '\'' +
              '}';
   }
}