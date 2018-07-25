
package model;

public class Cidade {
    private int codigo;
    private String nome;
    
    public Cidade(){
        
    }
    
    public Cidade (int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public String toString(){
        return nome;
    }
    public int getCodigo(){
        return this.codigo; 
    }
    
    public void setCodigo (int codigo){
        this.codigo = codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
       this.nome = nome;
    }
    
  
    
}
