package Exercicios.Exercicio3.test;

import Exercicios.Exercicio3.dominio.Departamento;
import Exercicios.Exercicio3.dominio.Empresa;
import Exercicios.Exercicio3.dominio.Funcionario;
import Exercicios.Exercicio3.dominio.Projeto;

public class SistemaDeEmpresaTest {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Chris Cintos");

        Departamento rh = new Departamento("RH");
        Departamento tech = new Departamento("TI");
        Departamento producao = new Departamento("Produção");

        Projeto projetos1 = new Projeto("Aprimoramento da Produção");
        Projeto projeto2 = new Projeto("Sistema de Vendas");
        Projeto projeto3 = new Projeto("Recrutamento Online");

        Funcionario igor = new Funcionario("Igor","Desenvolvedor Backend Junior");
        Funcionario leticia = new Funcionario("Leticia", "Assitente");
        Funcionario joao = new Funcionario("João", "Supervisor Produção");

        empresa.getDepartamentos().add(rh);
        empresa.getDepartamentos().add(tech);
        empresa.getDepartamentos().add(producao);
        empresa.getProjetos().add(projetos1);
        empresa.getProjetos().add(projeto2);
        empresa.getProjetos().add(projeto3);
        empresa.getFuncionarios().add(igor);
        empresa.getFuncionarios().add(leticia);
        empresa.getFuncionarios().add(joao);

        projetos1.getFuncionarios().add(igor);
        projeto2.getFuncionarios().add(leticia);
        projeto3.getFuncionarios().add(joao);

        rh.getFuncionarios().add(leticia);
        tech.getFuncionarios().add(igor);
        producao.getFuncionarios().add(joao);

        leticia.setDepartamento(rh);
        igor.setDepartamento(tech);
        joao.setDepartamento(producao);

        leticia.getProjetos().add(projetos1);
        igor.getProjetos().add(projeto2);
        joao.getProjetos().add(projeto3);

        empresa.imprime();

    }
}
