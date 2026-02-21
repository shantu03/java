import java.util.Arrays;

public class MinHeap {
   private int[] arr = new int[10];
   private int size = 0;

   MinHeap() {
   }

   private void grow() {
      this.arr = Arrays.copyOf(this.arr, this.size * 2);
   }

   public void print() {
      System.out.println(Arrays.toString(this.arr));
   }

   public void add(int var1) {
      if (this.size >= this.arr.length) {
         this.grow();
      }

      this.arr[this.size] = var1;
      this.heapify(this.size);
      ++this.size;
   }

   public void heapify(int var1) {
      if (var1 > 0) {
         if (this.arr[var1] < this.arr[var1 / 2]) {
            int var2 = this.arr[var1];
            this.arr[var1] = this.arr[var1 / 2];
            this.arr[var1 / 2] = var2;
            this.heapify(var1 / 2);
         }

      }
   }
}
