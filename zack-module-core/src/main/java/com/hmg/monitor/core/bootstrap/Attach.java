package com.hmg.monitor.core.bootstrap;

import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;

import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * @author hmg
 * @version 1.0
 * @date 2024/3/13 16:17
 * @description: 主类，主要就是选择jvm id，即需要监听的进程
 */
public class Attach {
    public static void main(String[] args) throws Exception{
        List<VirtualMachineDescriptor> virtualMachineDescriptors = VirtualMachine.list();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < virtualMachineDescriptors.size(); i++) {
            System.out.println(i + ". displayName => " + virtualMachineDescriptors.get(i).displayName() + "\tid => " + virtualMachineDescriptors.get(i).id());
        }

        int index = scanner.nextInt();

        if (index >= virtualMachineDescriptors.size()) {
            System.out.println("进程不存在！！！");
            return;
        }

        VirtualMachineDescriptor virtualMachineDescriptor = virtualMachineDescriptors.get(index);

        VirtualMachine attach = VirtualMachine.attach(virtualMachineDescriptor.id());
        String agentPath = Paths.get(Attach.class.getProtectionDomain().getCodeSource().getLocation().toURI()).toString();
        attach.loadAgent(agentPath);
        attach.detach();
        System.out.println("attach listener success...");
    }
}
