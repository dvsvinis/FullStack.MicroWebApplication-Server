package zipcode.group3.showboat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zipcode.group3.showboat.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
