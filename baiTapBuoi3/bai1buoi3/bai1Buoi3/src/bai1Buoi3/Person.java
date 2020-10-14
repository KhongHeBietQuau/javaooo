package bai1Buoi3;

public class Person {
    private String  name;
    private String  DateOfBirth;
    private String gender;
    private String hobby;

    public Person() {
    }

    public Person(String name, String dateOfBirth, String gender, String hobby) {
        this.name = name;
        DateOfBirth = dateOfBirth;
        this.gender = gender;
        this.hobby = hobby;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }
}
