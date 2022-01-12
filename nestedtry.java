class TestExp
 {
 public static void main(String args[])
  {
// Here length of num1>num2 
 int []num1={4,8,16,32,64,128,256,512};
 int []num2={2,0,4,4,0,8};
try{ //Outer try
 for(int i=0;i<num1.length;i++)
  {
   try { // nested try
           System.out.println(num1[i]+"/"+num2[i]+" is "+num1[i]/num2[i]);
       }
   catch(ArithmeticException ex)
    {
     System.out.println("\n can't divide by zero");
    }
   }
 }
 catch(ArrayIndexOutOfBoundsException ex)
    {
     System.out.println("\n No matching element found");
     System.out.println("\n Fatal Error -program terminated");
    }
   } 
   }