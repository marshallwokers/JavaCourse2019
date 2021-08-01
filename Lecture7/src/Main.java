public class Main {
    public static void main(String[] args) {
        Contact c1 = new Contact("Иван", "Иванов", 79001234567L);

        System.out.println(c1.getName() + " " + c1.getLastName() + " " + c1.getPhoneNumber());

        c1.setName("Петр");
        c1.setLastName("Петров");
        c1.setPhoneNumber(79007654321L);

        System.out.println(c1.getName() + " " + c1.getLastName() + " " + c1.getPhoneNumber());
    }
}