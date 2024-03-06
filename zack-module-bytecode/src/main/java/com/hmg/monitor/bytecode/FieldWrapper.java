package com.hmg.monitor.bytecode;

import org.objectweb.asm.FieldVisitor;

/**
 * @author hmg
 * @version 1.0
 * @date 2024/3/6 17:18
 * @description: field wrapper info
 */
public class FieldWrapper extends FieldVisitor {
    protected FieldWrapper(int api) {
        super(api);
    }
}
