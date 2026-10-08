package JavaRefreshment.data.models;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Generated
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String createUser;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String email;
    private String listOfCountries;
    private String state;
    private String password;
    private int countryCode;
}
