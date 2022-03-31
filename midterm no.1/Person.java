class Person {
    private String Name;
    private int Age;
    private String Address;

    Person() {
        this.Name = "Ashton Cox";
        this.Age = 47;
        this.Address = "Roseville NH 11523";
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getAddress() {
        return Address;
    }
}