package ssonin.pg.restfulws.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ssonin.pg.restfulws.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
