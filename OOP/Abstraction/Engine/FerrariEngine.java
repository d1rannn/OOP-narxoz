package OOP.Abstraction.Engine;

public class FerrariEngine extends Engine
{
    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight) {
        super(engineVolume, cylinderAmount, engineWeight);
    }

    public FerrariEngine(){

    }

    public double efficiency(){
        return 0.25;
    }

    public double throttleEnergy(){
        return engineVolume*cylinderAmount*100;
    }

    public double breakEnergy(){
        return engineWeight*2;
    }
}
