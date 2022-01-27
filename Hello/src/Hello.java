public class Hello {

  public static void main(String[] args) {
    System.out.println("Hello, Tony");

    int myFirstNumber = (10 + 5) + (2 * 10);
    int mySecondNumber = 12;
    int myThirdNumber = myFirstNumber * 2;
    int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
    System.out.println(myTotal);

//    TWO DIFFERENT RESULTS...
    int myLastOne = 1000 - myTotal;
    int myLastOnes = myTotal - 1000;
    System.out.println(myLastOne);
    System.out.println(myLastOnes);
  }
}
