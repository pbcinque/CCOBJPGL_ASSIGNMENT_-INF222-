public class exercise1 {
    static boolean iWillBehave = true;
    static boolean IWillGraduate = true;

    public static void main(String[] args) throws Exception {

        //precondition
        assert iWillBehave == false : "Hindi nakikinig sa klase";

        //method
        College();

        //postcondition
        assert IWillGraduate == false : "Kasi hindi nagseseryoso";
    }
    static void College(){
        IWillGraduate = false;
        System.out.println("It's graduation day!");
    }
}
