package JavaRefreshment.controller;
import JavaRefreshment.data.models.User;
import JavaRefreshment.dto.UserDTO;
import JavaRefreshment.service.UserService;
import JavaRefreshment.utils.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        User user = UserMapper.mapToUser(userDTO);
        User createdUser = userService.createUser(user.getCreateUser());
        return new ResponseEntity<>(UserMapper.mapToUserDTO(createdUser), HttpStatus.CREATED);
    }

    @GetMapping("/id")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        User user = userService.findById(id);
        return ResponseEntity.ok(UserMapper.mapToUserDTO(user));
    }

    @GetMapping("/first-name")
    public ResponseEntity<UserDTO> getUserByFirstName(@PathVariable String firstName) {
        User user = userService.findByFirstName(firstName);
        return ResponseEntity.ok(UserMapper.mapToUserDTO(user));
    }

    @GetMapping("/last-name")
    public ResponseEntity<UserDTO> getUserByLastName(@PathVariable String lastName) {
        User user = userService.findByLastName(lastName);
        return ResponseEntity.ok(UserMapper.mapToUserDTO(user));
    }

    @GetMapping("/email")
    public ResponseEntity<UserDTO> getUserByEmail(@PathVariable String email) {
        User user = userService.findByEmail(email);
        return ResponseEntity.ok(UserMapper.mapToUserDTO(user));
    }

    @GetMapping("/phone")
    public ResponseEntity<UserDTO> getUserByPhoneNumber(@PathVariable String phoneNumber) {
        User user = userService.findByPhoneNumber(phoneNumber);
        return ResponseEntity.ok(UserMapper.mapToUserDTO(user));
    }

    @GetMapping("/state")
    public ResponseEntity<UserDTO> getUserByState(@PathVariable String state) {
        User user = userService.findByState(state);
        return ResponseEntity.ok(UserMapper.mapToUserDTO(user));
    }

    @GetMapping("/countrycode")
    public ResponseEntity<UserDTO> getUserByCountryCode(@PathVariable String countryCode) {
        User user = userService.findByCountryCode(Integer.parseInt(countryCode));
        return ResponseEntity.ok(UserMapper.mapToUserDTO(user));
    }

    @GetMapping("/countries")
    public ResponseEntity<List<UserDTO>> getUsersByCountries(@PathVariable String countries) {
        List<User> users = userService.findByListOfCountries(countries);
        List<UserDTO> userDTOs = users.stream()
                .map(UserMapper::mapToUserDTO)
                .toList();
        return ResponseEntity.ok(userDTOs);
    }
}