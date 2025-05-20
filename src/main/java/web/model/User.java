package web.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@ToString
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NotEmpty(message = "Имя не может быть пустым")
    @Size(min = 2, message = "Имя должно быть от 2 символов")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "Фамилия не может быть пустой")
    @Size(min = 2, message = "Фамилия должна быть от 2 символов")
    @Column(name = "last_name")
    private String lastName;

    @Min(value = 0, message = "Возраст не может быть меньше 0")
    @Column(name = "age")
    private int age;

    public User() {
    }

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
