package wwr.asm;

import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class parser extends ClassVisitor {


    public parser(int api) {
        super(Opcodes.ASM5);
    }

    @Override
    public void visit(int version,int access,String name,String signature,String superName,String[] interfaces) {
        super.visit(version,access,name,signature,superName,interfaces);
        System.out.println("superName="+superName+",name="+name);
    }

    @Override
    public MethodVisitor visitMethod(int access,String name,String desc,String signature,String[] exceptions) {
        System.out.println(name+desc);
        System.out.println(access);
        System.out.println(signature);
        return super.visitMethod(access,name,desc,signature,exceptions);
    }
    @Override
    public void visitAttribute(Attribute attr) {
        super.visitAttribute(attr);
    }

    @Override
    public void visitEnd(){
        super.visitEnd();
    }

}
