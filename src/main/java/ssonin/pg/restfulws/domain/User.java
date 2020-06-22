package ssonin.pg.restfulws.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity(name = "users")
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, length = 100)
    private final String firstName;

    @Column(nullable = false, length = 100)
    private final String lastName;

    @Column(nullable = false, length =  100, unique = true)
    private final String email;

    @Column(nullable = false)
    private final String password;
}
