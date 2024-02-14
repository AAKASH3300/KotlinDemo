public class Runner {
    public static void main(String[] args)
    {
        //int result = FunctionExpKt.add(5,8);//Specify byte code class file name to access kotlin method in Java class
        // Kotlin filename(FunctionExp.kt) acts as the class name(FunctionExpKt) in Java
        int result = First.add(5,8);
        System.out.println(result);

        System.out.println( Params.calcAmount(70)); // @JvmOverloads comes into picture here if we need to pass only one parameter i.e. amt

    }

}
