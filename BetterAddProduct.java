package warehouse;

/*
 * Use this class to test the betterAddProduct method.
 */ 
public class BetterAddProduct {
    public static void main(String[] args) {
        //StdIn.setFile(args[0]);
       // StdOut.setFile(args[1]);
       StdIn.setFile("betteraddproduct.in");
       StdOut.setFile("betteraddproduct.out");

   Warehouse t = new Warehouse();
   int number = 0;
   int size = Integer.parseInt(StdIn.readLine());
   
   while(number<size){
       String[] info = StdIn.readLine().split(" ");
       t.betterAddProduct(Integer.parseInt(info[1]), info[2], Integer.parseInt(info[3]), Integer.parseInt(info[0]), Integer.parseInt(info[4]));
       number++;
   }
   StdOut.println(t);
        
        // Use this file to test betterAddProduct
    }
}
