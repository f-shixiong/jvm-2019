package wwr.compiler;

import org.objectweb.asm.ClassReader;
import wwr.asm.ClassParser;

public class compiler {


    public boolean run() throws Exception {
        ClassParser ps = new ClassParser();
        ClassReader cr =new ClassReader("helloraojian");
        cr.accept(ps,0);


        return false;
    }
}

