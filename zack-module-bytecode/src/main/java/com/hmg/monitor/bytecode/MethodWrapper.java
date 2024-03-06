package com.hmg.monitor.bytecode;

import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.ASM9;

/**
 * @author hmg
 * @version 1.0
 * @date 2024/3/6 17:17
 * @description: method wrapper info
 */
public class MethodWrapper extends MethodVisitor {
    public int access;

    public String name;
    public String descriptor;
    public String signature;
    public String[] exceptions;

    public MethodWrapper(int access, String name, String descriptor, String signature, String[] exceptions) {
        this(ASM9);
        this.access = access;
        this.name = name;
        this.descriptor = descriptor;
        this.signature = signature;
        this.exceptions = exceptions;
    }

    protected MethodWrapper(int api) {
        super(api);
    }
}
