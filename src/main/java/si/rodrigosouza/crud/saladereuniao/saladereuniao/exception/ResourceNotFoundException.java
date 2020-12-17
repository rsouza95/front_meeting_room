package si.rodrigosouza.crud.saladereuniao.saladereuniao.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@AllArgsConstructor
@Getter
@ResponseStatus(value = HttpStatus.FOUND)
public class ResourceNotFoundException extends Exception {
    private static final long serialVersionUID= 1L;

    private String message;

}
