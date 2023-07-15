package Codegenerierung;

import org.objectweb.asm.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ggt {

    public static ClassWriter ggt() throws IOException {

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);

        cw.visit(Opcodes.V1_8,                  //Version
                Opcodes.ACC_PUBLIC,            //Access
                "GGT",                         //Name
                null,                          //Signatur
                "java/lang/Object",            //Superklasse
                null);                         //implemntierte Interfaces

        MethodVisitor constructor =
                cw.visitMethod(Opcodes.ACC_PUBLIC,
                        "<init>",        //Name
                        "()V",           //Typ (Descriptor)
                        null,            //Signatur
                        null);           //Exceptions

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

        //Methode ggt erstellen Start
        MethodVisitor method =
                cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "ggt", "(II)I", null, null);


        Label start = new Label();
        Label else1 = new Label();
        Label else2 = new Label();
        Label end = new Label();
        method.visitCode();               //Start-Initialisierung
        method.visitLabel(start);
        //method.visitVarInsn(Opcodes.ILOAD, 0);
        //method.visitJumpInsn(Opcodes.IF_ICMPLT, end);
        method.visitVarInsn(Opcodes.ILOAD, 0);
        method.visitVarInsn(Opcodes.ILOAD, 1);
        method.visitJumpInsn(Opcodes.IF_ICMPNE, else1);
        method.visitVarInsn(Opcodes.ILOAD, 0);
        method.visitInsn(Opcodes.IRETURN);
        method.visitLabel(else1);
        method.visitVarInsn(Opcodes.ILOAD, 0);
        method.visitVarInsn(Opcodes.ILOAD, 1);
        method.visitJumpInsn(Opcodes.IF_ICMPLE, else2);
        method.visitVarInsn(Opcodes.ILOAD, 0);
        method.visitVarInsn(Opcodes.ILOAD, 1);
        method.visitInsn(Opcodes.ISUB);
        method.visitVarInsn(Opcodes.ILOAD, 1);
        method.visitMethodInsn(Opcodes.INVOKESTATIC,  //invoke-Befehl
                "GGT",               //Owner-Klasse
                "ggt",               //Name
                "(II)I",             //Typ (Descriptor)
                false);
        method.visitInsn(Opcodes.IRETURN);
        method.visitLabel(else2);
        method.visitVarInsn(Opcodes.ILOAD, 1);
        method.visitVarInsn(Opcodes.ILOAD, 0);
        method.visitInsn(Opcodes.ISUB);
        method.visitVarInsn(Opcodes.ILOAD, 0);
        method.visitMethodInsn(Opcodes.INVOKESTATIC,  //invoke-Befehl
                "GGT",               //Owner-Klasse
                "ggt",               //Name
                "(II)I",             //Typ (Descriptor)
                false);
        method.visitInsn(Opcodes.IRETURN);
        method.visitLabel(end);
        //method.visitInsn(Opcodes.ICONST_M1);
        //method.visitInsn(Opcodes.IRETURN);

        method.visitMaxs(0, 0);
        method.visitEnd();
        //Methode m erstellen Ende

        cw.visitEnd();

        return cw;
    }


    static void writeClassfile(ClassWriter cw) throws IOException {
        byte[] bytes = cw.toByteArray();
        String className = new ClassReader(bytes).getClassName();
        File outputFile = new File("./", className + ".class");
        FileOutputStream output = new FileOutputStream(outputFile);
        output.write(bytes);
        output.close();
    }


    public static void main(String args[]) throws IOException {
        writeClassfile(ggt());
    }
}
