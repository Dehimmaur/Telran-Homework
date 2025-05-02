import java.io.*;

public class Main {

    public static void main(String[] args) {
        int menu;
        while (true) {
            menu = mainMenu();
            if (menu == 1) {
                division3();
            } else if (menu == 2) {
                loanChecker();
            } else if (menu == 3) {
                sum3();
            } else if (menu == 0) {
                System.out.println("Goodbye");
                return;
            } else {
                System.out.println("Goodbye");
                return;
            }
        }
    }

    public static void loanChecker() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int income;
            int age;
            boolean not_loan = false;

            while (true) {
                System.out.print("What is your income? ");
                try {
                    income = Integer.parseInt(reader.readLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("If your salary is in letters, then you don't need a loan!");
                    System.out.print("Are you sure you need a loan? y/n ");
                    String answer = reader.readLine().trim().toLowerCase();

                    if (answer.equals("y") || answer.equals("yes") || answer.equals("д") || answer.equals("да")) {
                        continue;
                    } else {
                        System.out.println("Good luck, come see us next time!");
                        return;
                    }
                }
            }

            while (true) {
                System.out.print("What is your age? ");
                try {
                    age = Integer.parseInt(reader.readLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Don't play with me! Do you need a loan? y/n ");
                    String answer = reader.readLine().trim().toLowerCase();
                    if (answer.equals("y") || answer.equals("yes") || answer.equals("д") || answer.equals("да")) {
                        continue;
                    } else {
                        System.out.println("Good luck, come see us next time!");
                        return;
                    }
                }
            }


            while (true) {
                System.out.print("Do you have other loans or legal problems? y/n ");
                String answer = reader.readLine().trim().toLowerCase();
                if (answer.equals("n")) {
                    not_loan = true;
                    break;
                } else {
                    System.out.println("We have nothing to talk about!");
                    return;
                }
            }

            String out_message = (age >= 21 && income >= 12000 && not_loan)  ? "Congratulations! Loan approved" : "Sorry. Loan not approved";
            System.out.println(out_message);
        } catch (IOException e) {
            System.err.println("Ошибка ввода: " + e.getMessage());
        }
        return;
    }

    public static int mainMenu() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to a unique service. Choose what interests you at the moment: ");
            System.out.println("1 - Division by 3");
            System.out.println("2 - It's high time to take out a loan!");
            System.out.println("3 - Let's calculate the sum of tree numbers");
            System.out.println("0 - EXIT");
            while (true) {
                String answer = reader.readLine().trim().toLowerCase();
                if (answer.equals("1")) {
                    return 1;
                } else if (answer.equals("2")) {
                    return 2;
                } else if (answer.equals("3")) {
                    return 3;
                } else if (answer.equals("0")) {
                    return 0;
                } else {
                    System.out.println("I couldn't understand what you want.");
                    System.out.print("Do you want to go out? y/n ");
                    answer = reader.readLine().trim().toLowerCase();
                    if (answer.equals("y") || answer.equals("yes") || answer.equals("д") || answer.equals("да")) {
                        return 0;
                    } else {
                        mainMenu();
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Ошибка ввода: " + e.getMessage());
        }
        return 0;
    }

    public static void division3(){
        int number;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.print("Enter number: ");
                try {
                    number = Integer.parseInt(reader.readLine());
                    int reminder = number%3;
                    String out_message = (reminder==0)  ? "Your number is divisible by 3" : "Your number is not divisible by 3";
                    System.out.println(out_message);
                    System.out.print("Do you want to go out? y/n ");
                    String answer = reader.readLine().trim().toLowerCase();
                    if (answer.equals("y") || answer.equals("yes") || answer.equals("д") || answer.equals("да")) {
                        System.out.println("Good luck!");
                        return;
                    } else {
                        continue;
                    }

                } catch (NumberFormatException e) {
                    System.out.print("You need to enter an integer. Do you want to continue? y/n ");
                    String answer = reader.readLine().trim().toLowerCase();
                    if (answer.equals("y") || answer.equals("yes") || answer.equals("д") || answer.equals("да")) {
                        continue;
                    } else {
                        System.out.println("Good luck!");
                        return;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка ввода: " + e.getMessage());
        }
    }

    public static void sum3(){
        int num1, num2, num3;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.print("Enter first number: ");
                num1 = Integer.parseInt(reader.readLine());
                System.out.print("Enter second number: ");
                num2 = Integer.parseInt(reader.readLine());
                System.out.print("Enter third number: ");
                num3 = Integer.parseInt(reader.readLine());

                String result = ((num1+num2+num3) > 0) && (((num1+num2+num3)%2)==0) ? "The sum of three numbers is positive and even" : "Sum = " + ((num1+num2+num3));
                System.out.println(result);
                return;
            }
        } catch (IOException e) {
            System.err.println("Ошибка ввода: " + e.getMessage());
        }
    }
}