package lesson8;


public class Main {

    public static void main(String[] args) {
        // create Person
        Person person = new Person();
        person.setName("Iga Kopytko");
        person.setAge(30);
        person.setAddress("123 Harry Potter street");


        //create bankAccount

        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1000);
        bankAccount.setAccountHolder(person);

        System.out.println(bankAccount.getAccountHolder().getName());
        System.out.println(bankAccount.getBalance());

    }
}




