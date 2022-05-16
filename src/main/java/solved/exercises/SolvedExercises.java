package solved.exercises;

import javax.swing.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class SolvedExercises {
    public void ExerciseOneAndTwo() {
        var valueOne = Integer.parseInt(JOptionPane.showInputDialog("Enter the first value: "));
        var valueTwo = Integer.parseInt(JOptionPane.showInputDialog("Enter the second value: "));

        if (valueOne > valueTwo) {
            JOptionPane.showMessageDialog(null,
                    "The first value (" + valueOne + ") is greater than the second value (" + valueTwo + ").");
        } else if (valueOne < valueTwo) {
            JOptionPane.showMessageDialog(null,
                    "The first value (" + valueOne + ") is less than the second value (" + valueTwo + ").");
        } else {
            JOptionPane.showMessageDialog(null, "The two values are the same.");
        }
    }

    public void ExerciseThree() {
        var radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the circle: "));
        var area = Math.PI * Math.pow(radius, 2);
        area = (double) Math.round(area * 100) / 100;

        JOptionPane.showMessageDialog(null, "The area of the circle is: " + area);
    }

    public void ExerciseFour() {
        final double VAT = 0.21;
        var price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the product: "));
        var priceWithVAT = price + (price * VAT);

        JOptionPane.showMessageDialog(null, "The price with VAT is: " + priceWithVAT);
    }

    public void ExerciseFive() {
        var num = 1;
        var pairs = new int[50];
        var counterP = 0;
        var odd = new int[50];
        var counterO = 0;

        while (num <= 100) {
            if (num % 2 == 0) {
                pairs[counterP] = num;
                counterP++;
            } else {
                odd[counterO] = num;
                counterO++;
            }
            num++;
        }

        System.out.println("Numbers pairs: ");
        for (int i = 0; i < pairs.length; i++) {
            System.out.println(pairs[i]);
        }

        System.out.println("Odd numbers: ");
        for (int i = 0; i < odd.length; i++) {
            System.out.println(odd[i]);
        }
    }

    public void ExerciseSix() {
        var pairs = new int[50];
        var counterP = 0;
        var odd = new int[50];
        var counterO = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                pairs[counterP] = i;
                counterP++;
            } else {
                odd[counterO] = i;
                counterO++;
            }
        }

        System.out.println("Numbers pairs: ");
        for (int i = 0; i < pairs.length; i++) {
            System.out.println(pairs[i]);
        }

        System.out.println("Odd numbers: ");
        for (int i = 0; i < odd.length; i++) {
            System.out.println(odd[i]);
        }
    }

    public void ExerciseSeven() {
        var num = 0;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        } while (num < 0);

        JOptionPane.showMessageDialog(null, "The number is: " + num);
    }

    public void ExerciseEight() {
        var day = JOptionPane.showInputDialog("Enter a day of the week");

        switch (day.toLowerCase()) {
            case "monday":
                JOptionPane.showMessageDialog(null, "It is a work day.");
                break;
            case "tuesday":
                JOptionPane.showMessageDialog(null, "It is a work day.");
                break;
            case "wednesday":
                JOptionPane.showMessageDialog(null, "It is a work day.");
                break;
            case "thursday":
                JOptionPane.showMessageDialog(null, "It is a work day.");
                break;
            case "friday":
                JOptionPane.showMessageDialog(null, "It is a work day.");
                break;
            case "saturday":
                JOptionPane.showMessageDialog(null, "It is not a work day.");
                break;
            case "sunday":
                JOptionPane.showMessageDialog(null, "It is not a work day.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "This day does not exist.");
                break;
        }
    }

    public void ExerciseNine() {
        final String PHRASE = "La sonrisa será la mejor arma contra la tristeza";
        var additionalPhrase = JOptionPane.showInputDialog("Enter a additional phrase: ");
        var newPhrase = PHRASE.replace("a", "e").concat(" " + additionalPhrase);

        JOptionPane.showMessageDialog(null, newPhrase);
    }

    public void ExerciseTen() {
        var phrase = JOptionPane.showInputDialog("Enter a phrase: ");
        JOptionPane.showMessageDialog(null, "The phrase without spaces looks like this:\n " + phrase.replace(" ", ""));
    }

    public void ExerciseEleven() {
        int a = 0, e = 0, I = 0, o = 0, u = 0;
        var phrase = JOptionPane.showInputDialog("Enter a phrase: ");
        char characters[] = phrase.toLowerCase().toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == 'a') {
                a++;
            } else if (characters[i] == 'e') {
                e++;
            } else if (characters[i] == 'i') {
                I++;
            } else if (characters[i] == 'o') {
                o++;
            } else if (characters[i] == 'u') {
                u++;
            }
        }

        JOptionPane.showMessageDialog(null, "The phrase has " + phrase.length() + " characters.\n" +
                "The number of a's is: " + a + "\n" +
                "The number of e's is: " + e + "\n" +
                "The number of i's is: " + I + "\n" +
                "The number of o's is: " + o + "\n" +
                "The number of u's is: " + u);
    }

    public void ExerciseTwelve() {
        var phraseOne = JOptionPane.showInputDialog("Enter the first phrase: ");
        var phraseTwo = JOptionPane.showInputDialog("Enter the second phrase: ");

        if (phraseOne.compareTo(phraseTwo) == 0) {
            JOptionPane.showMessageDialog(null, "The phrases are equal.");
        } else {
            for (int i = 0; i < 2; i++) {
                int a = 0, e = 0, I = 0, o = 0, u = 0, consonants = 0;

                if (i == 0) {
                    char characters[] = phraseOne.toLowerCase().toCharArray();

                    for (int j = 0; j < characters.length; j++) {
                        if (characters[j] == 'a') {
                            a++;
                        } else if (characters[j] == 'e') {
                            e++;
                        } else if (characters[j] == 'i') {
                            I++;
                        } else if (characters[j] == 'o') {
                            o++;
                        } else if (characters[j] == 'u') {
                            u++;
                        } else {
                            consonants++;
                        }
                    }

                    JOptionPane.showMessageDialog(null,
                            "The first phrase has " + phraseOne.length() + " characters.\n" +
                                    "The number of a's is: " + a + "\n" +
                                    "The number of e's is: " + e + "\n" +
                                    "The number of i's is: " + I + "\n" +
                                    "The number of o's is: " + o + "\n" +
                                    "The number of u's is: " + u + "\n" +
                                    "The number of consonants is: " + consonants);
                } else {
                    char characters[] = phraseTwo.toLowerCase().toCharArray();

                    for (int j = 0; j < characters.length; j++) {
                        if (characters[j] == 'a') {
                            a++;
                        } else if (characters[j] == 'e') {
                            e++;
                        } else if (characters[j] == 'i') {
                            I++;
                        } else if (characters[j] == 'o') {
                            o++;
                        } else if (characters[j] == 'u') {
                            u++;
                        } else {
                            consonants++;
                        }
                    }

                    JOptionPane.showMessageDialog(null,
                            "The second phrase has " + phraseTwo.length() + " characters.\n" +
                                    "The number of a's is: " + a + "\n" +
                                    "The number of e's is: " + e + "\n" +
                                    "The number of i's is: " + I + "\n" +
                                    "The number of o's is: " + o + "\n" +
                                    "The number of u's is: " + u + "\n" +
                                    "The number of consonants is: " + consonants);
                }
            }
        }
    }

    public void ExerciseThirteen() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        JOptionPane.showMessageDialog(null, "The current date and time is: " + formatter.format(LocalDateTime.now()));
    }

    public void ExerciseFourteen() {
        try {
            var number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

            if (number > 1000 || number < 1) {
                JOptionPane.showMessageDialog(null, "The number must be between the range of 1 to 1000.");
            } else {
                int i;
                for (i = number; i <= 1000; i += 2) {
                    System.out.println(i);
                }

                if (i % 2 != 0) {
                    System.out.println("1000");
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "You must enter a number\n" + "The cause of the error is:\n" + e.getMessage());
        }
    }
}
