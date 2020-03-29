/**
 * task4
 */
class Android
{
    static int tag;
    static String name;

    static void change_tag(){
        System.out.println("Tag : "+tag);
    }
    static void change_Name(){
        System.out.println("Name : "+name);
    }


    Android(int tag,String name)
    {
        this.tag = tag;
        this.name = name;
        change_tag();
        change_Name();
    }
    
}
public class task4 {
    public static void main(String[] args) {
        Android obj = new Android(1,"nfds");
        Android obj2 = new Android(1,"mannn");
    }
}