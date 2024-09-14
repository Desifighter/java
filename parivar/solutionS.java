package parivar;
public class solutionS {
    public static void main(String[] args) {
        String s="welcometojava"; int k=3;
        String smallest = "";
        String largest = "";
        int loop=s.length()-k+1;
        String[] words= new String[loop];
        for (int index = 0; index < loop; index++) {
            words[index]=s.substring(0+index, k+index);
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        smallest=words[0];
        largest=words[0];
        for (int i = 1; i < words.length; i++) {
            if (smallest.compareTo(words[i])>0) {
                smallest=words[i];
            }
            if (largest.compareTo(words[i])<0) {
                largest=words[i];
            }
        }
        String fun="\n"+smallest+"\n"+largest;
        System.out.println(fun);
    }
}
