package Today_Work_0210;

interface callable{
    void call();
}
interface InternetConnectable{
    void Connect();
}
interface Pictureable{
    void TakePhoto();
}

class Eletronics{
    boolean power;
    
    boolean ispower() {
        boolean poweronoff = (power != true) ? true : false;
        System.out.println(poweronoff);
        power = poweronoff;
        return power;
    }
}

class SmartPhone extends Eletronics implements callable, InternetConnectable, Pictureable{
    
    String camera;
    String display;
    String microphone;
    String speaker;
    boolean wifi;
    
    SmartPhone(String camera, String display, String microphone, String speaker, boolean wifi){
        this.camera = camera;
        this.display = display;
        this.microphone = microphone;
        this.speaker = speaker;
        this.wifi = wifi;
    }
    
    boolean wifionoff() {
        boolean wifionoff = (wifi != true) ? true : false;
        wifi = wifionoff;
        return wifi;
    }

    @Override
    public void TakePhoto() {
        System.out.println("찰칵! " + "카메라 타입: " + camera);
    }

    @Override
    public void Connect() {
        System.out.println("액정: " + display + "들어가기");
        
        
    }

    @Override
    public void call() {
        
    }
    
    
    public void wifi() {
        wifionoff();
        System.out.println(wifi);
    }
    
}

class Lg extends SmartPhone{

    Lg(String camera, String display, String microphone, String speaker, boolean wifi) {
        super(camera, display, microphone, speaker, wifi);
    }
}

class Galaxy extends SmartPhone{

    Galaxy(String camera, String display, String microphone, String speaker, boolean wifi) {
        super(camera, display, microphone, speaker, wifi);
    }

    @Override
    public void TakePhoto() {
        System.out.println("찰칵! " + "카메라 타입: " + camera);

    }

    @Override
    public void Connect() {
        System.out.println("연결! ");
    }

    @Override
    public void call() {
        
    }

    @Override
    public void wifi() {
        wifionoff();
        System.out.println(wifi);
    }
    
}

class iPhone extends SmartPhone{

    iPhone(String camera, String display, String microphone, String speaker, boolean wifi) {
        super(camera, display, microphone, speaker, wifi);
    }

   
}


public class Phone {
    public static void main(String[] args) {
        
        Galaxy s2 = new Galaxy("CA", "LA", "MA", "SA", false);
        s2.TakePhoto();
        s2.wifi();
        s2.wifi();
        s2.wifi();
        
        iPhone i10 = new iPhone("CB", "LB", "MB", "SB", false);
        i10.TakePhoto();
        
    }

}
