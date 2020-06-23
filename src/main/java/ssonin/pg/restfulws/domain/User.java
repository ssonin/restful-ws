package ssonin.pg.restfulws.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "users")
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final long id;

    @Column(nullable = false, length = 100)
    private final String firstName;

    @Column(nullable = false, length = 100)
    private final String lastName;

    @Column(nullable = false, length =  100, unique = true)
    private final String email;

    @Column(nullable = false)
    private final String password;

    @Builder
    private User(long id, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}
