package com.firstProject.workflow.controller;


import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(){
        return "Hello Bavigadda happy to see you ...!!!! ";
    }
    @RequestMapping(value = "/executePrint", method = RequestMethod.GET)
    public String executePrint() {
        //here we are getting the engine to process
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        //gerRuntimeService will get the service
        //create process will create a process instance
        ProcessInstantiationBuilder instance = engine.getRuntimeService().createProcessInstanceByKey("printProcessID");
        String variable = "variable name";
        instance.setVariable("globalVariableName",variable);

        //Business key
        instance.businessKey("Business key to identify this process is executing in the method");
        //here we are executing the instance
        instance.executeWithVariablesInReturn();
        return "print bpmn file is executed";
    }
    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public String printUserObject(){
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        ProcessInstantiationBuilder instance = engine.getRuntimeService().createProcessInstanceByKey("printUserObjectID");
        instance.executeWithVariablesInReturn();
        return "User object Printed successfully";
    }
    @RequestMapping(value =  "/sequenceFlowExecution/{processKey}", method = RequestMethod.GET)
    public String sequenceFlowExecution(@PathVariable String processKey){
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        ProcessInstantiationBuilder instance = engine.getRuntimeService().createProcessInstanceByKey(processKey);
        instance.executeWithVariablesInReturn();
        return  "BPMN file is executed ProcessKey Id :: "+ processKey;
    }
}
