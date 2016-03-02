/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io;

import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author Antoine
 */
public class CSVWriter {
    OutputStreamWriter os;
    int cnt = 0;
    
    public CSVWriter(OutputStreamWriter os){
        this.os = os;
    }

    public void write(float value){
        if(cnt%4 == 0 && cnt != 0)
            newLine();
        try{
            os.write(String.valueOf(value) + ";");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        cnt++;
    }
    
    private void newLine(){
        try{
            os.write("\r\n");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void close(){
        try{
            os.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }   
    }
}
