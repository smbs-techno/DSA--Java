package Strings;
public class maximum69number{
    public static int maximum69Number (int num) {
        int res=0;
        boolean flag=false;
        StringBuilder sb=new StringBuilder(String.valueOf(num));
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='9'){
                flag=true;
                sb.deleteCharAt(i);
                sb.insert(i,'9'); 
                res=Integer.parseInt(sb.toString());
            }
            if(res>num && flag==true){
                return res;
            }

        }
        return num;
    }
    public static void main(String[] args) {
        int num=9969;
        System.out.print(maximum69Number(num));
    }
}