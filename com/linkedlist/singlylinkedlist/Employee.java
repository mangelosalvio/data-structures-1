package com.linkedlist.singlylinkedlist;

public class Employee {
    private String firstName, lastName;

    public Employee(String firstName, String lastName) {
        this.firstName  = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }


    /**
     * Equals method compares the first name and last name of the employee
     * If equals, meaning both employee has the same first name and last name
     * if not equals, meaning both employee have different names
     * @param employee
     * @return
     */
    public boolean equals(Employee employee) {
        return this.firstName.equals(employee.getFirstName()) && this.lastName.equals(employee.getLastName());
    }
}
