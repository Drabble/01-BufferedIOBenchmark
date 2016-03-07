/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io.util;

import ch.heigvd.res.io.BufferedIObenchmarkData;
import java.io.IOException;

/**
 *
 * @author Antoine
 */
public interface IRecorder {
    void write(IData data) throws IOException;
    void close() throws IOException;
}
