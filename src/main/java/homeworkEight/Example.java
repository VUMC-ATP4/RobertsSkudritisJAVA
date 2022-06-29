package homeworkEight;

import java.util.Date;

public class Example {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Roberts");
        customer1.setMemberType("Gold");
//        customer1.isMember();
        customer1.setMember(true);
       // System.out.println(customer1.toString());

        Customer customer2 = new Customer("Andris");
        customer2.setMemberType("Silver");
//        customer2.isMember();
        customer2.setMember(true);
      //  System.out.println(customer2.toString());

        Customer customer3 = new Customer("Andris");
        customer3.setMemberType("Premium");
//        customer3.isMember();
        customer3.setMember(true);
     //   System.out.println(customer3.toString());

        Customer customer4 = new Customer("Guntis");
        customer3.setMember(false);
//        System.out.println(customer4.toString());


        Visit visit1 = new Visit(customer1, new Date());
        visit1.setServiceExpense(5.1);
        visit1.setProductExpense(7.71);
        System.out.println(visit1.toString());
        System.out.println("Klienta " + visit1.getName() + " izdevumi ir " + visit1.getTotalExpense());

        Visit visit2 = new Visit(customer2, new Date());
        visit2.setServiceExpense(3.1);
        visit2.setProductExpense(6.3);
        System.out.println(visit2.toString());
        System.out.println("Klienta " + visit2.getName() + " izdevumi ir " + visit2.getTotalExpense());

        Visit visit3 = new Visit(customer3, new Date());
        visit3.setServiceExpense(1.1);
        visit3.setProductExpense(9.3);
        System.out.println(visit3.toString());
        System.out.println("Klienta " + visit3.getName() + " izdevumi ir " + visit3.getTotalExpense());

        Visit visit4 = new Visit(customer4, new Date());
        visit4.setServiceExpense(7.2);
        visit4.setProductExpense(2.3);
        System.out.println(visit4.toString());
        System.out.println("Klienta " + visit4.getName() + " izdevumi ir " + visit4.getTotalExpense());

    }

}
