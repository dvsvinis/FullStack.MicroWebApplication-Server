package zipcode.group3.showboat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import zipcode.group3.showboat.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
