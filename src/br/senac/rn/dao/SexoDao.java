
package br.senac.rn.dao;

import br.senac.rn.model.Sexo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class SexoDao {
    
    private final DataBase db;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql; 
    
    public SexoDao(){
        db = new DataBase();
    }
    
    public boolean insert(Sexo sexo){
        
    } 
    
    public boolean delete(Sexo sexo){
    
    }
    
    public boolean update(Sexo sexo){
    
    }
    
    public List<Sexo> selectAll(){
    
    }
    
    public Sexo selectById(int id){
    
    }
    
    public Sexo selectByFilter(String filter){
    
    }
}
