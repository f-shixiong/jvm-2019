package wwr.asm;

import org.objectweb.asm.*;

public class ClassParser extends ClassVisitor {


    public ClassParser() {

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

        MethodVisitor mtv = super.visitMethod(access,name,desc,signature,exceptions);
        return new MethodParser(mtv,name);
    }
    @Override
    public void visitAttribute(Attribute attr) {
        super.visitAttribute(attr);
    }

    @Override
    public void visitEnd(){
        super.visitEnd();
    }

    @Override
    public void visitSource(String source, String debug){
        System.out.println(source+":"+debug);
        super.visitSource(source,debug);
    }

    @Override
    public ModuleVisitor visitModule(String name, int access, String version){
        System.out.println(name);
        System.out.println(access);
        System.out.println(version);

        return super.visitModule(name,access,version);
    }

}
