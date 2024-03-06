package com.hmg.monitor.bytecode;

import org.objectweb.asm.AnnotationVisitor;

/**
 * @author hmg
 * @version 1.0
 * @date 2024/3/6 17:18
 * @description: annotation wrapper info
 */
public class AnnotationWrapper extends AnnotationVisitor {
    protected AnnotationWrapper(int api) {
        super(api);
    }
}
