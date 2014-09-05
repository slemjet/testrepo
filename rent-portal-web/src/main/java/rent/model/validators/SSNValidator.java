package rent.model.validators;

import rent.model.annotations.SSNValid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.util.logging.Logger;

/**
 * Created by Jet on 29.06.14.
 */
public class SSNValidator implements ConstraintValidator<SSNValid, String>{

    private final Logger log = Logger.getLogger(this.getClass().toString());


    @Override
    public void initialize(SSNValid ssnValid) {
        log.info("init: " + ssnValid);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        log.info("isValid: " + s);
        return true;
    }
}
