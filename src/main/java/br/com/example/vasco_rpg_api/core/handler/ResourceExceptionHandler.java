package br.com.example.vasco_rpg_api.core.handler;

import br.com.example.vasco_rpg_api.core.handler.exception.InvalidAtributeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.OffsetDateTime;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(InvalidAtributeException.class)
    public ResponseEntity<Error> handleNegocioException(InvalidAtributeException ex, WebRequest request) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        Error error = new Error();
        error.setStatus(status.value());
        error.setTitle("Atributo de Personagem Invalido");
        error.setTimestamp(OffsetDateTime.now());
        error.setDetail(ex.getMessage());
        error.setUserMessage(ex.getMessage());
        return ResponseEntity.status(status).body(error);
    }
}
