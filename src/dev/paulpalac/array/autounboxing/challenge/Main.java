package dev.paulpalac.array.autounboxing.challenge;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Philippines National Bank");
        bank.addBranch("Olongapo");
        bank.addCustomer("Olongapo", "Paul", 100000);
        bank.addCustomer("Olongapo", "John", 200000);
        bank.addCustomer("Olongapo", "Palac", 300000);

        bank.addBranch("Subic");
        bank.addCustomer("Subic", "Xander", 400000);

        bank.addCustomerTransaction("Olongapo", "Paul", 1000);
        bank.addCustomerTransaction("Olongapo", "Paul", 5000);
        bank.addCustomerTransaction("Olongapo", "John", 6000);

        bank.listCustomer("Olongapo", true);
        bank.listCustomer("Subic", true);

        bank.addBranch("Dinalupihan");
        if(!bank.addCustomer("Dinalupihan", "Jay", 111)){
            System.out.println("Error Dinalupihan does not exist");
        }

    }
}
