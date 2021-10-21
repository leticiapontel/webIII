/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Aluno;
import Model.Cadastro;
import java.util.Scanner;

/**
 *
 * @author fabia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cadastro cad = new Cadastro();
        byte escolher;
        
        do{
            System.out.println("Opções: "
                    + "\n 1-Cadastrar aluno"
                    + "\n 2-Consultar um aluno"
                    + "\n 3-Excluir um aluno"
                    + "\n 4-Consultar o aluno com a maior média"
                    + "\n 5-Consultar o aluno com a menor média"
                    + "\n 6-Listar todos os alunos aprovados"
                    + "\n 7-Listar todos os alunos reprovados");
            escolher = ler.nextByte();
            
            switch(escolher){
                case 1:
                    Aluno a = new Aluno();
                    System.out.print("Informe o nome do aluno: ");
                    a.setNome(ler.next());
                    System.out.print("Informe o CPF do aluno: ");
                    a.setCpf(ler.nextInt());
                    System.out.print("Informe o número da matrícula: ");
                    a.setMatricula(ler.nextInt());
                    System.out.print("Informe a média: ");
                    a.setMedia(ler.nextDouble());
                    cad.cadastrarAluno(a);
                    break;
                case 2:
                    System.out.println(cad);
                    break;
                case 3:
                    Aluno excluir = new Aluno();
                    System.out.print("Informe o número da matrícula do aluno ");
                    int matricula = ler.nextInt();
                    excluir = cad.busca(matricula);
                    System.out.println("Confirme a exclusão da matrícula: " + excluir.getMatricula() + "?"
                                        + "\n 1 - SIM"
                                        + "\n 2 - NÃO");
                    byte op = ler.nextByte();
                    if(op==1){
                        cad.excluirAluno(excluir);
                        System.out.print("Matrícula excluída!");
                    }else{
                        System.out.print("Operação cancelada!");
                    }
                    break;
                case 4:
                    System.out.print(cad.maiorMedia());
                    break;
                case 5:
                    System.out.print(cad.menorMedia());
                    break;
                case 6:
                    System.out.print(cad.alunosAprovados());
                    break;
                case 7:
                    System.out.print(cad.alunosReprovados());
                    break;
                case 0: 
                    System.out.print("Programa encerrado.");
                    break;
                default:
                    System.out.print("Opção inválida!");
                }
        }while(escolher!=0);
    }
    
}