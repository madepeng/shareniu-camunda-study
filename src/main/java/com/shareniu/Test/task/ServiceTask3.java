package com.shareniu.Test.task;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.Expression;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * @ClassName ServiceTask3
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/5/12
 * @Version V1.0
 **/
public class ServiceTask3 implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("start");
    }
}
