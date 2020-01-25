import java.util.Scanner;

public class Quadruple<One, Two, Three, Four> {
    private One one;
    private Two two;
    private Three three;
    private Four four;

    protected Quadruple(One one, Two two, Three three, Four four){
        this.one=one;
        this.two=two;
        this.three=three;
        this.four=four;
    }
    public Quadruple listCrew(){
        System.out.println("A members:"+one);
        System.out.println("B members:"+two);
        System.out.println("C members:"+three);
        System.out.println("D members:"+four);

        Quadruple quadruple = new Quadruple(one,two,three,four);

        return quadruple;
    }

    public static void main(String[] args) {

        Quadruple<String,String,String,String> quadrupleInstance = new Quadruple
                <String, String, String,String>
                ("Magda","Antek","Zofia","Edmund");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String c = scanner.nextLine();

        quadrupleInstance.AddUserC(c);
        quadrupleInstance.AddUserB(a);
        quadrupleInstance.listCrew();
    }

    public void AddUserA(Alpha alpha){
        this.one=one;
    }
    public void AddUserB(Beta beta){
        this.two=two;
    }
    public void AddUserC(Charlie charlie){
        this.three=three;
    }
    public void AddUserD(Delta delta){
        this.four=four;
    }

}
