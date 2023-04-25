package Exercice.P04InterfacesAndAbstraction.birthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Birthable> list = new ArrayList<>();
        while (!"End".equals(input)){
            String tokens = input.split(" ")[0];
            String name = input.split(" ")[1];

            switch (tokens){
                case "Citizen":
                    int personAge = Integer.parseInt(input.split(" ")[2]);
                    String personId = input.split(" ")[3];
                    String personBirthDate = input.split(" ")[4];
                    CitizenPartTwo person = new CitizenPartTwo(name,personAge, personId,personBirthDate);
                    list.add(person);
                    break;
                case "Pet":
                    String patBirtDate = input.split(" ")[2];
                    Pet pet = new Pet(name, patBirtDate);
                    list.add(pet);
                    break;
                case "Robot":
                    break;
            }
            input = scanner.nextLine();
        }

        String serachingImput = scanner.nextLine();

        boolean isFound = false;

        for (Birthable birthable : list) {
            String i = birthable.getBirthDate();
            if (i.endsWith(serachingImput)) {
                System.out.println(i);
                isFound=true;
            }
        }

        if(!isFound){
            System.out.println("<no output>");
        }
    }
}
