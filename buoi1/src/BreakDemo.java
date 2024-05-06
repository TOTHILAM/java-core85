public class BreakDemo {
    public static void main(String[] args) {
        // in ra 1 den 1000
        for (int i = 1; i < 1000; i++){
            if (i ==5){
                break;} // thoát vòng lặp
            System.out.println(i);
        }
        System.out.println("xong");
    }
}
