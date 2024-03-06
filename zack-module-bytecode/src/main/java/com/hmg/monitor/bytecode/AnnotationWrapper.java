package com.hmg.monitor.bytecode;

import org.objectweb.asm.AnnotationVisitor;

import static org.objectweb.asm.Opcodes.ASM9;

/**
 * @author hmg
 * @version 1.0
 * @date 2024/3/6 17:18
 * @description: annotation wrapper info
 */
public class AnnotationWrapper extends AnnotationVisitor {

    public String name;


    public AnnotationWrapper(String name) {
        this(ASM9);
        this.name = name;
    }

    protected AnnotationWrapper(int api) {
        super(api);
    }
}
