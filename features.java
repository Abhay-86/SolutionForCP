public class features {
    private String name;
    private int age;
    private int balance;
    features(String name, int age,int balance)
    {
        this.age=age;
        this.balance=balance;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "features{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }
}
