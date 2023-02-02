import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ksiaki();
wybor();

    }


    private static void wybor(){
        System.out.println("Wybierz co chcesz zrobic");
        System.out.println("1. Pokaz liste ksiazek");
        System.out.println("2. Dodaj nowa ksiazke");
        System.out.println("3. Szukaj po autorze");
        System.out.println("4. Szukaj po tytule");
        System.out.println("5. Usun ksiazke");
        System.out.println("6. Wyjdz");

        Scanner scanner = new Scanner(System.in);
        int wybor1 = scanner.nextInt();

        switch (wybor1) {
            case 1:
                list_of_books();
                break;
            case 2:
                listy();
                list_of_books();
                break;
            case 3:
                szukajAutor();
                break;
            case 4:
                szukajTytul();
                break;
            case 5:
                usun();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Niepoprawny wybor");
                break;
        }
    }



    public static void list_of_books(){
        for (Ksiazka k : ksiazki)
        {
            System.out.println(k.toString());
        }
    }
    static ArrayList<Ksiazka> ksiazki = new ArrayList<>();
    public static void ksiaki()
    {

        ksiazki.add(new Ksiazka("Bogaty ojciec biedny ojciec", new Autor("Robert kijosaki")));
        ksiazki.add(new Ksiazka("Lalka", new Autor("Lalka")));
        ksiazki.add(new Ksiazka("Java", new Autor("autor java")));
        ksiazki.add(new Ksiazka("Honda", new Autor("szybsza niz wyglada")));
    }
    static Scanner scanner = new Scanner(System.in);
    private static void listy(){



        System.out.println("Tytul: ");
        String tytul = Ksiazka.strink();
        System.out.println("Auto: ");
        String autor = Ksiazka.strink();

        ksiazki.add(new Ksiazka(tytul, new Autor(autor)));

        //System.out.println(ksiazki.toString());
    }


    private static void szukajAutor(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Autor: ");
        String autor = scanner.next();

        for (Ksiazka ksiazka : ksiazki) {
            if (ksiazka.getAutor().getNazwa().equals(autor)) {
                System.out.println(ksiazka.toString());
            }
        }
    }

    private static void szukajTytul(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tytul: ");
        String tytul = scanner.next();

        for (Ksiazka ksiazka : ksiazki) {
            if (ksiazka.getTytul().equals(tytul)) {
                System.out.println(ksiazka.toString());
            }
        }
    }

    private static void usun(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tytul: ");
        String tytul = scanner.next();

        for (Ksiazka ksiazka : ksiazki) {
            if (ksiazka.getTytul().equals(tytul)) {
                ksiazki.remove(ksiazka);
                System.out.println(ksiazki.toString());
            }
        }
    }
}