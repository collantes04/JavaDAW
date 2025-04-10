package ejerciciosclases;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name){
        this.name = name;
        this.id = id;
    }

    public Account(String id, String name, int balance){
        this.name = name;
        this.id = id;
        this.balance = 0;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        balance += amount;
        return balance;
    }

    public boolean debit(int amount){
        if (amount <= balance){
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean transferTo(Account another, int amount){
        if (amount <= balance){
            this.balance -= amount;
            another.balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}


