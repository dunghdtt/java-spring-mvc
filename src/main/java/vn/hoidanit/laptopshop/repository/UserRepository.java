package vn.hoidanit.laptopshop.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.hoidanit.laptopshop.domain.User;
import java.util.List;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User save(User hoidanit);
    List<User> findOneByEmail(String email);
    List<User> findAll();
    User findById(long id);
}
