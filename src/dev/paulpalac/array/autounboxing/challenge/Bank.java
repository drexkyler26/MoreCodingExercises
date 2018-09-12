package dev.paulpalac.array.autounboxing.challenge;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null){
            return existingBranch.newCustomer(customerName, initialAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null){
            return existingBranch.addTransaction(customerName,amount );
        }

        return false;
    }

    private Branch findBranch(String branchName){
        for(int i = 0; i < this.branches.size(); i++ ){
            Branch checkBranch = this.branches.get(i);
            if(checkBranch.getName().equals(branchName)){
                return checkBranch;
            }
        }

        return null;
    }

    public boolean listCustomer(String branchName, boolean showTransaction){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null){
            System.out.println("Customers detail for branch " +existingBranch.getName());

            ArrayList<Customer> branchCustomers = existingBranch.getCustomers();
            for(int i = 0; i < branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " +branchCustomer.getName() +"(" +(i+1) +")");
                if(showTransaction){
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j = 0; j  < transactions.size(); j++){
                        System.out.println("(" +(j+1) +") Amount: " +transactions.get(j));
                    }
                }
            }
            return true;
        }else{
        return false;
        }
    }
}
