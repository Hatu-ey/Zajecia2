/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia2;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Acer
 */
public class Zajecia2 {

    // Zadania sa na dole w metodach
    public static void bubblesort(int[] t)
    {
        for(int i = t.length-1;i>0;i--){
            for(int j = 0; j < i;j++){
            if(t[j] > t[j+1])
            {
                int tmp = t[j];
                t[j] = t[j+1];
                t[j+1] = tmp;
            }
            }
        }
    }
    public static void Wyswietl(int[][] t){
    for(int i = 0; i < t.length;i++)
    {
        for(int j = 0; j<t[i].length;j++)
        {
            System.out.println(t[i][j]+" ");
        }
        System.out.println("");
    }
}
    public static int SumaTablic(int[] t, int a){
        int suma = 0;
        for(int el: t){
        suma+=el;
        }
        return suma;
        // nie ma modyfikacji, nie ma referencji ref ani przez wartość out
    }
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int[] t = {1, 5, 8};
        int[] tab = new int[10];

        // zmienna nie zadeklarowana ma wartość undefined
        // w pustej tablicy są wartości 0
        // dwuwymiarowa też ma zera
        int[][] t2 = new int[10][20];

        for (int i = 0; i < t2.length; i++) {
            for (int j = 0; j < t2[i].length; j++) {
                System.out.print(t2[i][j] + " ");
                System.out.println("");
            }
        }

        String s = "Ala ma kota";
        String s2 = "O" + s.substring(1);
        System.out.print(s2);

        for (int k = 0; k < s2.length(); k++) {
            System.out.println((char) (s2.charAt(k) - 32)); */
        
        /* 
        Wykład 
        tablice deklarujemy int[] tablica = {1,2};
        inta a = tablica[0];
        for(int i = 0; i<tablica.length;i++){
        System.out.print(tablica[i]+" ");
        
        pętla foreach
        for(int el : tablica{
        System.out.print(el+" ");
        obiekty są przekazywane przez referencję tzn. 
        public static int SumaTablic(int[] t, int a){
        int suma = 0;
        for(int el: t){
        suma+=el;
        }
        a = 100;
        t[0] = 99
        return suma;
        // nie ma modyfikacji, nie ma referencji ref ani przez wartość out
        // wynik suma 79, t[0] = 99 t = 100; 
        //robisz notatki np. podkreślenie w tekście w notatkach znajmoego, zmienia się notatka znajomego - referencja; 
        //robisz ksero a potem  robisz podkreślenia - ona ma orginał, ty masz ksero poprawione - out;
    }
        tablica dwuwymiarowa - jest tablicą z adresami innych tablic
        int[][] tab2 = new int[][];
        postrzępiona
        int[][] tab3= new int[3][];
        
        for(int i = 0; i<tab2.length; i++;{
            tab2[i] = new int[i+1];
        }
        /// wynik to coś ala schodki z 0
        int[][] tab2b = new int{{1,3,6,1}.{4,5,1,9},{3,3,3,3},{7,6,5,4};
        tablica = tab2b[0];
        tab2b[0] = tab2b[tab2b[tab2b.lenght-1];
        tab2b[tab2b[tab2b.lenght-1] = tablica;
        wyswietl(tabb2);
        int[] tt = tablica; - ta tablica ma andres tablicy, nie ma starej wartości! Array.copy - jedny sposób na zachowanie wartości; 
        }
        
        int suma = 0;
        String s = "Ala ma 2 koty, 1 psa i 13 koni";
        Character
        for(int i = 0; i<s.length;i++){
        if(s.charAt(i) >='0' && s.charAt(i) <= '9')
            suma+= s.charAt(i) - '0';
        }
        
        */
       
        
        
        
        
       
       
        //TaskOne();
        
        /*
        String[][] textTwo = {{"Ania ma kota oraz Ania ma konia ale Ania nie ma raka Niestety "
                + "nie ma psa wiec nie kupi Ania nowego leku czy cos tam jakis tekst z Ania nie chce mi sie wymyslic jakiegos tekstu z Ania bo to","Ania"}};
        TaskTwo(textTwo); 
        */
        
        
        String[] tab3 = {" ","$$","_","*"};
        String[] rtab3 = TaskThree("Ala ma_K$$_ta*i*Ala_Nie ma Psa asdasd_ dsad$$",tab3);
        for (String el : rtab3)
        {
            System.out.println(el);
        } 
        
         
        //TaskFour("a12345a6789a",'a');
        
        //TaskFive("Aleksandra Joanna Agnieszka");
        
        //TaskSix(5327,0);
        
        //System.out.println(TaskSeven("a   b       a c ","cba"));
        
        /*
        TaskEight("Rzeczpospolita Polska");
        TaskEight("Wydział Informatyki i Nauki o Materiałach");
        TaskEight("Polski Zwiazek Piłki Noznej");
        */
        
       
    }
    
