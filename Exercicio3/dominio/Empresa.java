package Exercicios.Exercicio3.dominio;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private ArrayList<Departamento> departamentos = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Projeto> projetos = new ArrayList<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public Empresa(String nome, ArrayList<Departamento> departamentos, ArrayList<Funcionario> funcionarios, ArrayList<Projeto> projetos) {
        this.nome = nome;
        this.departamentos = (departamentos != null) ? departamentos : new ArrayList<>();
        this.funcionarios = (funcionarios != null) ? funcionarios : new ArrayList<>();
        this.projetos = (projetos != null) ? projetos : new ArrayList<>();
    }

    public void imprime() {
        System.out.println(this.nome);
        if (!departamentos.isEmpty()) {
            for (Departamento departamento : departamentos) {
                System.out.print("Departamento: ");
                System.out.println(departamento.getNome());
                if (!departamento.getFuncionarios().isEmpty()) {
                    System.out.println("Funcionário: ");
                    for (Funcionario funcionario : departamento.getFuncionarios()) {
                        System.out.println(" - " + funcionario.getNome() + " (" + funcionario.getCargo() + ") ");
                    }
                } else {
                    System.out.println("Nenhum funcionário!");
                }
                System.out.println();
            }
        } else {
            System.out.println("Empresa ainda não possui nenhum departamento");
        }
        System.out.println("Projetos da Empresa");
        if (!projetos.isEmpty()){
            for (Projeto projeto : projetos) {
                System.out.println("Projeto: " + projeto.getNome());
                if (!projeto.getFuncionarios().isEmpty()){
                    for (Funcionario funcionario : projeto.getFuncionarios()) {
                        System.out.println("Funcionário: ");
                        System.out.println(" - "+funcionario.getNome() + " ("+funcionario.getCargo()+")");
                    }
                }
                System.out.println();
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }
}
