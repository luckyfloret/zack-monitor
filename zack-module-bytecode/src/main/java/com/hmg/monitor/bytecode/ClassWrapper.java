package com.hmg.monitor.bytecode;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;

import java.util.ArrayList;
import java.util.List;

import static org.objectweb.asm.Opcodes.ASM9;

/**
 * @author hmg
 * @version 1.0
 * @date 2024/3/6 17:16
 * @description: class wrapper info
 */
public class ClassWrapper extends ClassVisitor {

    public String name;
    public int version;
    public int access;
    public String signature;
    public String superName;
    public String[] interfaces;

    public List<MethodWrapper> methods;

    public List<FieldWrapper> fields;

    public List<AnnotationWrapper> annotations;


    public ClassWrapper() {
        this(ASM9);
        methods = new ArrayList<>();
        annotations = new ArrayList<>();
        fields = new ArrayList<>();
    }

    protected ClassWrapper(int api) {
        super(api);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(version, access, name, signature, superName, interfaces);
    }

    @Override
    public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
        AnnotationWrapper annotationWrapper = new AnnotationWrapper(descriptor);
        annotations.add(annotationWrapper);
        return super.visitAnnotation(descriptor, visible);
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        FieldWrapper fieldWrapper = new FieldWrapper(access, name, descriptor, signature, value);
        fields.add(fieldWrapper);
        return super.visitField(access, name, descriptor, signature, value);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        MethodWrapper methodWrapper = new MethodWrapper(access, name, descriptor, signature, exceptions);
        methods.add(methodWrapper);
        return super.visitMethod(access, name, descriptor, signature, exceptions);
    }
}
