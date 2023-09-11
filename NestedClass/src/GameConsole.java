public class GameConsole implements Powered {
    public enum Brand {SONY, MICROSOFT}
    public enum Color {RED, WHITE, BLUE, BLACK}
    private final Brand brand;
    private String model;
    private String serial;
    private Gamepad firstGamepad;
    private Gamepad secondGamepad;
    private boolean isOn;
    private Game activeGame;
    private int waitingCounter;

    public GameConsole(Brand brand, String serial) {
        this.brand = brand;
        this.serial = serial;
        this.model = determineModel(brand);
        firstGamepad = new Gamepad(brand, 1);
        secondGamepad = new Gamepad(brand, 2);
        this.isOn = false;
        this.activeGame = null;
        this.waitingCounter = 0;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    private String determineModel(Brand brand){
        switch (brand){
            case SONY -> {
                return "PS5";
            }
            case MICROSOFT -> {
                return "XBOX ONE";
            }
            default -> {
                return "Unknown";
            }
        }
    }

    @Override
    public String toString() {
        return "GameConsole{" +
                "\nbrand=" + brand +
                ", \nmodel='" + model + '\'' +
                ", \nserial='" + serial + '\'' +
                ", \nfirstGamepad=" + firstGamepad +
                ", \nsecondGamepad=" + secondGamepad +
                ", \nisOn=" + isOn +
                '}';
    }

    @Override
    public void powerOn() {
//        if(firstGamepad.isOn == true && secondGamepad.isOn == true){
//            isOn = true;
//        }
        isOn = true;
    }

    @Override
    public void powerOff() {
        isOn = false;
    }

    public void switchToFirstGamepad(){
        if(!firstGamepad.isOn() && secondGamepad.isOn() ){
            Gamepad temp = secondGamepad;
            secondGamepad = firstGamepad;
            firstGamepad = temp;
        }
    }
    public void loadGame(Game game){
        activeGame = game;
        System.out.println("«Гра " + activeGame +" загружається»");
    }

    public void playGame() throws GameConsoleException {
        if(activeGame == null){
            System.out.println("Немає активної гри!");
            return;
        }
        checkStatus();

        System.out.println("Граєм в "+ activeGame.getName());
        System.out.println("Стан джойстиків:");

        if(firstGamepad.isOn()){
            System.out.println("Перший джойстик:");
            System.out.println("Заряд: " + firstGamepad.getChargeLevel());
            firstGamepad.setChargeLevel(firstGamepad.getChargeLevel()-10);
            if(firstGamepad.getChargeLevel() <= 0){
                firstGamepad.powerOff();
                System.out.println("Перший джойстик сів");
            }
        }
        if(secondGamepad.isOn()){
            System.out.println("Другий джойстик:");
            System.out.println("Заряд: " + secondGamepad.getChargeLevel());
            secondGamepad.setChargeLevel(secondGamepad.getChargeLevel()-10);
            if(secondGamepad.getChargeLevel() <= 0){
                secondGamepad.powerOff();
                System.out.println("Другий джойстик сів");
            }
        }
    }
    private void checkStatus() throws GameConsoleException {
        if(!firstGamepad.isOn() && !secondGamepad.isOn()){
            System.out.println("Увімкніть джойстик");
            waitingCounter++;
            if (waitingCounter >5){
                isOn = false;
                throw new GameConsoleException("Приставка завершила роботу через відсутність активності");
            }
            return;
        }
        waitingCounter = 0;
    }


    public class Gamepad  implements Powered {
        private final Brand brand;
        private final String consoleSerial;
        private int connectedNumber;
        private final Color color;
        private int chargeLevel;
        private boolean isOn;

        public Gamepad(Brand brand, int connectedNumber) {
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            this.consoleSerial = serial;
            this.chargeLevel = 100;
            this.color = Color.RED;
            this.isOn = false;
        }

        public int getConnectedNumber() {
            return connectedNumber;
        }

        public void setConnectedNumber(int connectedNumber) {
            this.connectedNumber = connectedNumber;
        }

        public int getChargeLevel() {
            return chargeLevel;
        }

        public void setChargeLevel(int chargeLevel) {
            if(chargeLevel >= 0 && chargeLevel <=100){
                this.chargeLevel = chargeLevel;
            }
            else{
                throw new IllegalArgumentException("Джойстик помер");
            }
        }

        public boolean isOn() {
            return isOn;
        }

        public void setOn(boolean on) {
            isOn = on;
        }

        @Override
        public String toString() {
            return "Gamepad{" +
                    "brand=" + brand +
                    ", consoleSerial='" + consoleSerial + '\'' +
                    ", connectedNumber=" + connectedNumber +
                    ", color=" + color +
                    ", chargeLevel=" + chargeLevel +
                    ", isOn=" + isOn +
                    '}';
        }
        @Override
        public void powerOn() {
            isOn = true;
        }

        @Override
        public void powerOff() {
            isOn = false;
        }
    }
}
