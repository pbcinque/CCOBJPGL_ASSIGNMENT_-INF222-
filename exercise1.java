public class exercise1 {
    static boolean iWillBehave = true;
    static boolean IWillGraduate = true;

    public static void main(String[] args) throws Exception {

        //precondition
        assert iWillBehave == true : "Hindi makikinig sa klase";

        //method
        College();

        //poscondition
        assert IWillGraduate == true : "Kasi hindi nagseseryoso";
    }
    static void College(){
        IWillGraduate = false;
        System.out.println("It's graduation day!");
    }
}