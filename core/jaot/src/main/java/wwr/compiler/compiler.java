package wwr.compiler;

import wwr.ast.*;

import java.io.File;

public class compiler {

    public boolean run() throws Exception {
        File f = new File("res/helloraojian.class");
        System.out.println(f.exists());
        ClassFile cf = ClassFile.read(f);
        System.out.println(
                cf.getName()
        );
        System.out.println(cf.fields.length);
        Method  md = cf.methods[1];
        System.out.println(md.attributes.attrs.length);
        System.out.println(md.access_flags.flags);
        System.out.println(md.descriptor.index);
        System.out.println(md.attributes.get(Attribute.Code));
        Code_attribute  code = (Code_attribute)md.attributes.get(Attribute.Code);
        AccessFlags as = md.access_flags;
        System.out.println(as.getClassFlags());
        System.out.println(new String(code.code));






        return false;
    }
}
