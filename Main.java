import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String question1 = "1.) Which data type is used to store decimal numbers in Java?";
        String choice1One = "int";
        String choice1Two = "double";
        String choice1Three = "char";
        String choice1Four = "boolean";

        String correctAnswer1 = choice1Two;

        boolean isOnRepeat = true;
        while (isOnRepeat) {
        System.out.println(question1);

        System.out.println("Choose one of the following: ");
        System.out.println(choice1One);
        System.out.println(choice1Two);
        System.out.println(choice1Three);
        System.out.println(choice1Four);

        Scanner scanner = new Scanner(System.in);

            String input1 = scanner.next();
            System.out.println("Your answer is " + input1);

            if (correctAnswer1.equals(input1.toLowerCase())) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer1);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question2 = "2.) What is the default value of an uninitialized boolean variable in Java?";
        String choice2One = "true";
        String choice2Two = "0";
        String choice2Three = "false";
        String choice2Four = "null";

        String correctAnswer2 = choice2Three;

        boolean isOnRepeat2 = true;
        while (isOnRepeat2) {
            System.out.println(question2);
            System.out.println("Choose one of the following: ");
            System.out.println(choice2One);
            System.out.println(choice2Two);
            System.out.println(choice2Three);
            System.out.println(choice2Four);

            Scanner scanner = new Scanner(System.in);
            String input2 = scanner.next();
            System.out.println("Your answer is " + input2);

            if (correctAnswer2.equals(input2.toLowerCase())) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat2 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer2);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question3 = "3.) Which keyword is used to define a constant in Java?";
        String choice3One = "const";
        String choice3Two = "static";
        String choice3Three = "final";
        String choice3Four = "constant";

        String correctAnswer3 = choice3Three;

        boolean isOnRepeat3 = true;
        while (isOnRepeat3) {
            System.out.println(question3);
            System.out.println("Choose one of the following: ");
            System.out.println(choice3One);
            System.out.println(choice3Two);
            System.out.println(choice3Three);
            System.out.println(choice3Four);

            Scanner scanner = new Scanner(System.in);
            String input3 = scanner.next();
            System.out.println("Your answer is " + input3);

            if (correctAnswer3.equals(input3.toLowerCase())) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat3 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer3);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question4 = "4.) Which OOP principle allows one class to inherit properties from another?";
        String choice4One = "Encapsulation";
        String choice4Two = "Inheritance";
        String choice4Three = "Polymorphism";
        String choice4Four = "Abstraction";

        String correctAnswer4 = choice4Two;

        boolean isOnRepeat4 = true;
        while (isOnRepeat4) {
            System.out.println(question4);
            System.out.println("Choose one of the following: ");
            System.out.println(choice4One);
            System.out.println(choice4Two);
            System.out.println(choice4Three);
            System.out.println(choice4Four);

            Scanner scanner = new Scanner(System.in);
            String input4 = scanner.next();
            System.out.println("Your answer is " + input4);

            if (correctAnswer4.equals(input4)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat4 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer4);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question5 = "5.) The process of hiding internal details and showing only functionality is called?";
        String choice5One = "Inheritance";
        String choice5Two = "Polymorphism";
        String choice5Three = "Abstraction";
        String choice5Four = "Overloading";

        String correctAnswer5 = choice5Three;

        boolean isOnRepeat5 = true;
        while (isOnRepeat5) {
            System.out.println(question5);
            System.out.println("Choose one of the following: ");
            System.out.println(choice5One);
            System.out.println(choice5Two);
            System.out.println(choice5Three);
            System.out.println(choice5Four);

            Scanner scanner = new Scanner(System.in);
            String input5 = scanner.next();
            System.out.println("Your answer is " + input5);

            if (correctAnswer5.equals(input5)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat5 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer5);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question6 = "6.) Which OOP concept allows the same method to behave differently depending on the object?";
        String choice6One = "Inheritance";
        String choice6Two = "Encapsulation";
        String choice6Three = "Polymorphism";
        String choice6Four = "Abstraction";

        String correctAnswer6 = choice6Three;

        boolean isOnRepeat6 = true;
        while (isOnRepeat6) {
            System.out.println(question6);
            System.out.println("Choose one of the following: ");
            System.out.println(choice6One);
            System.out.println(choice6Two);
            System.out.println(choice6Three);
            System.out.println(choice6Four);

            Scanner scanner = new Scanner(System.in);
            String input6 = scanner.next();
            System.out.println("Your answer is " + input6);

            if (correctAnswer6.equals(input6)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat6 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer6);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question7 = "7.) In Java, every class implicitly inherits from which class?";
        String choice7One = "Parent";
        String choice7Two = "Base";
        String choice7Three = "Object";
        String choice7Four = "Super";

        String correctAnswer7 = choice7Three;

        boolean isOnRepeat7 = true;
        while (isOnRepeat7) {
            System.out.println(question7);
            System.out.println("Choose one of the following: ");
            System.out.println(choice7One);
            System.out.println(choice7Two);
            System.out.println(choice7Three);
            System.out.println(choice7Four);

            Scanner scanner = new Scanner(System.in);
            String input7 = scanner.next();
            System.out.println("Your answer is " + input7);

            if (correctAnswer7.equals(input7)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat7 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer7);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question8 = "8.) What is the extension of a Java source file?";
        String choice8One = ".exe";
        String choice8Two = ".java";
        String choice8Three = ".class";
        String choice8Four = ".txt";

        String correctAnswer8 = choice8Two;

        boolean isOnRepeat8 = true;
        while (isOnRepeat8) {
            System.out.println(question8);
            System.out.println("Choose one of the following: ");
            System.out.println(choice8One);
            System.out.println(choice8Two);
            System.out.println(choice8Three);
            System.out.println(choice8Four);

            Scanner scanner = new Scanner(System.in);
            String input8 = scanner.next();
            System.out.println("Your answer is " + input8);

            if (correctAnswer8.equals(input8.toLowerCase())) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat8 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer8);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question9 = "9.) Which OOP principle helps reduce code duplication and increases reusability?";
        String choice9One = "Polymorphism";
        String choice9Two = "Inheritance";
        String choice9Three = "Abstraction";
        String choice9Four = "Encapsulation";

        String correctAnswer9 = choice9Two;

        boolean isOnRepeat9 = true;
        while (isOnRepeat9) {
            System.out.println(question9);
            System.out.println("Choose one of the following: ");
            System.out.println(choice9One);
            System.out.println(choice9Two);
            System.out.println(choice9Three);
            System.out.println(choice9Four);

            Scanner scanner = new Scanner(System.in);
            String input9 = scanner.next();
            System.out.println("Your answer is " + input9);

            if (correctAnswer9.equals(input9)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat9 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer9);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question10 = "10.) Which access modifier allows visibility only within the same package?";
        String choice10One = "public";
        String choice10Two = "protected";
        String choice10Three = "private";
        String choice10Four = "default";

        String correctAnswer10 = choice10Four;

        boolean isOnRepeat10 = true;
        while (isOnRepeat10) {
            System.out.println(question10);
            System.out.println("Choose one of the following: ");
            System.out.println(choice10One);
            System.out.println(choice10Two);
            System.out.println(choice10Three);
            System.out.println(choice10Four);

            Scanner scanner = new Scanner(System.in);
            String input10 = scanner.next();
            System.out.println("Your answer is " + input10);

            if (correctAnswer10.equals(input10.toLowerCase())) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat10 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer10);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question11 = "11.) Which language is used to interact with relational databases?";
        String choice11One = "HTML";
        String choice11Two = "SQL";
        String choice11Three = "XML";
        String choice11Four = "JSON";

        String correctAnswer11 = choice11Two;

        boolean isOnRepeat11 = true;
        while (isOnRepeat11) {
            System.out.println(question11);
            System.out.println("Choose one of the following: ");
            System.out.println(choice11One);
            System.out.println(choice11Two);
            System.out.println(choice11Three);
            System.out.println(choice11Four);

            Scanner scanner = new Scanner(System.in);
            String input11 = scanner.next();
            System.out.println("Your answer is " + input11);

            if (correctAnswer11.equals(input11)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat11 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer11);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question12 = "12.) Which SQL command is used to remove a table permanently?";
        String choice12One = "DELETE";
        String choice12Two = "REMOVE";
        String choice12Three = "DROP";
        String choice12Four = "CLEAR";

        String correctAnswer12 = choice12Three;

        boolean isOnRepeat12 = true;
        while (isOnRepeat12) {
            System.out.println(question12);
            System.out.println("Choose one of the following: ");
            System.out.println(choice12One);
            System.out.println(choice12Two);
            System.out.println(choice12Three);
            System.out.println(choice12Four);

            Scanner scanner = new Scanner(System.in);
            String input12 = scanner.next();
            System.out.println("Your answer is " + input12);

            if (correctAnswer12.equals(input12)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat12 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer12);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question13 = "13.) Which software development model follows strict sequential phases?";
        String choice13One = "Agile";
        String choice13Two = "Waterfall";
        String choice13Three = "Spiral";
        String choice13Four = "V-Model";

        String correctAnswer13 = choice13Two;

        boolean isOnRepeat13 = true;
        while (isOnRepeat13) {
            System.out.println(question13);
            System.out.println("Choose one of the following: ");
            System.out.println(choice13One);
            System.out.println(choice13Two);
            System.out.println(choice13Three);
            System.out.println(choice13Four);

            Scanner scanner = new Scanner(System.in);
            String input13 = scanner.next();
            System.out.println("Your answer is " + input13);

            if (correctAnswer13.equals(input13)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat13 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer13);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question14 = "14.) Which keyword is used to stop the execution of a loop in Java?";
        String choice14One = "exit";
        String choice14Two = "break";
        String choice14Three = "stop";
        String choice14Four = "return";

        String correctAnswer14 = choice14Two;

        boolean isOnRepeat14 = true;
        while (isOnRepeat14) {
            System.out.println(question14);
            System.out.println("Choose one of the following: ");
            System.out.println(choice14One);
            System.out.println(choice14Two);
            System.out.println(choice14Three);
            System.out.println(choice14Four);

            Scanner scanner = new Scanner(System.in);
            String input14 = scanner.next();
            System.out.println("Your answer is " + input14);

            if (correctAnswer14.equals(input14.toLowerCase())) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat14 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer14);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question15 = "15.) Which data type is used to store true/false values in Java?";
        String choice15One = "int";
        String choice15Two = "boolean";
        String choice15Three = "char";
        String choice15Four = "string";

        String correctAnswer15 = choice15Two;

        boolean isOnRepeat15 = true;
        while (isOnRepeat15) {
            System.out.println(question15);
            System.out.println("Choose one of the following: ");
            System.out.println(choice15One);
            System.out.println(choice15Two);
            System.out.println(choice15Three);
            System.out.println(choice15Four);

            Scanner scanner = new Scanner(System.in);
            String input15 = scanner.next();
            System.out.println("Your answer is " + input15);

            if (correctAnswer15.equals(input15.toLowerCase())) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat15 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer15);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question16 = "16.) Which keyword is used to define a constant in Java?";
        String choice16One = "const";
        String choice16Two = "final";
        String choice16Three = "static";
        String choice16Four = "constant";

        String correctAnswer16 = choice16Two;

        boolean isOnRepeat16 = true;
        while (isOnRepeat16) {
            System.out.println(question16);
            System.out.println("Choose one of the following: ");
            System.out.println(choice16One);
            System.out.println(choice16Two);
            System.out.println(choice16Three);
            System.out.println(choice16Four);

            Scanner scanner = new Scanner(System.in);
            String input16 = scanner.next();
            System.out.println("Your answer is " + input16);

            if (correctAnswer16.equals(input16.toLowerCase())) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat16 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer16);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question17 = "17.) Which keyword is used to create an object in Java?";
        String choice17One = "class";
        String choice17Two = "new";
        String choice17Three = "this";
        String choice17Four = "super";

        String correctAnswer17 = choice17Two;

        boolean isOnRepeat17 = true;
        while (isOnRepeat17) {
            System.out.println(question17);
            System.out.println("Choose one of the following: ");
            System.out.println(choice17One);
            System.out.println(choice17Two);
            System.out.println(choice17Three);
            System.out.println(choice17Four);

            Scanner scanner = new Scanner(System.in);
            String input17 = scanner.next();
            System.out.println("Your answer is " + input17);

            if (correctAnswer17.equals(input17.toLowerCase())) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat17 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer17);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question18 = "18.) Which OOP principle is about wrapping data and methods together?";
        String choice18One = "Abstraction";
        String choice18Two = "Inheritance";
        String choice18Three = "Encapsulation";
        String choice18Four = "Polymorphism";

        String correctAnswer18 = choice18Three;

        boolean isOnRepeat18 = true;
        while (isOnRepeat18) {
            System.out.println(question18);
            System.out.println("Choose one of the following: ");
            System.out.println(choice18One);
            System.out.println(choice18Two);
            System.out.println(choice18Three);
            System.out.println(choice18Four);

            Scanner scanner = new Scanner(System.in);
            String input18 = scanner.next();
            System.out.println("Your answer is " + input18);

            if (correctAnswer18.equals(input18)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat18 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer18);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question19 = "19.) Which OOP principle is about one class acquiring properties of another?";
        String choice19One = "Composition";
        String choice19Two = "Inheritance";
        String choice19Three = "Abstraction";
        String choice19Four = "Encapsulation";

        String correctAnswer19 = choice19Two;

        boolean isOnRepeat19 = true;
        while (isOnRepeat19) {
            System.out.println(question19);
            System.out.println("Choose one of the following: ");
            System.out.println(choice19One);
            System.out.println(choice19Two);
            System.out.println(choice19Three);
            System.out.println(choice19Four);

            Scanner scanner = new Scanner(System.in);
            String input19 = scanner.next();
            System.out.println("Your answer is " + input19);

            if (correctAnswer19.equals(input19)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat19 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer19);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question20 = "20.) Which keyword is used to prevent method overriding?";
        String choice20One = "static";
        String choice20Two = "abstract";
        String choice20Three = "final";
        String choice20Four = "private";

        String correctAnswer20 = choice20Three;

        boolean isOnRepeat20 = true;
        while (isOnRepeat20) {
            System.out.println(question20);
            System.out.println("Choose one of the following: ");
            System.out.println(choice20One);
            System.out.println(choice20Two);
            System.out.println(choice20Three);
            System.out.println(choice20Four);

            Scanner scanner = new Scanner(System.in);
            String input20 = scanner.next();
            System.out.println("Your answer is " + input20);

            if (correctAnswer20.equals(input20.toLowerCase())) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat20 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer20);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question21 = "21.) Which SQL keyword is used to retrieve data from a table?";
        String choice21One = "INSERT";
        String choice21Two = "SELECT";
        String choice21Three = "UPDATE";
        String choice21Four = "DROP";

        String correctAnswer21 = choice21Two;

        boolean isOnRepeat21 = true;
        while (isOnRepeat21) {
            System.out.println(question21);
            System.out.println("Choose one of the following: ");
            System.out.println(choice21One);
            System.out.println(choice21Two);
            System.out.println(choice21Three);
            System.out.println(choice21Four);

            Scanner scanner = new Scanner(System.in);
            String input21 = scanner.next();
            System.out.println("Your answer is " + input21);

            if (correctAnswer21.equals(input21)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat21 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer21);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question22 = "22.) Which SQL keyword is used to remove duplicates in the result?";
        String choice22One = "UNIQUE";
        String choice22Two = "DISTINCT";
        String choice22Three = "GROUP";
        String choice22Four = "PRIMARY";

        String correctAnswer22 = choice22Two;

        boolean isOnRepeat22 = true;
        while (isOnRepeat22) {
            System.out.println(question22);
            System.out.println("Choose one of the following: ");
            System.out.println(choice22One);
            System.out.println(choice22Two);
            System.out.println(choice22Three);
            System.out.println(choice22Four);

            Scanner scanner = new Scanner(System.in);
            String input22 = scanner.next();
            System.out.println("Your answer is " + input22);

            if (correctAnswer22.equals(input22)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat22 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer22);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question23 = "23.) Which SQL command permanently removes a table?";
        String choice23One = "DELETE";
        String choice23Two = "TRUNCATE";
        String choice23Three = "DROP";
        String choice23Four = "REMOVE";

        String correctAnswer23 = choice23Three;

        boolean isOnRepeat23 = true;
        while (isOnRepeat23) {
            System.out.println(question23);
            System.out.println("Choose one of the following: ");
            System.out.println(choice23One);
            System.out.println(choice23Two);
            System.out.println(choice23Three);
            System.out.println(choice23Four);

            Scanner scanner = new Scanner(System.in);
            String input23 = scanner.next();
            System.out.println("Your answer is " + input23);

            if (correctAnswer23.equals(input23)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat23 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer23);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question24 = "24.) Which SQL command adds a new row to a table?";
        String choice24One = "ADD";
        String choice24Two = "INSERT";
        String choice24Three = "APPEND";
        String choice24Four = "PUSH";

        String correctAnswer24 = choice24Two;

        boolean isOnRepeat24 = true;
        while (isOnRepeat24) {
            System.out.println(question24);
            System.out.println("Choose one of the following: ");
            System.out.println(choice24One);
            System.out.println(choice24Two);
            System.out.println(choice24Three);
            System.out.println(choice24Four);

            Scanner scanner = new Scanner(System.in);
            String input24 = scanner.next();
            System.out.println("Your answer is " + input24);

            if (correctAnswer24.equals(input24)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat24 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer24);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question25 = "25.) Which SQL keyword is used to sort the results?";
        String choice25One = "ORDERBY";
        String choice25Two = "SORT";
        String choice25Three = "GROUP";
        String choice25Four = "ARRANGE";

        String correctAnswer25 = choice25One;

        boolean isOnRepeat25 = true;
        while (isOnRepeat25) {
            System.out.println(question25);
            System.out.println("Choose one of the following: ");
            System.out.println(choice25One);
            System.out.println(choice25Two);
            System.out.println(choice25Three);
            System.out.println(choice25Four);

            Scanner scanner = new Scanner(System.in);
            String input25 = scanner.next();
            System.out.println("Your answer is " + input25);

            if (correctAnswer25.equals(input25)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat25 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer25);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question26 = "26.) Which model is also known as the linear-sequential model?";
        String choice26One = "Spiral";
        String choice26Two = "Waterfall";
        String choice26Three = "V-Model";
        String choice26Four = "Agile";

        String correctAnswer26 = choice26Two;

        boolean isOnRepeat26 = true;
        while (isOnRepeat26) {
            System.out.println(question26);
            System.out.println("Choose one of the following: ");
            System.out.println(choice26One);
            System.out.println(choice26Two);
            System.out.println(choice26Three);
            System.out.println(choice26Four);

            Scanner scanner = new Scanner(System.in);
            String input26 = scanner.next();
            System.out.println("Your answer is " + input26);

            if (correctAnswer26.equals(input26)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat26 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer26);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question27 = "27.) Which diagram shows the static structure of classes?";
        String choice27One = "Class";
        String choice27Two = "Sequence";
        String choice27Three = "UseCase";
        String choice27Four = "Activity";

        String correctAnswer27 = choice27One;

        boolean isOnRepeat27 = true;
        while (isOnRepeat27) {
            System.out.println(question27);
            System.out.println("Choose one of the following: ");
            System.out.println(choice27One);
            System.out.println(choice27Two);
            System.out.println(choice27Three);
            System.out.println(choice27Four);

            Scanner scanner = new Scanner(System.in);
            String input27 = scanner.next();
            System.out.println("Your answer is " + input27);

            if (correctAnswer27.equals(input27)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat27 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer27);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question28 = "28.) Which process involves managing code changes over time?";
        String choice28One = "Version";
        String choice28Two = "Deployment";
        String choice28Three = "Testing";
        String choice28Four = "Integration";

        String correctAnswer28 = choice28One;

        boolean isOnRepeat28 = true;
        while (isOnRepeat28) {
            System.out.println(question28);
            System.out.println("Choose one of the following: ");
            System.out.println(choice28One);
            System.out.println(choice28Two);
            System.out.println(choice28Three);
            System.out.println(choice28Four);

            Scanner scanner = new Scanner(System.in);
            String input28 = scanner.next();
            System.out.println("Your answer is " + input28);

            if (correctAnswer28.equals(input28)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat28 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer28);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question29 = "29.) Which iterative development methodology uses sprints?";
        String choice29One = "Agile";
        String choice29Two = "Waterfall";
        String choice29Three = "Spiral";
        String choice29Four = "Prototype";

        String correctAnswer29 = choice29One;

        boolean isOnRepeat29 = true;
        while (isOnRepeat29) {
            System.out.println(question29);
            System.out.println("Choose one of the following: ");
            System.out.println(choice29One);
            System.out.println(choice29Two);
            System.out.println(choice29Three);
            System.out.println(choice29Four);

            Scanner scanner = new Scanner(System.in);
            String input29 = scanner.next();
            System.out.println("Your answer is " + input29);

            if (correctAnswer29.equals(input29)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat29 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer29);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }

        String question30 = "30.) Which testing type checks individual components or modules?";
        String choice30One = "Unit";
        String choice30Two = "System";
        String choice30Three = "Regression";
        String choice30Four = "Integration";

        String correctAnswer30 = choice30One;

        boolean isOnRepeat30 = true;
        while (isOnRepeat30) {
            System.out.println(question30);
            System.out.println("Choose one of the following: ");
            System.out.println(choice30One);
            System.out.println(choice30Two);
            System.out.println(choice30Three);
            System.out.println(choice30Four);

            Scanner scanner = new Scanner(System.in);
            String input30 = scanner.next();
            System.out.println("Your answer is " + input30);

            if (correctAnswer30.equals(input30)) {
                System.out.println("Congrats! That's the correct answer.");
                System.out.println();
                isOnRepeat30 = false;
            } else {
                System.out.println("You are incorrect. The correct answer is " + correctAnswer30);
                System.out.println("Try again to get correct answer.");
                System.out.println();
            }
        }
        System.out.println("Thank You!!!");

        System.out.println("Press Enter to exit...");
        new java.util.Scanner(System.in).nextLine();
    }
}