package com.hmg.monitor.bytecode;

import org.objectweb.asm.MethodVisitor;

/**
 * @author hmg
 * @version 1.0
 * @date 2024/3/6 17:17
 * @description: method wrapper info
 */
public class MethodWrapper extends MethodVisitor {
    protected MethodWrapper(int api) {
        super(api);
    }
}
