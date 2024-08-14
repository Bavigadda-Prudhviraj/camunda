package com.firstProject.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class FetchEmailDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Coming from FetchEmail delegate");
        System.out.println("Getting the inputVariable from fetch Email service task ::"  +delegateExecution.getVariable("userId"));
        delegateExecution.setVariable("userEmailIdFromDelegate","Prudhviraj729@gmail.com");
    }
}
