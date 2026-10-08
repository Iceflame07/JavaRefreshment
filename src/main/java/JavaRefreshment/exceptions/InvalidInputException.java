package JavaRefreshment.exceptions;
import lombok.experimental.StandardException;
import org.springframework.stereotype.Service;

@StandardException
@Service
public class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message) {
        super(message);
    }
}
