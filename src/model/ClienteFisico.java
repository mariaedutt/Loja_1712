/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class ClienteFisico extends Cliente{
    private String cpf, rg;

    public ClienteFisico() {
    }

    public ClienteFisico(String nome, String endereco, String tipo, Cidade cidade) {
        super(nome, endereco, tipo, cidade);
        this.cpf = cpf;
        this.rg = rg;
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
    
}
