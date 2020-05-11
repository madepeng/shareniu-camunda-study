package com.shareniu.ch12;

import java.util.List;

import org.camunda.bpm.engine.filter.Filter;
import org.camunda.bpm.engine.impl.interceptor.Command;
import org.camunda.bpm.engine.impl.interceptor.CommandContext;
import org.camunda.bpm.engine.task.Task;
import org.camunda.bpm.engine.task.TaskQuery;

public class CustomerCmd implements Command< List<Task>> {


    Filter filter;
    public CustomerCmd(Filter filter) {
        this.filter = filter;
    }
    public  List<Task> execute(CommandContext commandContext) {
        TaskQuery query = filter.getQuery();
        List<Task> list = query.list();
        return list;
    }
}
