package JavaRefreshment.exceptions;
import lombok.experimental.StandardException;
import org.springframework.stereotype.Service;

@StandardException
@Service
public class GlobalExceptionHandler extends RuntimeException {
    public GlobalExceptionHandler(String message) {
        super(message);
    }
}
