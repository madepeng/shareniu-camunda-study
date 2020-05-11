package com.shareniu.Test;

import org.camunda.bpm.engine.*;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.camunda.bpm.engine.repository.Deployment;
import org.camunda.bpm.engine.repository.DeploymentBuilder;
import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.junit.Before;
import org.junit.Test;

/**
 * @ClassName Test1
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/5/11
 * @Version V1.0
 **/
public class RuntimeServiceTest {
    ProcessEngineConfigurationImpl processEngineConfiguration;
    RepositoryService repositoryService;
    RuntimeService runtimeService;
    TaskService taskService;
    @Before
    public void init() {
        processEngineConfiguration = (ProcessEngineConfigurationImpl) ProcessEngineConfiguration
                .createProcessEngineConfigurationFromResource("com/shareniu/test/camunda.cfg.xml");
        ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
        repositoryService = processEngine.getRepositoryService();
        runtimeService=processEngine.getRuntimeService();
        taskService=processEngine.getTaskService();
    }

    @Test
    public void createDeployment() {
        DeploymentBuilder deploymentBuilder = repositoryService.createDeployment();
        Deployment deployment = deploymentBuilder
                .name("testttttttttt")
                .source("本地测试")
                .tenantId("var")
                .addClasspathResource("com/shareniu/ch10/leave_var.bpmn")
                .deploy();
    }

    @Test
    public void startProcessInstanceByKey() {
        ProcessDefinition a = repositoryService.createProcessDefinitionQuery().tenantIdIn("var").latestVersion().singleResult();
        System.out.println(a);
        System.out.println(a.getDescription());
        System.out.println(a.getVersion());
        System.out.println(a.getName());
    }
}
