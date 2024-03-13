package com.hmg.monitor.core.bootstrap;

import com.hmg.monitor.core.transform.LoggerTransformer;
import com.hmg.monitor.core.utils.Cache;

import java.lang.instrument.Instrumentation;

/**
 * @author hmg
 * @version 1.0
 * @date 2024/3/13 15:58
 * @description: bootstrap
 */
public class AgentBootstrap {
    public void agentmain(String args, Instrumentation instrumentation) {
        Cache.instrumentation = instrumentation;
    }
}
