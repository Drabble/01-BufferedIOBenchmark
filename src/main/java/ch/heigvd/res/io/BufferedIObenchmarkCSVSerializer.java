/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io;

import java.util.HashMap;
import ch.heigvd.res.io.util.*;

/**
 * Serialize CSV data for BufferedIOBenchmark
 * @author Antoine
 */
public class BufferedIObenchmarkCSVSerializer implements ISerializer{
    
    /**
     * Serialize the data
     * @param d
     * @return 
     */
    @Override
    public String serialize(IData d){
        HashMap<String, Object> map = d.getMap();
        return map.get("operation") + "," 
               + map.get("ioStrategy") + "," 
               + map.get("blockSize") + "," 
               + map.get("totalBytes") + "," 
               + map.get("takeTime") 
               + "\n";
    }
    
    /**
     * To serialize the header
     * @param ss
     * @return 
     */
    public String serialize(String[] ss){
        String ret = "";
        for(String s : ss)
            ret += s + ",";
        return ret + "\n";
    }
}
