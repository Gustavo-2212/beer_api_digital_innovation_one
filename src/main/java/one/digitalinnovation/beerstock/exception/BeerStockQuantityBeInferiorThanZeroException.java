package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockQuantityBeInferiorThanZeroException extends Exception {

    public BeerStockQuantityBeInferiorThanZeroException(Long id) {
        super(String.format("Beers with %s ID to decrement informed that you are trying decrement more than the current quantity", id));
    }
}
