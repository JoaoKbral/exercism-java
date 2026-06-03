public class Lasagna {
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_TIME_PER_LAYER = 2;
    
    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES_IN_OVEN;
    }
    
    public int remainingMinutesInOven(int timeInOven){
        return this.expectedMinutesInOven() - timeInOven;
    }
    
    public int preparationTimeInMinutes(int layerQuantity){
        return layerQuantity*PREPARATION_TIME_PER_LAYER;
    }

    public int totalTimeInMinutes(int layerQuantity, int timeInOven){
        return this.preparationTimeInMinutes(layerQuantity) + timeInOven;
    }
}
