public class human{
    /*outside classes cannot be static class only inner classes can be static class */
    String name;
    int age;
    static long population;
    static int height=6;
    static int h;


    human(String n, int a){
        this.name=n;
        this.age=a;
        //this.population +=1;//this is not the right usage of initationg constructor.as the static variable is object independant
        human.population +=1;//the object initating human class is not related to static variable , thats the reason it is initated with parent class
    }
    /*in order to modify the static variables we can do them only in a static block
     * as they are not dependant on any object. the static block will run only once
     */
    static{
        System.out.println("modifying the static variable");
        h=height*2;
    }
        /*innerExmpl class is dependant on the human class hence it cannot be used/intantiated directly
         * either it has to be declared static or the variables has to be static to be used in innerclass
         */
    class innerExmpl{
        String define;
    }
}