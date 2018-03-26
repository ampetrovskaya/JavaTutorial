package staticpackage;

public class StaticExampleClass {
    public String make;
    public static int instanceNum = 0;

    public StaticExampleClass(String make){
        this.make = make;
        instanceNum++;
    }

    public String getMake(){
        return make;
    }

    public static int getInstanceNum(){
        return instanceNum;
    }

}
