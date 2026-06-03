public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timeInOven){
        return this.expectedMinutesInOven() - timeInOven;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layerQuantity){
        return layerQuantity*2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layerQuantity, int timeInOven){
        return this.preparationTimeInMinutes(layerQuantity) + timeInOven;
    }
}
