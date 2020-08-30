import javafx.scene.control.skin.CellSkinBase;
import javafx.stage.Screen;

import java.util.Scanner;

public class D_v2 {
    public static int count_n;
    public static int n;

    public static void task_(int posit, int a, int b){
      if (posit != 1){
         int new_c = a+b;
         if (new_c == n) count_n++;
         if (new_c < n) {
              int new_posit = posit - 1;
              task_(new_posit, a, new_c);
              task_(new_posit, new_c, b);
          }
      } else
      {
          int new_c = a+b;
          if (new_c == n) count_n++;
      }

    }

    public static void main(String[] args) {
      System.out.println("task_d_v2");
        Scanner input_ = new Scanner(System.in);
        count_n = 1;
        n = input_.nextInt();
        input_.close();
        long startTime = System.currentTimeMillis();

        if (n>2) {
        for (int i_ = 1; i_<n-2; i_++ ) task_(i_, n-i_, n-i_-1);
        System.out.println(count_n*2); }
        else
        {
            if (n==1)System.out.println(2);
            if (n==2)System.out.println(1);
        }

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("time " + timeSpent+" mc");


//            for (int i_ = 1; i_<n-2; i_++ ){
//                int aa = n-i_;
//                int bb = n-i_ -1;
//                System.out.println(i_ + " "+ (aa)+" "+ bb);
//            }

        //n=1 -> result 2 11
        //n=2 -> result 1 121
             //n=3 -> result 2 132_31





    }
}
