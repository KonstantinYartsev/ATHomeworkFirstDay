package somepackage;

import somethingabstract.Abstract;
import somethinggreen.AnnotationForExaple;
import somethinggreen.Contract;

/**
 * Этот класс создан во имя великой цели!
 * @author надеется остаться неизвестным.
 * @since в последний момент.
 * @version крайняя
 */
@AnnotationForExaple (description = "Сим я делаю этот класс более доступным для рефлексии")
public class Some extends Abstract implements Contract {
    /*Поля класса*/
    /**
     * Приватное поле класса.
     */
    private String secret;
    /**
     * Публичное поле класса.
     */
    public String noMoreSecrets;

    /**
     * Геттер публичного поля.
     * Бессмысленный и беспощадный.
     * @return это вообще кто-то читает?
     */
    public String getNoMoreSecrets() {
        return noMoreSecrets;
    }

    /**
     * Сеттер публичного поля.
     * Раз уж в конструкторе не заполняется, надо хоть как-то его задать.
     * @param noMoreSecrets принимаемый параметр. Надеемся, это будет String.
     */
    public void setNoMoreSecrets(String noMoreSecrets) {
        this.noMoreSecrets = noMoreSecrets;
    }

    /**
     * Еще один сеттер публичного поля.
     * Раз уж в конструкторе не заполняется, надо хоть как-то его задать.
     * @param noMoreSecrets принимаемый параметр. Если не String, то что же?
     */
    public void setNoMoreSecrets(Integer noMoreSecrets) {
        this.noMoreSecrets = String.valueOf(noMoreSecrets);  //А что так можно было? 0о
    }

    /**
     * Геттер для приватного поля.
     * А Сеттера не будет, ибо нефиг!
     * @return стринговое значение поля.
     */
    public String getSecret() {
        return secret;
    }
    /**
     * Геттер для приватного поля.
     * Зачем? Потому - вот почему!
     * @return стринговое значение поля. Но не всегда...
     */
    public String getSecret(Boolean trustMe) {
        if(trustMe)
        this.secret = noMoreSecrets; //Не повторяйте это дома! Это же еще и поле перезапишет!
        return secret;
    }

    /**
     * Конструктор класса.
     * Не то чтобы без него не обойтись, но раз уж у нас есть поля
     * @param secret
     */
    public Some(String secret) {
        super("Это уже не секрет");
        this.secret = secret;
    }
    /*Этот метод имплементирован от абстрактного класса. Думаете, у него нет джавадока? Ctrl+Q*/
    @Override
    public String toString() {
        return "Что вы тут надеялись увидеть?";
    }

    /*Этот метод имплементирован от интерфейса. Думаете, у него нет джавадока? Ctrl+Q*/
    @Override
    public int count() {
        return 0;
    }

}
