package com.firstProject.workflow.serviceImpl;

import com.firstProject.workflow.services.UserDepartmentService;
import org.springframework.stereotype.Component;

@Component
public class UserDepartmentServiceImpl implements UserDepartmentService {
    @Override
    public String getUserDepartment() {
        System.out.println("coming from getUserDepartment() method of UserDepartmentServiceImpl class");
        return "Dev-team";
    }
}

