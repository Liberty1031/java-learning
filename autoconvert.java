public class autoconvert {
    public static void main(String[]args){
        int num ='a';
        float a1 =6;
        System.out.println(num);
        System.out.println(a1);
        byte b1 =1;
        byte b2 =2;
        int  b3 =b1 +b2;
        System.out.println(b1 + b2);
        boolean Pass = true;
        if(Pass == false){
            System.out.println("GOOD");
        }else{
            System.out.println("BAD");
        }
        int c1 = (int)1.9;
        System.out.println("c1="+c1);
   }
}