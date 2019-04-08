package wwr.compiler;

import org.objectweb.asm.*;

import java.io.IOException;

public class ClassCompiler extends ClassReader {
    private  int maxStringLength;

    public ClassCompiler(String className) throws IOException {
        super(className);
    }
}


