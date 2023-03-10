import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Repeat
{
    int repeats() default 1;

    /*
     * Es ist mögliche mehrere Variablen zu nutzen
     */
}
