package rent.model.annotations;

import rent.model.validators.SSNValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Jet on 29.06.14.
 */
@NotNull
@Size(min = 9, max = 9, message = "SSN must contain 9 symbols")
@Constraint(validatedBy = {SSNValidator.class})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
public @interface SSNValid {
    String message() default "Incorrect SSN";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
