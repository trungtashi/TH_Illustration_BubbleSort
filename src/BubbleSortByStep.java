import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = scanner.nextInt();
        int list[] = new int[size];
        System.out.println("Enter " + list.length + " values: ");
        for(int i = 0; i < list.length; i++){
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i] + " ");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int list[]){
        boolean check;
        for(int i = 0; i < list.length; i++){
            check = false;
            for (int j = 0; j < list.length - 1 - i; j++){
                if(list[j] > list[j + 1]){
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    check = true;
                }
            }
            if(check == false){
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            else {
                System.out.println("List after the " + i + " sort:");
                for (int j = 0; j < list.length; j++) {
                    System.out.print(list[j] + " ");
                }
                System.out.println();
            }
        }

    }
}
