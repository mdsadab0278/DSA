public class Vowel_Cons {
    public static void main(String[] args) {
        String str="Propgramming language";
        int v=0,c=0;
        for(char a:str.toCharArray()){
            if("aeiouAEIOU".indexOf(a)!=-1){
                v++;
            }
            else if(Character.isLetter(a)){
                c++;
            }
        }
        System.out.println("Vowel:"+ v +" "+"Consonent:"+c);
    }
}
