package algorithms;

public class SortAlgorithms {

  public static void main(String[] args) {
    int[] a = new int[100];
    for (int i = 0; i < 100; i++) {
      a[i] = (int) (Math.random() * 100);
    }
    int n = a.length;
    SortAlgorithms i = new SortAlgorithms();
    i.InsertionSort(a, n);
    i.print();
  }

  int[] ar;

  public void InsertionSort(int[] ar, int n) {
    int i, j, k;
    this.ar = ar;
    for(i =1; i < n; i++){
      j = i;
      while(j > 0 && (ar[j] < ar[j-1])){
        k =ar[j];
        ar[j] = ar[j-1];
        ar[j-1] = k;
        j = j-1;
      }
    }
  }

  public void print(){
    for(int i : this.ar){
      System.out.print(i + " ");
    }
  }
  
}