    public static void TaskOne()
    {
         /*
        1. Napisać program, który tworzy dwuwymiarową tablicę liczb całkowitych o losowej wielkości wymiaru (wylosowanej
        z zakresu [50, 100] i podzielnej przez 4), gdzie liczba wierszy jest równa liczbie kolumn. Następnie tablica zostaje
        wypełniona liczbami losowymi, z wyjątkiem elementów znajdujących się na przekątnych. Liczby mają być losowane z
        zakresu [a, b), gdzie liczby a i b podawane są przez użytkownika. Wartości na przekątnych mają być wypełnione w
        losowym układzie w 75% przypadków cyfrą 1, a w pozostałych 25% przypadków wartością -1.
        Program powinien wyświetlić na ekran liczbę komórek, których wartość jest mniejsza od iloczynu indeksu wiesza i
        kolumny tej komórki. */
        
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj max przedziału");
        int maxRandomNumber = in.nextInt();
        System.out.println("Podaj min przedziału");
        int minRandomNumber = in.nextInt();
        
        int sizeOfArray;
        do{
        sizeOfArray = rnd.nextInt(50)+50;
        } while(sizeOfArray %4 != 0);
        
        int x;
        int countBiggerNumber = 0;
        int[][] tabTaskOne = new int[sizeOfArray][sizeOfArray];
        
         for (int i = 0; i < tabTaskOne.length; i++) {
            for (int j = 0; j < tabTaskOne[i].length; j++) {
                x = rnd.nextInt(4);
                tabTaskOne[i][j] = rnd.nextInt(maxRandomNumber - minRandomNumber)+minRandomNumber;
                
                if (x > 1 && i == j || x > 1 && i + j + 1 == tabTaskOne.length)
                {
                     tabTaskOne[i][j] = 1;
                } else if(x <= 1 && i == j || x <= 1 && i + j + 1 == tabTaskOne.length)
                {
                     tabTaskOne[i][j] = -1;
                }
                
                if (i * j < tabTaskOne[i][j])
                {
                    countBiggerNumber++;
                }
            }
        }

        
         System.out.println("lość komórek o wartościach mniejszych" + countBiggerNumber);
    }
    // zadanie 2
    public static void TaskTwo(String[][] text){
        /*2. Napisać funkcję, która w dwuwymiarowej tablicy łańcuchów znaków (podanej przez parametr) znajduje liczbę
        wystąpień frazy podanej jako drugi parametr. Jeśli w danej komórce fraza występuje kilkukrotnie, to należy policzyć
        każde jej wystąpienie.
        Funkcja zwraca liczbę wystąpień frazy. Natomiast dodatkowo wyświetlona zostaje średnią długość łańcuchów
        znajdujących się w tabeli oraz łańcuch stworzony z konkatenacji trzech pierwszych* znaków łańcuchów leżących w
        kolumnach o indeksach podzielnych przez 5 i niepodzielnych przez liczbę przekazaną przez trzeci parametr funkcji.
        * Jeśli łańcuch jest krótszy od 3 znaków, to należy zastosować wszystkie jego znaki.*/
        int sumTaskTwo = 0;
        int avgSumTaskTwo = 0;
     String[] textSplited = text[0][0].split(" ");
        for( String el : textSplited) // foreach
        {
            System.out.println(el);
           if (el.equals(text[0][1]))
           {
               sumTaskTwo++;
           }
           avgSumTaskTwo += el.length(); 
           
           
        }
        
        int noDivideNumber = 2;
        String newText = "";
        String substringa;
        for (int i = 0; i < textSplited.length;i++)
        {
            if( i % 5 == 0  && i % noDivideNumber != 0)
            {
                if (textSplited[i].length() >= 3)
                {
                    substringa = textSplited[i].substring(3);
                    newText += substringa;                   
                } else 
                {
                    newText += textSplited[i] + " " ;
                }
                
            }
        }
        float avgTaskTwo = (float)avgSumTaskTwo / textSplited.length;
        
        System.out.println("Ilosc wystapien Ania " + sumTaskTwo);
        System.out.println("Suma liter " + (avgSumTaskTwo));
        System.out.println("Ile tablic " + textSplited.length);
        System.out.printf("Srednia %.2f \n", avgTaskTwo);
        System.out.println(newText);
        }
    // zadanie 3
   public static String[] TaskThree(String str, String[] tStr)
   { 
        /*3. Napisać funkcję split2, która działa podobnie, jak funkcja split (pozwalającej na podzielenie łańcucha znaków na pod
            łańcuchy (względem podanego znaku / ciągu znaków) i zwrócenie ich w postaci tablicy łańcuchów znaków), ale tym
            razem podział łańcucha dokonywany może być względem wielu znaków / ciągów znaków (przekazanych w tablicy
            znaków). Przykładowa deklaracja funkcji:
            String[] split2(String str, String[] tStr);*/
       for (int i = 0; i < tStr.length; i++ )
       {                
           str = str.replace(tStr[i], tStr[0]);
       }
       System.out.println(tStr[0]);
       int x = str.length() - str.replace(tStr[0], "").length() + 1;
     
        int y = 0;
        String[] arrayFromText = new String[x];
        for ( int j = 0; j< arrayFromText.length; j++)
        { 
            if (j ==  arrayFromText.length - 1)
            {
                arrayFromText[j] = str;
            } else
            {
            arrayFromText[j] = (String) str.subSequence(y,str.indexOf(tStr[0]) + 1);
            str = (String) str.replaceFirst(arrayFromText[j], "");
            }
                
        }        
        return arrayFromText;
   }
   // zadanie 4
   public static void TaskFour(String text, char word)
   {
       /*4. Pierwszy / ostatni.
            Zaimplementować funkcję void firstlast(String s, char c), która oblicza liczbę znaków znajdujących
            się pomiędzy pierwszym i ostatnim wystąpieniem znak  c  w ciągu  s. Funkcja musi wydrukować na standardowe
            wyjście obliczoną liczbę znaków oraz tekst znajdujący się pomiędzy wspomnianymi wystąpieniami znaku  c. W
            przypadku, gdy szukany znak nie występuje w podanym ciągu lub występuje tylko raz, funkcja powinna przyjąć
            odległość równą -1.
            Dla następujących wywołań funkcji:
            firstlast(”a12345a6789a”, 'a');
            firstlast(”cccbbccc”, 'b');
            firstlast(”aaaaaa”, 'c');
            na wyjściu powinien zostać wydrukowany tekst:
            Odległo : 10. Tekst '12345a6789' ść
            Odległo :  0. Tekst '' ść
            Odległo : ­1. Tekst '' */
       
       int a = text.indexOf(word);
       int b = text.lastIndexOf(word);
       
       int distance = b - a -1;
       if (b == a || a == -1)
       {
           System.out.printf("Odleglosc: %d", a);
           System.out.println("");
       }
       else 
       {
           String c = text.subSequence(a + 1, b).toString();
           System.out.println("Odleglosc: " + distance + " Tekst w środku:"  + c);
       }
       
   }
   public static void TaskFive(String s)
   {
       /*
       Zaimplementować funkcję  void sortuj(String s), która drukuje na standardowym wyjściu posortowane (w
       kolejności rosnącej) wyrazy zapisane w ciągu znaków s. Wielkość liter nie ma znaczenia, w związku z czym np.
       'a'=='A'. Po wyświetleniu wyrazów należy także wyświetlić średnią długość wszystkich łańcuchów zapisanych w
       podanym ciągu znaków.
       Uwaga: Dla utrudnienia wolno korzystać z funkcji standardowych toUpperCase() oraz to toLowerCase(). 
       Ok
       */
       s = s.toUpperCase();
       String[] textSplitted = s.split("\\s+");
    
        for(int i = textSplitted.length-1; i>0 ;i--){
            for(int j = 0;j<i;j++){
            if(textSplitted[j].compareToIgnoreCase( textSplitted[j+1]) > 0)
            {
                String tmp = textSplitted[j];
                textSplitted[j] = textSplitted[j+1];
                textSplitted[j + 1] = tmp;
            }
            }
        }
        int countLetters = 0;
        for(String el : textSplitted)
        {
            System.out.println(el.toLowerCase());
            countLetters+= el.length();
        }
        System.out.println(countLetters);
    }
   
