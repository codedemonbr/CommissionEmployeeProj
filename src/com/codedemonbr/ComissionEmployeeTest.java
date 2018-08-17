package com.codedemonbr;

public class ComissionEmployeeTest
{
    public static void main(String[] args)
    {
        ComissionEmployee employee = new ComissionEmployee("Sue", "Jones", "222-222-222-22", 1000, .06);

        System.out.println("Employee information obtained by get methods:");
        System.out.println("\n First name : " + employee.getFirstName());
        System.out.println("\n Last name : " + employee.getLastName());
        System.out.println("\n Social security : " + employee.getSocialSecurityNumber());
        System.out.println("\n Gross Sales : " + employee.getGrossSales());
        System.out.println("\n Commission rate : " + employee.getComissionRate());

        employee.setGrossSales(5000);
        employee.setComissionRate(.1);

        System.out.println("\n\n\nUpdated information obtained by toString()\n\n" + employee);
    }
}
