import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        MyDoubleLinkedList list = new MyDoubleLinkedList();

        while (true) {
            System.out.println("\n-------MENU-------");
            System.out.println("1. Přidej song na konec seznamu");
            System.out.println("2. Vypiš názvy všech písní v tvém playlistu");
            System.out.println("3. Přidej song na začátek playlistu");
            System.out.println("4. Přehraj první song playlistu - vypiš název a stopáž");
            System.out.println("5. Přehraj píseň na určité pozici - vypiš název a stopáž");
            System.out.println("6. Přepni a přehraj na další song - vypiš název a stopáž");
            System.out.println("7. Přepni a přehraj na předchozí song - vypiš název a stopáž");
            System.out.println("8. Odeber první song");
            System.out.println("9. Odeber píseň z určité pozice");
            System.out.println("10. Konec");
            System.out.print("Vase volba: ");

            int vyber = sc.nextInt();
            sc.nextLine();

            switch (vyber) {
                case 1:
                    System.out.println("-----Přidej song na konec seznamu-----");
                    System.out.println("Nazev pisnicky:");
                    String nazev = sc.nextLine();
                    System.out.println("Jmeno interpreta:");
                    String interpret = sc.nextLine();
                    System.out.println("Delka pisnicky v sekundach:");
                    int delkaS = sc.nextInt();
                    sc.nextLine();
                    list.add(new Song(nazev, interpret, delkaS));
                    break;
                case 2:
                    System.out.println("-----Vypiš názvy všech písní v tvém playlistu-----");
                    list.printAll();
                    break;
                case 3:
                    System.out.println("-----Přidej song na začátek playlistu-----");
                    System.out.println("Nazev pisnicky:");
                    String nazev1 = sc.nextLine();
                    System.out.println("Jmeno interpreta:");
                    String interpret1 = sc.nextLine();
                    System.out.println("Delka pisnicky v sekundach:");
                    int delkaS1 = sc.nextInt();
                    sc.nextLine();
                    list.add(new Song(nazev1, interpret1, delkaS1));
                    break;
                case 4:
                    System.out.println("-----Přehraj první song playlistu - vypiš název a stopáž-----");
                    list.removeFirst();
                    break;
                case 5:
                    System.out.println("-----Přehraj píseň na určité pozici - vypiš název a stopáž-----");
                    System.out.println("Index:");
                    int i = sc.nextInt();
                    sc.nextLine();
                    list.removeOnIndex(i);
                    break;
                case 6:
                    System.out.println("-----Přepni a přehraj na další song - vypiš název a stopáž-----");
                    System.out.println("Nazev ukolu:");
                    String indexText = sc.nextLine();
                    System.out.println("Priorita:");
                    int indexPriorita = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Index:");
                    int index = sc.nextInt();
                    sc.nextLine();
                    list.addToIndex(new Ukol(indexText,indexPriorita),index);
                    break;
                case 7:
                    System.out.println("-----Přepni a přehraj na předchozí song - vypiš název a stopáž-----");
                    System.out.println("Index:");
                    int i7 = sc.nextInt();
                    sc.nextLine();
                    list.playBeforIndex(i7);
                    break;
                case 8:
                    System.out.println("-----Odeber první song-----");
                    list.removeFirst();
                    break;
                case 9:
                    System.out.println("-----Odeber píseň z určité pozice-----");
                    System.out.println("Index:");
                    int i9 = sc.nextInt();
                    sc.nextLine();
                    list.removeOnIndex(i9);
                    break;
                default:
                    break;
            }
        }
    }
}