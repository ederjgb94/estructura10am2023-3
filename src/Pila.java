import java.util.Arrays;

public class Pila {
    int arr[];
    int sacar,meter;

    Pila(){
        arr = new int[10000];
        sacar = -1;
        meter = 0;
    }

    void push(int num){
        arr[meter] = num;
        sacar = meter;
        meter++;

    }

    int pop(){
        int aux = arr[sacar];
        sacar--;
        meter--;
        return aux;
    }

    //search
    //elementAt

    String mostrarTodos(){
        return Arrays.toString(arr);
    }

}
