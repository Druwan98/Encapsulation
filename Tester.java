package exercises.Encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        House house1 = new House();

        System.out.println("Number of the floor: ");



        int scannerFloorNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Address: ");



        String scannerAddress = scanner.nextLine();

        System.out.println("Resident Name: ");



        String residentsName = scanner.nextLine();
        String[] scannerArrayResidentsName = residentsName.split(",");

        house1.setFloorsNumber(scannerFloorNumber);
        house1.setAddress(scannerAddress);
        house1.setResidentsName(scannerArrayResidentsName);

        scanner.close();

        System.out.println("House details");
        System.out.println("Floor Number:" + house1.getFloorsNumber());
        System.out.println("Address:" + house1.getAddress());
        System.out.println("Resident Name:" + Arrays.toString(house1.getResidentsName()));

    }
}
