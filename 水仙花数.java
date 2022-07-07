package 面向对象实战;
//水仙花数是指一个三位数其各位数字的立方和等于该数本身，
public class 水仙花数 {
    public static void main(String[] args) {
        for(int i=153 ;i<1000;i++){
            int a=i,sum=0;
            while (a>0){
                int b= a % 10;
                sum += b*b*b;
                a /=10;
            }if(sum==i)
    System.out.println(i+"是水仙花");
        }
    }
}
