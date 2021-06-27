package com.beercafeguy.ds.array;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        System.out.println("Common Prefix : "+commonPrefix("Hem","Heera"));
        String[] input={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(input));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }else{
            String common=strs[0];
            for(int i=0;i<strs.length;i++){
                common=commonPrefix(common,strs[i]);
            }
            return common;
        }
    }

    static String commonPrefix(String str1,String str2){
        int len1=str1.length();
        int len2=str2.length();
        int lenToCheck= (len1 > len2) ? len2 :len1;
        StringBuffer commonPrefix=new StringBuffer();
        for(int i=0;i<lenToCheck;i++){
            if(str1.charAt(i)==str2.charAt(i)){
                commonPrefix.append(str1.charAt(i));
            }else{
                break;
            }
        }
        return commonPrefix.toString();
    }
}
