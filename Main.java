
public class Main {
    public static void main(String[] args) {
        //object
        Grandfather obj1=new Grandfather("Noel", ........................1948);
        Father obj2=new Father("Father", 1968,"Electrician");
        Son obj3=new Son("Son",2006,"His","8");

        obj1.Noel();
        obj1.old();

        System.out.println();

        obj2.Noel();
        obj2.old();
        obj2.Electrician();

        System.out.println();

        obj3.Noel();
        obj3.old();
        obj3.Electrician();
        obj3.School();

    }
}
