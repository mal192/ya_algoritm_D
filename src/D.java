import java.util.Scanner;

public class D {
    static void task_D (long index_, int count_, long length_, long data[]){
        long new_size = length_*2-1;
        long new_data[] = new long [(int)new_size];

        for (int i_ = 1; i_<= length_; i_++){
           int new_index = i_*2-1-1;
            if (i_==1) new_data[0] = data[0]; else {
                new_data[new_index] = data[i_ - 1];
                new_data[new_index - 1] = new_data[new_index - 2] + new_data[new_index];
            }
        }
        index_++;
        if (index_ < count_) task_D(index_, count_, new_size,new_data);
                else {
                    int result = 0;
                    for (int i_ = 0; i_ < new_data.length-1; i_++)
                        if (new_data[i_]==count_+1) result++;
                    System.out.println(result*2);
            for (int i_ = 0; i_ < new_size; i_++) System.out.print(new_data[i_]+" ");
                 }
    }

    public static void main(String[] args) {
   long data[] = {1,2};
        Scanner input_ = new Scanner(System.in);
        int n_ = input_.nextInt();
        long startTime = System.currentTimeMillis();
   //   for (int K = 3; K<10; K++)
           task_D(1,n_-1,2,data);
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("time " + timeSpent+" mc");


    }
}
