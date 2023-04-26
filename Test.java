public class Test {
    public static void main(String[] args) {
        Employee engineer = new Employee("Aditya", 23);
        Employee engineer2 = new Employee();
        engineer2.setName("Adi");
        engineer2.setPh(5654654);
        System.out.println(engineer2.getph());
        System.out.println(engineer2.getName());
                
    }
}
