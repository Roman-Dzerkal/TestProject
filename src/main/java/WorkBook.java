public class WorkBook {
    private int age;
    private String name;
    private String surname;

    WorkBook() {
    }

    WorkBook(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // some comment
    // some comment

    private int sum(int value) {
        return value * 2;
    }
}
