package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.santander_dev_week_2024.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
