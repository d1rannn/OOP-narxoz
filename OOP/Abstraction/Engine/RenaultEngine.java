package OOP.Abstraction.Engine;

public class RenaultEngine extends Engine
{
    private double extraTurboEnergy;

    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public RenaultEngine() {
        this.extraTurboEnergy = 0.0;
    }

    public double getExtraTurboEnergy() {
        return extraTurboEnergy;
    }

    public void setExtraTurboEnergy(double extraTurboEnergy) {
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public double efficiency(){
        return 0.27;
    }

    public double throttleEnergy(){
        return engineVolume*cylinderAmount*110 + extraTurboEnergy;
    }

    public double breakEnergy(){
        return engineWeight*2.1;
    }
}