   public static void TaskSix(int a, int b)
   {
       /*
        Zaimplementować funkcję z dwoma parametrami (liczby całkowita). W funkcji należy wyznaczyć moduł pierwszej
        liczby, a następnie odwróci kolejność cyfr, z których składa wyznaczony moduł. W funkcji powinna zostać zwrócona
        nowo powstała liczba, a dodatkowo poprzez drugi parametr suma pierwotnej i nowej liczby.
        Uwaga: Nie wolno korzystać z funkcji dokonujących konwersji liczby na łańcuch znaków (szeroko rozumiany) i
        łańcuchów znaków na liczby. 5327 
       */
   
       a = Math.abs(a);
       b = a;
       int tmpA;
       int reversedA = 0;
       while (a != 0)
       {
           tmpA = a % 10;
           reversedA = reversedA * 10 + tmpA;
           a = a / 10;
       }
       b += reversedA;
       a = reversedA;
       System.out.println(a);
       System.out.println(b);        
   }
   
   public static boolean TaskSeven(String a, String b)
   {
       
       /*7. Anagram
        Zaimplementować funkcję boolean anagram(String a, String b), która sprawdza, czy wyrażenie a jest
        anagramem wyrażenia b (wyrażeniem utworzonym przez przestawienie liter alfabetu innego wyrażenia). Jeśli funkcja
        rozpozna anagram, to zwraca wartość prawdziwy (true), w przeciwnym wypadku zwraca wartość fałszywy (fasle).
        Uwaga: Różnice w liczbie spacji występujących w ciągach nie mają znaczenia. Wielkość liter nie ma znaczenia, tzn.
        'A'=='a'. Nie wolno używać funkcji standardowych zmieniających wielkości liter, należy więc samodzielnie ujednolicić
        ich wielkości w ciągach
       */
       a = changeText(a);
       b = changeText(b);
       if(a.compareTo(b) == 0)
       {
           return true;
       } else return false;
   }
   
