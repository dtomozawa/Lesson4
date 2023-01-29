
public class Triangle {

    public static void main(String[] args) {
        int a =5;
        int b =8;
        int c =5;
        if (a==b && b==c && c==a) {
            System.out.println("正三角形");
        }else if (a==b || b==c || c==a){
            System.out.println("二等辺三角形");
        }else {
            System.out.println("ふつうの三角形");
        }

    }

}
