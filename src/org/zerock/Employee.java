package org.zerock;

import java.util.Arrays;

public class Employee {

    private Auth[] auths;

    public Employee(Auth[] auths) {
        this.auths = auths;
    }

    
    @Override
    public String toString() {
        return "Employee{" +
                "auths=" + Arrays.toString(auths) +
                '}';
    }
}
