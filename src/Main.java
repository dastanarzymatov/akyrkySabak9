import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int a = 300;
        int b = 0;
        for (int i = 0; i < 300; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                b += i;
                System.out.print(i + " ");
            }

        }
        System.out.println("\njalpy joop : "+b);


        //String a= "Dastan Arzymatov";
        //String b= "Dastan Arzymatov";
//       // System.out.println(a.charAt(2));
//        System.out.println(a.substring(1,16));
        // System.out.println(a.contains(b));
//        System.out.println(a.toUpperCase());
//        System.out.println(a.toLowerCase());
//        System.out.println(a.trim());
        //System.out.println(a.equalsIgnoreCase(b));
//        System.out.println(a.replace(b,a));
    }

//    public static void main(String[] args) {
//        nurdin(243, 34, 34, 34, 343, 43, 3434, 343, 343, 343, 98);
//
//
//    }
//    public static void nurdin(int... san) {
//        System.out.println(san.length);
//        System.out.println(san[5]);
//        int s=0;
//
//        for (int a : san) {
//            System.out.print(a + " , ");
//            s+=a;
//
//
//
//        } System.out.println("\njalpy summasy : "+s);
//    }
//public static void main(String[] args) {
//    attar("al","bul","tigil","teetigi");
//
//}
//
//    public static void attar(String...name) {
//        System.out.println("bular "+name.length+" soz");
//        for (String a:name){
//            System.out.println("i love you "+a);
//
//        }
//
//    }
}