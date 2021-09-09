
package com.estudos.certificacao;


public class SituacaoAluno {

	String nome;
	double n1;
	double n2;
	double media = (n1+n2)/2;



public SituacaoAluno(){

}

 public double getMedia(double media){
     media = (n1 + n2) /2;
     return media;
     
 }

	public static void main(String[] args) {
		
		SituacaoAluno aluno = new SituacaoAluno();
                aluno.nome = "Jorge";
               	aluno.n1 = 7.5;
				aluno.n2 = 8.0;
                aluno.getMedia((aluno.n1 + aluno.n2) /2);
               
                if (aluno.getMedia(0)<6){
		 
 			System.out.println (aluno.nome + ": Aluno(a) reprovado(a)");

		}else{
			System.out.println (aluno.nome + ": Aluno(a) aprovado(a)");
		}
                    
                System.out.println(aluno.getMedia(0));
	}

}
