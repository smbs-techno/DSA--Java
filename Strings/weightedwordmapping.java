package Strings;
public class weightedwordmapping {
    public static String mapWordWeights(String[] words, int[] weights) {
        int sum=0;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            sum=0;
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                int no=ch-'a'+1;
                sum+=weights[no-1];
            }
            int m=sum%26;
            char a=(char)('z'-m);
            ans.append(a);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String[] words = {"abcd","def","xyz"}; 
        int[] weights = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(mapWordWeights(words, weights));
    }
}
