package JavaRefreshment.service;
import JavaRefreshment.data.models.User;
import JavaRefreshment.data.repositories.UserRepository;
import JavaRefreshment.exceptions.GlobalExceptionHandler;
import JavaRefreshment.exceptions.UserNotFoundException;
import JavaRefreshment.exceptions.UsernameNotFoundlException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        if (id == null) {
            throw new UserNotFoundException(
                    "User cannot be null: " + id
            );
        }

        return userRepository.findById(id)
                .orElseThrow(() ->
                        new UserNotFoundException("No user found with this Id: " + id)
                );
    }


    @Override
    public User createUser(String user) {
        if (user == "") {
            throw new GlobalExceptionHandler("Create new User: " + user);
        }

        return userRepository.save(user);
    }

    @Override
    public User save(String user) {
        return userRepository.save(user);
    }

    @Override
    public User findByFirstName(String firstName) {
        if(firstName == null){
            throw new UserNotFoundException("No user with this firstName: " + firstName);
        }
            return userRepository.findByFirstName("");
    }

    @Override
    public User findByLastName(String lastName) {
        if(lastName == null){
            throw new UserNotFoundException("No user with this lastName found: " + lastName);
        }
            return userRepository.findByLastName("");
    }

    @Override
    public User findByPhoneNumber(String phoneNumber) {
        if(phoneNumber == null) {
            throw new RuntimeException("Phone number does not exist: " + phoneNumber);
        }
            return userRepository.findByPhoneNumber("");
    }

    @Override
    public User findByCountryCode(int countryCode) {
        if(countryCode == 0){
            throw new UserNotFoundException("Country Code Not Recognized: ");
        }
            return userRepository.findByCountryCode(+1);
    }

    @Override
    public User findByAddress(String address) {
        if(address == null){
            throw new UserNotFoundException("Address does not exist!: " + address);
        }
            return userRepository.findByAddress("");
    }

    @Override
    public User findByEmail(String email) {
        if(!Objects.equals(email, "")){
            throw new UsernameNotFoundlException("Invalid email address: " + email);
        }
            return userRepository.findByEmail("");
    }

    @Override
    public List<User> findByListOfCountries(String countries) {
        if (countries == null || countries.isBlank()) {
            throw new UserNotFoundException("Country does not exist!: " + countries);
        }
            List<User> users = userRepository.findByListOfCountries(countries);

        if (users.isEmpty()) {
            throw new UserNotFoundException("Country does not exist!: " + countries);
        }
            return users;
    }


    @Override
    public User findByState(String state) {
        if(state == null){
            throw new UserNotFoundException("State cannot be null: " + state);
        }
            return userRepository.findByState("");
    }
}
