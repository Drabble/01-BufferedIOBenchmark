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
    
    public CSVWriter(OutputStreamWriter os){
        this.os = os;
    }

    public void write(String value) throws IOException{
            os.write(value);
    }
    
    public void close() throws IOException{
        os.close();
    }
}
