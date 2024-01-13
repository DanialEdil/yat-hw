public class Loop {

    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
////        String s = "";
////        for (int i = 0; i < 5; i++) {
////            System.out.println(s);
////            s += "*";
////        }
//
//        for(int i = 1; i <= 5; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int i = 0; i < 5; i++) {
//            System.out.print("*");
//            for (int j = 0; j < 5; j++) {
//                if (i == 0 || i == 4){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("*");
//            System.out.println();
//        }


//        char alphabet = 'A';
//        int count = 0;
//        while (alphabet != 'P') {
//            for (int i = 6 - count; i >= 0; i--) {
//                System.out.print(" ");
//            }
//            for(int i = 0; i < count; i++){
//                System.out.print(" " + alphabet);
//                alphabet++;
//            }
//            count++;
//            System.out.println();
//        }


        char alphabet;
        int total = 9;
        for (int i = 0; i < 6; i++) {
            alphabet = 'A';
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < total; j++) {
                System.out.print(alphabet);
                alphabet++;
            }
            total -= 2;
            System.out.println();
        }

//        int showDigit = 1;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(showDigit + " ");
//                showDigit++;
//            }
//            System.out.println();
//        }
    }
}
