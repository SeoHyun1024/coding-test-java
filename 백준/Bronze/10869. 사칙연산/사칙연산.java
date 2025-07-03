import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        Operation operation = new Operation(a,b);

        int[] array = new int[5];
        array[0] = operation.add();
        array[1] = operation.substract();
        array[2] = operation.multiple();
        array[3] = operation.divide();
        array[4] = operation.mod();

        for(int resujlt : array){
            System.out.println(resujlt);
        }
    }
    static class Operation {
        int a, b;

        Operation(int a, int b){
            this.a = a;
            this.b = b;
        }

        int add(){
            return a + b;
        }
        int substract(){
            return a - b;
        }
        int multiple(){
            return a * b;
        }
        int divide(){
            return a / b;
        }

        int mod(){
            return a % b;
        }
    }
}

