public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        for(int i = 0; i < amount; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        for(int i = 0; i < amount; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int j = 1;
        for(int i = size; i > 0; i--){
            printWhitespaces(i-1);
            printStars(j);
            j++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int j = 1;
        for(int i = height; i > 0; i--){
            printWhitespaces(i-1);
            printStars(j);
            j+=2;
        }
        for(int i = 0; i < 2; i++){
            printWhitespaces(height-2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
