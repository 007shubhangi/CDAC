interface  Add{
    float sum(float num1 ,int num2);
}
public class Lambda2 {
    public static void main(String[] args) {
        Add d1=(float n1,int n2)->n1+n2; //OK
        float result=d1.sum(125.5f, 15);
        System.out.println(result);
       
        
        //Add d1=(float n1,int n2)->return n1+n2; //OK
        // float result=d1.sum(125.5f, 15);
        // System.out.println(result);

        // Add d1=( n1,n2)-> {return n1+n2;};
        // float result=d1.sum(102.5f, 154);
        // System.out.println(result);
    }
}
