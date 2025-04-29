/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Services;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class FileReaderService {
    private BufferedReader _bufferedReader;
    
    public void printFile(String filePath){
        try {
            //кожен раз файл зчитується заново тому видно всі зміни
            _bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath))); 
            while (_bufferedReader.ready()) {
                String content = _bufferedReader.readLine();
                System.out.println(content);     
            }
            _bufferedReader.close();
        } 
        catch (IOException e) {
        } 
        finally{   
        }
    }
    public String  getFile(String filePath){
        String content = null;
        try {
            //кожен раз файл зчитується заново тому видно всі зміни
            _bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath))); 
            while (_bufferedReader.ready()) {
                 content = content + "\n" + _bufferedReader.readLine();   
            }
            _bufferedReader.close();
        } 
        catch (IOException e) {
        } 
        finally{
           return content; 
        }
    } 
}