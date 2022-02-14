public class Lesson9Homework {
    public static void main(String[] args) {

//      CASH REGISTER

        int cashProvided = 86;
        int itemPrice = 7;
        int yourChange = cashProvided - itemPrice;


        if ((cashProvided > itemPrice) && (itemPrice>0) && (cashProvided<=100)) {
            System.out.println("Your change is: KM " + yourChange);
        }
        if ((itemPrice > cashProvided) && (itemPrice<=100)) {
            System.out.println("Sorry, it seems that you don't have enough money :(");
        }
        if ((itemPrice == cashProvided) && (cashProvided<=100) && (itemPrice<=100))  {
            System.out.println("You've got just the right amount of money, there is no change for you this time");
        }
        if (cashProvided>100) {
            System.out.println("You have too much money");
        }
        if (itemPrice == 0) {
            System.out.println("You didn't buy anything, did you? " + "Did you maybe break something?");
        }
        if (itemPrice < 0) {
            System.out.println("You're kidding, right? FREE money? Take it and run");
        }
        if (itemPrice > 100) {
            System.out.println("You should not be shopping here");
        }

        int divisionTwenty = yourChange / 20;
        int divisionTen = yourChange / 10;

        if ((cashProvided > itemPrice) && (itemPrice>0) && (cashProvided<=100)) {
        System.out.println("KM 20 bills: " + divisionTwenty);
        }
        if ((cashProvided > itemPrice) && (itemPrice>0) && (cashProvided<=100) && (((yourChange - divisionTwenty * 20) % 10) != 0)) {
            System.out.println("KM 10 bills: " + yourChange % 20 / 10);
        }
        if ((cashProvided > itemPrice) && (itemPrice>0) && (cashProvided<=100) && (((yourChange - divisionTen * 10) % 2) >= 0)) {
            System.out.println("KM 2 coins: " + yourChange % 10/ 2);
        }
        if ((cashProvided > itemPrice) && (itemPrice>0) && (cashProvided<=100) && (yourChange%2!=0)) {
            System.out.println("KM 1 coins: " + "1");
        }
        if ((cashProvided > itemPrice) && (itemPrice>0) && (cashProvided<=100) && (yourChange%2==0)) {
            System.out.println("KM 1 coins: " + "0");
            }
        System.out.println("============================================================");

//     AREA OF A CIRCLE CALCULATOR

        double mathConstantPi = 3.1416;
        double circleDiameter = 9.5;
        double radiusLength = circleDiameter/2;
        double areaOfCircle = radiusLength*radiusLength*mathConstantPi;
        System.out.println("Area of a circle (A=πr^2) = " + areaOfCircle);
        System.out.println("============================================================");


//      A/B DIVISION

        {
        int numberA = 15;
        int numberB = 5;

        if ((numberA>10) && (numberA%3==0) && (numberA<=10000) && (numberA%numberB==0)) {
            System.out.println("The number "+numberA+" is divisible by number "+numberB);
        }
        if ((numberA>10) && (numberA%3==0) && (numberA<=10000) && (numberA%numberB!=0)) {
            System.out.println("The number "+numberA+" is NOT divisible by number "+numberB);
        }
        if ((numberA<=10) || (numberA%3!=0) || (numberA>10000)){
            System.out.println("You have entered incorrect parameters");
        }
            System.out.println("============================================================");
        }

//      A/B RELATIONS

        {
        double numberA = 21.5;
        double numberB = 21.5;
        double sum = numberA+numberB;
        double division = numberA-numberB;
        double multiplication = numberA*numberB;

        if (numberA>numberB) {
            System.out.println("A + B = "+sum);
        }
        if (numberA<numberB){
            System.out.println("B - A = "+division);
        }
        if (numberA==numberB){
            System.out.println("B * A = "+multiplication);
        }
            System.out.println("============================================================");
        }

//     EQUATION WITH 'X' (RESULT IS ALWAYS 3)
        {
            int numberX = 8655;
            int homeworkEquation = (numberX+numberX+6)/2-numberX;
            System.out.println("Homework Equation Result: "+homeworkEquation);

            if (homeworkEquation%2!=0){
                System.out.println("Result of the Homework Equation ("+homeworkEquation+ ") is NOT divisible by 2");
            }
            if (homeworkEquation%2==0){
                System.out.println("Result of the Homework Equation, "+homeworkEquation+ ", is divisible by 2");
            }
            System.out.println("============================================================");

        }

//      ABCD LOGIC
        {
            int numberA = 43;
            int numberB = 102;
            int numberC = 68;
            int numberD = 17;
            int sum =numberA+numberB+numberC+numberD;
            {
            if (((numberA>0) && (numberB>0)) || ((numberC>0) && (numberD>0))){
                System.out.println("Sum ABCD = "+sum);
            }
            if ((sum>100) && (sum%2==0)){
            System.out.println("Half of the sum ABCD = "+sum/2);
                }
            if ((sum>100) && (sum%2!=0) && ((sum-1)%2==0)){
            System.out.println("Half of the sum reduced by 1 = "+(sum-1)/2);
                }
            if ((sum>100) && (sum%2!=0) && ((sum-1)%2!=0)) {
            System.out.println("The number is still not divisible by 2");
                }
            System.out.println("============================================================");
            }
        }
    }
}
