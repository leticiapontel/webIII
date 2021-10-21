/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author fabia
 */
public class Aluno {
    private String nome;
    private double matricula, cpf, media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    

    @Override
    public String toString() {
        return "Aluno: " + nome 
                + "\n Número da matricula: " + matricula 
                + "\n cpf: " + cpf 
                + "\n media: " + media;
    }

}
