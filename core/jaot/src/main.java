import wwr.ast.ClassFile;
import java.io.File;

public class main {

    public static void main(String[] args) throws Exception {
        File f = new File("res/helloraojian.class");
        System.out.println(f.exists());
        ClassFile cf = ClassFile.read(f);
        System.out.println(
                cf.getName()
        );



    }
}
