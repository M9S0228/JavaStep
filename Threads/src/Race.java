import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

public class Race {
    public static AtomicLong startRaceTime = new AtomicLong(0);
    public static void main(String[] args) {
        int numberOfCars = 3;
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch finishSignal = new CountDownLatch(numberOfCars);

        ArrayList<RaceCarRunnable> cars = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();

        RaceCarRunnable car1 = new RaceCarRunnable("BMW", 248, 280, startSignal, finishSignal);
        RaceCarRunnable car2 = new RaceCarRunnable("AUDI", 250, 280, startSignal, finishSignal);
        RaceCarRunnable car3 = new RaceCarRunnable("Mercedes", 249, 280, startSignal, finishSignal);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        for (RaceCarRunnable car : cars) {
            Thread carThread = new Thread(car);
            threads.add(carThread);
        }
        startRace(threads, startSignal);

        try {
            finishSignal.await();
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Гонка завершилася!");

        long winnerTime = Long.MAX_VALUE;
        RaceCarRunnable winner = null;

        for (RaceCarRunnable car : cars) {
            long time = car.getFinishTime();
            String formattedTime = convertToTime(time);
            System.out.println(car.getName() + " фінішувала з рeзультатом: " + formattedTime);

            if (time < winnerTime){
                winnerTime = time;
                winner = car;
            }
        }
        System.out.println("\nПереможець: " + winner.getName() + " з часом " + winnerTime + " мс");

    }

    static void startRace(List<Thread> cars, CountDownLatch startSignal){
        Thread startThread = new Thread(new Runnable() {
            @Override
            public void run() {
                    try {
                        for (int i = 3; i > 0; i--) {
                            System.out.println(i + "...");
                            Thread.sleep(500);
                        }
                        System.out.println("GO!!!");

                        startSignal.countDown();
                        startRaceTime.set(System.currentTimeMillis());

                        for (Thread carThread : cars){
                            carThread.start();
                        }

                    }
                    catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
            }
        });

        startThread.start();

    }
    static String convertToTime(long time){
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        Date date = new Date(time);
        return  dateFormat.format(date);
    }
}
