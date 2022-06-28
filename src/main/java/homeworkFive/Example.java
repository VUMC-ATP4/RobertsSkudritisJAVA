package homeworkFive;

public class Example {

    public static void main(String[] args) {
        classroomSix.Customer customer = new Customer("Roberts");
        customer.setMember(true);
        customer.setMemberType("Gold");
        customer.isMember();
        System.out.println(customer.toString());
    }
}
