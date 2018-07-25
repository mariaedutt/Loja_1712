
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Categoria;
import model.Cidade;
import model.Produto;

public class ProdutoDAO {
    public static boolean inserir(Produto produto){
        String sql = "INSERT INTO produtos "
            + " ( nome, preco, quantidade, perecivel, codCategoria ) "
            + " VALUES ( "
            + " '" + produto.getNome()                 + "' , "
            + " " + produto.getPreco()                + " , "
            + " " + produto.getQuantidade()           + " , "
            + " " + produto.isPerecivel()             + " , "
            + "  " + produto.getCategoria().getCodigo()+ "    "
            + " );";
        return Conexao.executar(sql);
    }
    
    
    public static boolean editar(Produto produto){
        String sql;
        sql = "UPDATE produtos SET "
                + " nome =     '" + produto.getNome()                     + "' , "
                + " preco = '" + produto.getPreco()                       + " , "
                + " quantidade =     " + produto.getQuantidade()         + " , "
                + " perecivel = " + produto.isPerecivel()                + " , "
                + " codCategoria = " + produto.getCategoria().getCodigo() + "   "
                + " WHERE codigo = " + produto.getCodigo();
        return Conexao.executar(sql);
    }
    
    public static boolean excluir(Produto produto){
        String sql = "DELETE FROM produtos "
                + " WHERE codigo = " + produto.getCodigo();
        return Conexao.executar(sql);
    }
    
    public static List<Produto> getProdutos(){
        List<Produto> lista = new ArrayList<>();
        String sql = "SELECT p.codigo, p.nome, p.preco, p.quantidade, p.perecivel, "
                + " c.codigo, c.nome"
                + " FROM produtos p "
                + " INNER JOIN categorias c ON p.codCategoria = c.codigo "
                + " ORDER BY p.nome";
        ResultSet rs = Conexao.consultar(sql);
        
        if(rs != null){
            try{
                while ( rs.next() ){
                    Produto pro = new Produto();
                    pro.setCodigo( rs.getInt(1));
                    pro.setNome(rs.getString(2));
                    
                    
                    Categoria cat = new Categoria();
                    cat.setCodigo (rs.getInt(5) );
                    cat.setNome (rs.getString(6));
                    
                    
                    
                    lista.add(pro);
                    
                }
            }catch(Exception e){
                JOptionPane.showInternalMessageDialog(null, e.toString());
            }
        }
        return lista;
    }
}
