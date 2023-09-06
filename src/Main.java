public class Main {

    public static void main(String[] args) {
        int addmethod = add (1,2);
        System.out.println(addmethod);

        int addmethodtwo = add (1,2,3,4);
        System.out.println(addmethodtwo);

        String morninggreeting = morningGreeting ("Elly");
        System.out.println(morninggreeting);

        String afternoongreeting = afternoonGreeting ("Elly");
        System.out.println(afternoongreeting);

        String triple = triple("Elly");
        System.out.println(triple);

        double half = half(4);
        System.out.println(half);

        int positive = roundPositiveValueToNearestInteger(5.1);
        System.out.println(positive);

        int negative = roundNegativeValueToNearestInteger(-5.1);
        System.out.println(negative);
    }

    // 1. add
    public static int add (int a, int b){
        return a+b;
    }
    // 2. add
    public static int add (int a, int b, int c, int d){
        return add(d,(add(c,(add(a,b)))));
    }

    // 3. morningGreeting
    public static String morningGreeting (String A){
        return "早上好, " + A + "!";
    }

    // 4. afternoonGreeting

    public static String afternoonGreeting (String A){
        return "下午好, " + A + "!";
    }

    // 5. triple
    public static String triple (String A){
        return(A+A+A);
    }

    // 6. half
    public static double half (double a){
        return a/2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger (double a){
        return (int) (a+0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger (double a){
        return (int) (a-0.5);
    }

}
