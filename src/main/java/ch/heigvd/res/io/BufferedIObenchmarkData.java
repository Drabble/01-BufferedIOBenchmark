/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io;

import ch.heigvd.res.io.util.IData;
import java.util.HashMap;

/**
 * Constructor for bufferedIObenchmark data
 * @author Antoine
 */
public class BufferedIObenchmarkData implements IData{
    
    private HashMap<String, Object> map;

    /**
     * Constructor for bufferedIOBenchmark data
     * @param operation
     * @param ioStrategy
     * @param blockSize
     * @param totalBytes
     * @param takeTime 
     */
    public BufferedIObenchmarkData(String operation, String ioStrategy, long blockSize, long totalBytes, long takeTime) {
        map = new HashMap();
        map.put("operation", operation);
        map.put("ioStrategy", ioStrategy);
        map.put("blockSize", blockSize);
        map.put("totalBytes", totalBytes);
        map.put("takeTime", takeTime);
    }
    
    /**
     * Get hashMap
     * @return 
     */
    @Override
    public HashMap getMap(){
        return map;
    }
}
