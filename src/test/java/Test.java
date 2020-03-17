import com.sun.istack.internal.NotNull;
import somepackage.Other;
import somepackage.Some;
import somethingabstract.Abstract;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        String s = "Да это наш изначальный секрет";
        int i =5555;
        boolean trust = true;

        Some some = new Some(s);
        System.out.println("//Проверим работу переопределенного метода toString:");
        System.out.println(some.toString());
        if (some.toString().equals("Что вы тут надеялись увидеть?")){
            System.out.println("//Вроде работает");
        }
        else {
            System.out.println("//Что-то не так");
        }
        System.out.println("//Проверим записался ли наш секрет по умолчанию");
        System.out.println(some.getSecret());
        System.out.println("//Попробуем изменить строку");
        s = "Строка изменилась";
        some.setNoMoreSecrets(s);
        System.out.println(some.getSecret(trust));
        if(s.equals(some.getSecret())){
            System.out.println("//Отлично! Хорошо что мы поверили этому методу");
        }else {
            System.out.println("//Не сработало");
        }
        System.out.println("//Попробуем сделать нашим секретом число пипа int(пин код от карты?)");
        some.setNoMoreSecrets(i);
        System.out.println(some.getSecret(trust));
        if (some.getSecret().equals(String.valueOf(i))){
            System.out.println("//Только не подсматривайте!");
        }
        else{
            System.out.println("//Это точно не то число!");
        }
        System.out.println("//Попробуем поменять число, но на этот раз не будем столь доверчивыми");
        i = -10;
        some.setNoMoreSecrets(i);
        System.out.println(some.getNoMoreSecrets());
        trust = false;
        System.out.println(some.getSecret(trust));
        if (some.getSecret().equals(String.valueOf(i))){
            System.out.println("//Такого я не ожидал!");
        }
        else{
            System.out.println("//Я так и знал, предательство!");
        }
        System.out.println("//Попробуем посмотреть, что мы записали в переменную родительского класса, нам же это зачем-то было нужно");
        System.out.println(some.getДаТакТожеМожно());
        System.out.println("//Это оказалось проще чем я думал, но я бы все равно своего добился");
//        Field f = null;
//        try {
//            try {
//                f = Abstract.class.getDeclaredField("даТакТожеМожно");
//            } catch (NoSuchFieldException e) {
//                throw new MyError("Не удалось отрефлексировать это приватное поле родительского класса");
//            }
//        } catch (MyError myError) {
//            System.out.println(myError.getMessage());
//        }
//        if(f != null) {
//            f.setAccessible(true);
//            String fieldValue = null;
//            try {
//                try {
//                    fieldValue = (String) f.get(some);
//                } catch (IllegalAccessException e) {
//                    throw new MyError("Не удалось получить доступ к полю родительского класса");
//                }
//            } catch (MyError myError) {
//                System.out.println(myError.getMessage());
//            }
//            System.out.println(fieldValue);
//        }
        System.out.println("//Поговорим про интерфейсы?");
        some.soTellMeAboutInterfaces();
        System.out.println("//А это что за счетчик?");
        System.out.println("Число тех кто не понимает в ооп = " + some.count());

    }
}