   public static String changeText(String x)
   {
       String tmpX = "";
       for( int i = 0; i < x.length();i++)
       {
           if (x.charAt(i) >= 'A' && x.charAt(i) <= 'Z')
           {
              tmpX += (char)(x.charAt(i) + 32);
           } else if(x.charAt(i) >= 'a' && x.charAt(i) <= 'z')
           {
               tmpX += (x.charAt(i));
           }
       }
       char[] y = tmpX.toCharArray();
       
       
       for(int i = y.length-1; i>0 ;i--)
       {
            for(int j = 0;j<i;j++)
            {
                if(y[j] > y[j+1])
                {
                char tmp = y[j];
                y[j] = y[j+1];
                y[j + 1] = tmp;
                }
            }
           
        }
       String z = "";
       for (char el : y)
       {
           z += el;
       }
       System.out.println(z);
       return z;
   }
   public static void TaskEight(String s)
   {
       /*
       Zaimplementować funkcję void akronim(String s), która drukuje na standardowym wyjściu akronim (wyraz
        sztucznie ułożony z pierwszych liter innych wyrazów). Należy pamiętać aby wyjściowy akronim był ułożony wyłącznie z
        wielkich liter.
        Uwaga: nie wolno korzystać z funkcji standardowej toupper().
        Założenia: Przekazywany łańcuch składa się tylko z poprawnych słów oddzielonych pojedynczą spacją (spacje nie
        występują w żadnych innych miejscach).
       */
       
       String[] sArray = s.split("\\s");
       String acrFromS = "";
       for ( int i = 0; i < sArray.length; i++)
       {
           if (sArray[i].charAt(0) > 'a' && sArray[i].charAt(0) < 'z' )
           {
               acrFromS += (char)(sArray[i].charAt(0) - 32);      
           } else acrFromS += sArray[i].charAt(0);
       }
       
       System.out.println(acrFromS);
   }
}