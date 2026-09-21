//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int intOperandA = 20;
    int intOperandB = 6;
    int intSum = 0;
    int intProduct = 0;
    int intDifference = 0;
    int intQuotient = 0;
    int intModulo = 0;

    double doubleOperandA = 19.50;
    double doubleOperandB = 4.25;
    double doubleSum = 0.0;
    double doubleProduct = 0.0;
    double doubleDifference = 0.0;
    double doubleQuotient = 0.0;

    intSum = intOperandA + intOperandB;
    System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);

    intDifference = intOperandA - intOperandB;
    System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference);

    intProduct = intOperandA * intOperandB;
    System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);

    intQuotient = intOperandA / intOperandB;
    System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);

    intModulo = intOperandA % intOperandB;
    System.out.println("The modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);

    doubleSum = doubleOperandA + doubleOperandB;
    System.out.println("The sum using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);

    doubleDifference = doubleOperandA - doubleOperandB;
    System.out.println("The difference using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference);

    doubleProduct = doubleOperandA * doubleOperandB;
    System.out.println("The product using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);

    doubleQuotient = doubleOperandA / doubleOperandB;
    System.out.println("The quotient using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient);

    int numberOfKids = 3;
    boolean isRaining = false;
    double gasPricePerGallon = 3.49;
    int favoriteNumber = 7;
    double shoeSize = 10.5;
    int birthMonth = 8;
    String fullName = "Alex Smith";

    //task1

    double purchasePrice = 45.00;
    double salesTaxRate = 0.05;
    double computedTax = purchasePrice * salesTaxRate;

    System.out.println("The purchase price is: $" + purchasePrice);
    System.out.println("The computed 5% sales tax is: $" + computedTax);

    //task2

    double springCost = 250.75;
    double summerCost = 410.50;
    double fallCost = 175.25;
    double winterCost = 320.00;

    double totalYearlyCost = springCost + summerCost + fallCost + winterCost;

    System.out.println("Spring maintenance cost: $" + springCost);
    System.out.println("Summer maintance cost: $"+ summerCost);
    System.out.println("Fall maintenance cost: $" + fallCost);
    System.out.println("Winter maintenance cost: $" + winterCost);
    System.out.println("Total yearly home maintenance cost: $" + totalYearlyCost);

    //task3

    double startingBalance = 5000.00;
    double annualInterestRate = 0.17;
    double monthlyInterestRate = annualInterestRate / 12.0;

    double monthOneInterest = startingBalance * monthlyInterestRate;
    double balanceAfterMonthOne = startingBalance + monthOneInterest;

    double monthTwoInterest = balanceAfterMonthOne * monthlyInterestRate;

    System.out.println("Starting balance: $" + startingBalance);
    System.out.println("Annual Interest Rate: 17%");
    System.out.println("Interest due after month 1: $" + monthOneInterest);
    System.out.println("Interest due after month 2: $" + monthTwoInterest);

    //task4

    int numToExamine = 14;
    int moduloResult = numToExamine % 2;

    System.out.println("THe number being examined is: " + numToExamine);
    System.out.println("Result of " + numToExamine + " % 2 is: " + moduloResult);
    System.out.println("Note: A value of 0 means the number is even, and a value 0f 1 means the number is odd.");
}


