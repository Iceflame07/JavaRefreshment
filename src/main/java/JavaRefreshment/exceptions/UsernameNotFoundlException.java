package JavaRefreshment.exceptions;
import lombok.experimental.StandardException;
import org.springframework.stereotype.Service;

@Service
@StandardException
public class UsernameNotFoundlException extends RuntimeException {
    public UsernameNotFoundlException(String message) {
        super(message);
    }
}
