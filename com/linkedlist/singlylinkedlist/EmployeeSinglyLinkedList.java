package com.linkedlist.singlylinkedlist;

public class EmployeeSinglyLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront() {

        EmployeeNode removedNode = head;

        if ( !isEmpty() ) {
            head = removedNode.getNext();
            removedNode.setNext(null);
            size--;
        }

        return removedNode;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void print(){
        EmployeeNode node = head;
        System.out.print("HEAD -->");
        while(node != null) {
            System.out.print(node);
            System.out.print("--->");
            node = node.getNext();
        }
        System.out.println("null");
    }


    /**
     * Create a method that removes the employee from the list
     * if the employee does not exists, the list remains unchanged
     */
    public void removeEmployee(Employee employee) {

    }

    /**
     *
     * Create a method that add the employee before the given employee.
     * If the target employee is not found. The list remains unchanged
     *
     * @param employee - Employee to be added
     * @param existingEmployee - The employee is added before the existing Employee
     *       e.g. HEAD --> PERSON 1 --> PERSON 2 --> PERSON 3 --> NULL
     *         ** PERSON 4 IS ADDED BEFORE PERSON 2
     *    NEW LIST : HEAD --> PERSON 1 --> PERSON 4 --> PERSON 2 --> PERSON 3 --> NULL
     *
     */
    public void addBefore(Employee employee, Employee existingEmployee) {

    }

    public static void main(String[] args) {

        EmployeeSinglyLinkedList list = new EmployeeSinglyLinkedList();
        list.print();

        Employee employee1 = new Employee("Juan", "dela Cruz");
        Employee employee2 = new Employee("John", "Doe");
        Employee employee3 = new Employee("Billy", "Joe");

        System.out.println("Add to Front");
        list.addToFront(employee1);
        list.print();
        System.out.println(list.getSize());

        System.out.println("Add to Front");
        list.addToFront(employee2);
        list.print();
        System.out.println(list.getSize());

        System.out.println("Add to Front");
        list.addToFront(employee3);
        list.print();
        System.out.println(list.getSize());

        System.out.println("Remove from front");
        list.removeFromFront();
        list.print();
        System.out.println(list.getSize());

        System.out.println("Add to Front");
        list.addToFront(employee3);
        list.print();
        System.out.println(list.getSize());


        Employee employee4 = new Employee("Jose","Green");
        System.out.println("Remove " + employee4);
        list.removeEmployee(employee4);
        list.print();
        System.out.println(list.getSize());

        System.out.println("Remove " + employee2);
        list.removeEmployee(employee2);
        list.print();
        System.out.println(list.getSize());

        Employee employee5 = new Employee("Migo","Ibarra");
        list.addBefore(employee5, employee2);
        list.print();
        System.out.println(list.getSize());

        Employee employee6 = new Employee("Mika","Mino");
        list.addBefore(employee6, employee1);
        list.print();
        System.out.println(list.getSize());

        Employee employee7 = new Employee("Bridget","Barn");
        Employee employee8 = new Employee("Cristy","Molina");
        list.addBefore(employee7, employee8);
        list.print();
        System.out.println(list.getSize());


    }

}
