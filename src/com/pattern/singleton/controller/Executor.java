package com.pattern.singleton.controller;

import com.pattern.singleton.module.SingletonEmployee;

public class Executor {
    public static void start() {
        String name = "Ben";
        String department = "maintenance";
        int id = 20444545;

        SingletonEmployee singleEmployee = SingletonEmployee.INSTANCE;
        singleEmployee.setName(name);
        singleEmployee.setDepartment(department);
        singleEmployee.setId(id);
        System.out.println("Name: " + singleEmployee.getName() + "\nDepartment: "
                + singleEmployee.getDepartment() + "\nID: " + singleEmployee.getId());
    }
}