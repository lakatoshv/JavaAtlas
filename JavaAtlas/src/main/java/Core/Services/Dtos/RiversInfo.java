/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Services.Dtos;

/**
 *
 * @author user
 */
public class RiversInfo {
    private Object [][] _riversList;
    private String [] _columnNames;
    
    public Object [][] GetRiversList() {
        return _riversList;
    }
    
    public void SetRiversList(Object [][] riversList) {
        _riversList = riversList;
    }
    
    public String [] GetColumnNames() {
        return _columnNames;
    }
    
    public void SetColumnNames(String [] columnNames) {
        _columnNames = columnNames;
    }
}
