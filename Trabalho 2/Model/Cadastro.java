/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author fabia
 */
public class Cadastro {
    private ArrayList<Aluno> chamada;
    
    public Cadastro(){
        chamada =new ArrayList<>();
    }

    public ArrayList<Aluno> getChamada() {
        return chamada;
    }

    public void setChamada(ArrayList<Aluno> chamada) {
        this.chamada = chamada;
    }

    @Override
    public String toString() {
        return "Cadastro: " + chamada;
    }
    
        
    public void cadastrarAluno(Aluno a1){
        chamada.add(a1);
    }  
    public void excluirAluno(Aluno a1){
        chamada.remove(a1);
    }
    
    public Aluno busca (int i) {
        return chamada.get(i);
    }
    
    
    public Aluno consultarAluno(int matricula){
        Aluno achei = null;
        for(int i=0; i<chamada.size() && achei==null;i++){
            if(chamada.get(i).getMatricula()==matricula){
                achei = chamada.get(i);
            }
        }
        return achei;
    }
    
    public String menorMedia() {
        // iniciei com o valor maximo de double para sinalizar como media nao encontrada no caso de nao ter ninguém
	double media = Double.MAX_VALUE;
	String aluno = "nao encontrado";

            for (int i = 0; i < chamada.size(); i++) {
                    if (chamada.get(i).getMedia() < media) {
                            media = chamada.get(i).getMedia();
                            aluno = chamada.get(i).getNome();
			}
		}
                    if (media == Double.MAX_VALUE) {
                            return "Aluno nao encontrado.";
		}
	return "Aluno com menor media:" + aluno + " com mÃ©dia " + media;
    }

    public String maiorMedia() {
	double media = -1;
	String aluno = "nao encontrado";
		for (int i = 0; i < chamada.size(); i++) {
			if (chamada.get(i).getMedia() >= media) {
				media = chamada.get(i).getMedia();
				aluno = chamada.get(i).getNome();
			}
		}
	return "Aluno com maior media: " + aluno + " com mÃ©dia " + media;
    }
    
    public ArrayList<Aluno> alunosAprovados () {
        ArrayList<Aluno> listaAlunosAprovados = new ArrayList<>();
         for (int i=0; i<chamada.size(); i++) {
            if(chamada.get(i).getMedia()>=6){
               listaAlunosAprovados.add(chamada.get(i));
            }
        }
         return listaAlunosAprovados;
    }
    
    public ArrayList<Aluno> alunosReprovados () {
        ArrayList<Aluno> listaAlunosReprovados = new ArrayList<>();
         for (int i=0; i<chamada.size(); i++) {
            if(chamada.get(i).getMedia()<6){
               listaAlunosReprovados.add(chamada.get(i));
            }
        }
         return listaAlunosReprovados;
    }
}