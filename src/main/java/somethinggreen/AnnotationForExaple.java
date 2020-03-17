package somethinggreen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация, например.
 */
@Retention(RetentionPolicy.RUNTIME) //Даже в рантайме она еще будет
@Target(ElementType.TYPE) //Можно метить классы
public @interface AnnotationForExaple {
    String description() default "Ваш класс официально аннотирован!";
}
