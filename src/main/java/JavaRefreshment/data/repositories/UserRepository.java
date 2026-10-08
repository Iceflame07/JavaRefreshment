package JavaRefreshment.data.repositories;
import JavaRefreshment.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findById(Long id);
    User createUser(String user);
    User findByFirstName(String firstName);
    User findByLastName(String lastName);
    User findByPhoneNumber(String phoneNUmber);
    User findByCountryCode(int countryCode);
    User findByAddress(String address);
    User findByEmail(String email);
    List <User> findByListOfCountries(String countries);
    User findByState(String state);
    User save(String user);

}
