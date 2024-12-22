package Array_String;
// Ask in Amazon, Google, Apple
public class Merge_Strings_Alternately {
    // if n is the length of Word1 and m is the length of word2 so the time complexity = O(n+m)
    // let see the logic i am using Merge two sorted array technique it is very simple technique
    // use two pointer one pointer for word1 and other pointer for word2 and use one variable flag starting its true
    // if flag is true add the char to word 1 if flag is false add the char to word2 and is will change the flag also
    // for example mera pointer word1 par he to me charAt i ko add karuga and flag ko false karuga vise versa
    // and agr word1 khtm ho jata he to word2 ki ke char ko add kar duga as it is and vice versa.
    // i thik you understand the logic
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
//        boolean flag = true;
        while (i<word1.length() && j<word2.length()){
//            if(flag){
                sb.append(word1.charAt(i++));
//                i++;
//            } else{
                sb.append(word2.charAt(j++));
//                j++;
            }
//            flag = !flag;
//        }
        while (i<word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }
        while (j<word2.length()){
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "sfderta";
        System.out.println(mergeAlternately(word1,word2));
    }
}
