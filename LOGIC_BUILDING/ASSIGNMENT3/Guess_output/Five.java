public class Five {
public static void main(String[] args) {
int num = 1;
for (int i = 1; i <= 4; i++) {
 if (i % 2 == 0) {
  num += i;
  } 
  else {
  num -= i;
  }
}
System.out.println(num);
}
}
// Guess the output of this loop.

/*
    num=1
    i=1 
    1%2==0 (false)
    num=num-1
      =1-1
	  =0
	  
	   
	i++; i=2
	2%2==0
    num+=2
    num=num+i
       =0+2
	   =2 
	   
	  i++ //3
      num=num-i;
       =2-3
       =-1	  

     i=4
     num=num+i
     num=-1+4
        =3	 
	   
	   
   3
  
*/