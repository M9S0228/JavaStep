import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class RaceCarRunnable extends Car{
    private int passed;
    private int distance;
    private boolean isFinish;
    private CountDownLatch signalStart;
    private CountDownLatch signalFinish;
    private long finishTime;



    public RaceCarRunnable(String name, int maxSpeed, int distance, CountDownLatch signalStart, CountDownLatch signalFinish) {
        super(name, maxSpeed);
        this.distance = distance;
        this.signalStart = signalStart;
        this.signalFinish = signalFinish;
    }

    public int getRandomSpeed(){
        Random rnd = new Random();
        int max = getMaxSpeed();
        int min = max / 2;
        int randomSpeed = rnd.nextInt(min, max + 1);
        return randomSpeed;
    }

    public boolean isFinished() {
        return isFinish;
    }
    public long getFinishTime() {
        return finishTime;
    }

    @Override
    public String toString() {
        return getName() + " | " + getRandomSpeed() + " км/год | " + "прогрес " + passed + "/" + distance;
    }

    @Override
    public void run() {
        try {
            signalStart.await();
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        while (!isFinish){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }

            int dist = (getRandomSpeed() * 1000) / 3600; // Перетворення швидкості в метри за секунду
            passed += dist;

            if (passed >= distance) {
                isFinish = true;
                finishTime = System.currentTimeMillis() - Race.startRaceTime.get();
                signalFinish.countDown();
            }

            System.out.println(this);


        }

    }
}
