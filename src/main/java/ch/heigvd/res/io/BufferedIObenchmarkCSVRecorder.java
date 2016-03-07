/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io;

import java.io.IOException;
import java.io.OutputStreamWriter;
import ch.heigvd.res.io.util.*;

/**
 * CSV recorder for buffered IO benchmark
 * @author Antoine
 */
public class BufferedIObenchmarkCSVRecorder implements IRecorder{
    OutputStreamWriter os;
    BufferedIObenchmarkCSVSerializer serializer;
    
    /**
     * Constructor
     * @param os
     * @throws IOException 
     */
    public BufferedIObenchmarkCSVRecorder(OutputStreamWriter os) throws IOException{
        this.os = os;
        serializer = new BufferedIObenchmarkCSVSerializer();
        String[] s = {"operation","ioStrategy","blockSize","fileSizeInBytes","durationInMs"};
        os.write(serializer.serialize(s));
    }

    /**
     * Write data 
     * @param data
     * @throws IOException 
     */
    @Override
    public void write(IData data) throws IOException{
        os.write(serializer.serialize(data));
    }
    
    /**
     * Close outputStream
     * @throws IOException 
     */
    @Override
    public void close() throws IOException{
        os.close();
    }
}
