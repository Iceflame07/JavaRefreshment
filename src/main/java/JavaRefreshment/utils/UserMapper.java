package JavaRefreshment.utils;
import JavaRefreshment.data.models.User;
import JavaRefreshment.dto.UserDTO;
import org.hibernate.validator.constraints.UUID;

@UUID
public class UserMapper {

    public static UserDTO mapToUserDTO(User user){
        return new UserDTO(
                user.getId(),
                user.getCreateUser(),
                user.getFirstName(),
                user.getLastName(),
                user.getPhoneNumber(),
                user.getAddress(),
                user.getEmail(),
                user.getListOfCountries(),
                user.getState(),
                user.getPassword(),
                user.getCountryCode()
        );
    }

    public static User mapToUser(UserDTO userDTO){
        return new User(
                userDTO.getId(),
                userDTO.getCreateUser(),
                userDTO.getFirstName(),
                userDTO.getLastName(),
                userDTO.getPhoneNumber(),
                userDTO.getAddress(),
                userDTO.getEmail(),
                userDTO.getListOfCountries(),
                userDTO.getState(),
                userDTO.getPassword(),
                userDTO.getCountryCode()
        );
    }
}
