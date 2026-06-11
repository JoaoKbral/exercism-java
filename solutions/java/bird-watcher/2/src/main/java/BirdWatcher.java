
class BirdWatcher {
    private final int[] birdsPerDay;
    private static int[] birdsPerDayLastWeek = {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return birdsPerDayLastWeek;
    }

    public int getToday() {
        if (birdsPerDay.length == 0) return 0;
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int birdQuantity : this.birdsPerDay){
            if(birdQuantity == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sumOfBirds = 0;
        for(int i=0; i < numberOfDays && i < birdsPerDay.length; i++){
            sumOfBirds+=birdsPerDay[i];
        }
        return sumOfBirds;
    }

    public int getBusyDays() {
        int sumOfBusyDays = 0;
        for(int birdQuantity : this.birdsPerDay){
            if(birdQuantity>=5){sumOfBusyDays++;}
        }
        return sumOfBusyDays;
    }
}
