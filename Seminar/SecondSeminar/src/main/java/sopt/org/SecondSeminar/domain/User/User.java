package sopt.org.SecondSeminar.domain.User;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class User {

    private Long id;

    private String gender;

    private String name;

    private String address;

    private String contact;

    private int age;

    public User(String gender, String name, String address, String contact, int age) {
        this.gender = gender;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.age = age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: " + this.id + "\n" +
                "gender: " + this.gender + "\n" +
                "name: " + this.name + "\n" +
                "address: " + this.address + "\n" +
                "contact: " + this.contact + "\n" +
                "age: " + this.age;
    }
}