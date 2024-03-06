package com.hmg.monitor.bytecode;

import org.objectweb.asm.FieldVisitor;

import static org.objectweb.asm.Opcodes.ASM9;

/**
 * @author hmg
 * @version 1.0
 * @date 2024/3/6 17:18
 * @description: field wrapper info
 */
public class FieldWrapper extends FieldVisitor {

    public int access;
    public String name;
    public String descriptor;
    public String signature;
    public Object value;

    public FieldWrapper(int access, String name, String descriptor, String signature, Object value) {
        this(ASM9);
        this.access = access;
        this.name = name;
        this.descriptor = descriptor;
        this.signature = signature;
        this.value = value;
    }

    protected FieldWrapper(int api) {
        super(api);
    }
}
