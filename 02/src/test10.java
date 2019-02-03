public class test10 {
    public static void main(String[] args) {
        int n1=1;
        int n2=1;
        System.out.print(n1 +" " +n2);

        for(int i=1;i<=10;i++){
            int next=n1+n2;
            System.out.print(" "+next);
            int result=0;
            n1 = n2;
            n2 = next;

        }
    }
}
