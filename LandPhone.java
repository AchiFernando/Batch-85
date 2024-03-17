import org.w3c.dom.ls.LSOutput;

public class LandPhone {
    String Name;

    int Year;

    LandPhone(String Name, int Year){
        this.Name=Name;
        this.Year=Year;
    }
    void Call(){
        System.out.println(Name+"Can call");
    }
    void Dial(){
        System.out.println("By using"+Name+"We can dial phone" );
    }
}
