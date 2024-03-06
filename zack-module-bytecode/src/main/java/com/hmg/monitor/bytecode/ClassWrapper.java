package com.hmg.monitor.bytecode;

import org.objectweb.asm.ClassVisitor;

/**
 * @author hmg
 * @version 1.0
 * @date 2024/3/6 17:16
 * @description: class wrapper info
 */
public class ClassWrapper extends ClassVisitor {
    protected ClassWrapper(int api) {
        super(api);
    }
}
