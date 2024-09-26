public class ArrayDequeue{
    public static void main(String args[]){
       java.util.ArrayDeque<String> str=new java.util.ArrayDeque<>();
        //statck class extends from vector class 
        //vector is synchronization
        //lock unlock process take much time so vecror is time consuming
        //using ArrayDeque there is no thead safe so it is fast
        //use arrayDeque which have methods of both statck and dequeue

        str.push("shubhangi");
        str.push("harshada");
        str.push("swara");

        System.out.println(str);
        System.out.println(str.pop());//swara

        System.out.println(str.peek());//harshada
        System.out.println(str);

        str.offer("prathmesh");
        str.offerFirst("pratibha");
        System.out.println(str);//[pratibha, harshada, shubhangi, prathmesh]

        System.out.println(str.poll());//

    }
}