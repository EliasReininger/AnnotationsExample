import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Für welche Bestandteile ist die Annotation anwendbar
@Target({ElementType.FIELD, ElementType.CONSTRUCTOR})
// @Retention(RetentionPolicy.SOURCE)
// @Retention(RetentionPolicy.CLASS)
// @Retention gibt an wie lange Annotations angewendet werden:
// .SOURCE  ->  Annotations werden noch for dem Kompilieren verworfen
// .CLASS   ->  Annotations werden kompiliert, aber vor der Runtime verworfen
// .RUNTIME ->  Annotations werden durch den kompletten durchlauf des Programms beibehalten
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
    int val1();  // Variable
    int val2() default 10; // Variable mit einem standard Wert
}
