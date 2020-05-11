package com.shareniu.ch1;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngineConfiguration;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.camunda.bpm.engine.impl.history.HistoryLevel;

public class ProcessEngineTest5 {

    public static void main(String[] args) {
        String resource="activiti.cfg.xml";
        String beanName="processEngineConfiguration1";
//        ProcessEngineConfiguration processEngineConfigurationFromResource = ProcessEngineConfiguration
//            .createProcessEngineConfigurationFromResource(resource, beanName);
//        System.out.println(processEngineConfigurationFromResource);

        ProcessEngineConfiguration processEngineConfigurationFromResource = ProcessEngineConfiguration
            .createProcessEngineConfigurationFromResource(resource);
        System.out.println(processEngineConfigurationFromResource);


    }

}
