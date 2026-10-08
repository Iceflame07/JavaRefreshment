package JavaRefreshment.service;
import JavaRefreshment.data.models.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UserService {

    User findById(Long id);
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
