package JavaRefreshment.exceptions;
import lombok.experimental.StandardException;
import org.springframework.stereotype.Service;

@StandardException
@Service
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
