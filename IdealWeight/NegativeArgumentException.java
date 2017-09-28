package Others.IdealWeight;


public class NegativeArgumentException extends Exception {
    private int ageValue;
    private float weightValue;
    private float heightValue;
    private float lowranceValue;

    public NegativeArgumentException(int ageValue) {
        this.ageValue = ageValue;
    }

    public NegativeArgumentException(float weightValue, float heightValue, float lowranceValue) {
        this.weightValue = weightValue;
        this.heightValue = heightValue;
        this.lowranceValue = lowranceValue;
    }

    public int getAgeValue() {
        return ageValue;
    }

    public float getWeightValue() {
        return weightValue;
    }

    public float getHeightValue() {
        return heightValue;
    }

    public float getLowranceValue() {
        return lowranceValue;
    }
}
