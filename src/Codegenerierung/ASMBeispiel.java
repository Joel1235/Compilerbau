package Codegenerierung;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.objectweb.asm.*;

public class ASMBeispiel {
    public static ClassWriter beispiel1() throws IOException{

        ClassWriter cw = new ClassWriter( ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);

        cw.visit(Opcodes.V1_8,                  //Version
                Opcodes.ACC_PUBLIC,            //Access
                "Bytecode",                    //Name
                null,                          //Signatur
                "java/lang/Object",            //Superklasse
                null);                         //implemntierte Interfaces

        MethodVisitor constructor =
                cw.visitMethod(Opcodes.ACC_PUBLIC,
                        "<init>",        //Name
                        "()V",           //Typ (Descriptor)
                        null,            //Signatur
                        null);           //Exceptions

        MethodVisitor method =
                cw.visitMethod(Opcodes.ACC_PUBLIC, "m", "()V", null, null);

        //Konstruktor erstellen Start
        constructor.visitCode();               //Start-Initialisierung
        // aload_0
        constructor.visitVarInsn(Opcodes.ALOAD, 0);
        // invokespecial
        constructor.visitMethodInsn(Opcodes.INVOKESPECIAL,  //invoke-Befehl
                "java/lang/Object",     //Owner-Klasse
                "<init>",               //Name
                "()V",                  //Typ (Descriptor)
                false);                 //is interface?
        // return
        constructor.visitInsn(Opcodes.RETURN);

        constructor.visitMaxs(0, 0);          //maximale Anzahl des Stacks bzw. der lokalen Veriablen

        constructor.visitEnd();               //Ende-Initialisierung
        //Konstruktor erstellen Ende

        //Methode m erstellen Start
        method.visitCode();
        // getstatic
        method.visitFieldInsn(Opcodes.GETSTATIC,
                "java/lang/System", "out",
                "Ljava/io/PrintStream;");
        // ldc "Bytecode"
        method.visitLdcInsn("Bytecode");
        // invokevirtual
        method.visitMethodInsn(Opcodes.INVOKEVIRTUAL,
                "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
        // return
        method.visitInsn(Opcodes.RETURN);

        method.visitMaxs(0, 0);

        method.visitEnd();
        //Methode m erstellen Ende

        cw.visitEnd();

        System.out.println(cw.toByteArray());
        return cw;
    }

    public static ClassWriter beispiel2() throws IOException{

        ClassWriter cw = new ClassWriter( ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);

        cw.visit(Opcodes.V1_8,                  //Version
                Opcodes.ACC_PUBLIC,            //Access
                "Bytecode2",                    //Name
                null,                          //Signatur
                "java/lang/Object",            //Superklasse
                null);                         //implemntierte Interfaces

        MethodVisitor constructor =
                cw.visitMethod(Opcodes.ACC_PUBLIC,
                        "<init>",        //Name
                        "()V",           //Typ (Descriptor)
                        null,            //Signatur
                        null);           //Exceptions

        MethodVisitor method =
                cw.visitMethod(Opcodes.ACC_PUBLIC, "m", "()V", null, null);

        //Konstruktor erstellen Start
        constructor.visitCode();               //Start-Initialisierung
        // aload_0
        constructor.visitVarInsn(Opcodes.ALOAD, 0);
        // invokespecial
        constructor.visitMethodInsn(Opcodes.INVOKESPECIAL,  //invoke-Befehl
                "java/lang/Object",     //Owner-Klasse
                "<init>",               //Name
                "()V",                  //Typ (Descriptor)
                false);                 //is interface?
        // return
        constructor.visitInsn(Opcodes.RETURN);

        constructor.visitMaxs(0, 0);          //maximale Anzahl des Stacks bzw. der lokalen Veriablen

        constructor.visitEnd();               //Ende-Initialisierung
        //Konstruktor erstellen Ende

        //Methode m erstellen Start
        Label start = new Label();
        Label loop = new Label();
        Label end = new Label();

        method.visitLabel(start);
        method.visitInsn(Opcodes.ICONST_0);
        method.visitVarInsn(Opcodes.ISTORE, 1);

        method.visitLabel(loop);
        method.visitVarInsn(Opcodes.ILOAD, 1);
        method.visitInsn(Opcodes.ICONST_5);
        method.visitJumpInsn(Opcodes.IF_ICMPGE, end);

        method.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        method.visitLdcInsn("Bytecode");
        method.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println",
                "(Ljava/lang/String;)V", false);

        method.visitIincInsn(1, 1);
        method.visitJumpInsn(Opcodes.GOTO, loop);

        method.visitLabel(end);
        method.visitInsn(Opcodes.RETURN);

        method.visitMaxs(0, 0);
        method.visitEnd();
        //Methode m erstellen Ende

        cw.visitEnd();

        return cw;
    }

    static void writeClassfile(ClassWriter cw) throws IOException{
        byte[] bytes = cw.toByteArray();
        String className = new ClassReader(bytes).getClassName();
        File outputFile = new File("./", className + ".class");
        FileOutputStream output = new FileOutputStream(outputFile);
        output.write(bytes);
        output.close();
    }


    public static void main(String args[]) throws IOException{
        writeClassfile(beispiel1());
        writeClassfile(beispiel2());
    }
}

