import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 Создать три потока Т1, Т2 и Т3
    Реализовать выполнение поток в последовательности Т3 -> Т2 -> Т1
    (используя метод join). Все потоки должны быть стартануты в одно время
    то есть чтобы главный поток дожидался только завершения Т1
 */

public class Main {
    public static void main(String[] args) {

        MyThread thirdThread = new MyThread("THIRD");
        MyThread secondThread = new MyThread(thirdThread, "SECOND");
        MyThread firstThread = new MyThread(secondThread,"FIRST" );

        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}
