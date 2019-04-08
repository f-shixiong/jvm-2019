package wwr.asm;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class MethodParser extends MethodVisitor {
    private String methodName;

    public MethodParser(MethodVisitor mv ,String methodName) {
        super(Opcodes.ASM5,mv);
        this.methodName = methodName;
    }


    @Override
    public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
        System.out.println(owner+"+"+name);
        System.out.println(descriptor);
        System.out.println(opcode);
        System.out.println(isInterface);
        super.visitMethodInsn(opcode,owner,name,descriptor,isInterface);
    }


    @Override
    public void visitEnd(){
        System.out.println("end");
        super.visitEnd();
    }

    @Override
    public void visitLdcInsn(Object value){
        System.out.println(value.toString());
        super.visitLdcInsn(value);
    }

    @Override
    public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
        System.out.println(owner);
        System.out.println(name);
        System.out.println(descriptor);
        super.visitFieldInsn(opcode,owner,name,descriptor);
    }
}
