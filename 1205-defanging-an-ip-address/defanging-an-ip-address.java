class Solution {
    public String defangIPaddr(String address) {
        String a = "";
        char arr[] = address.toCharArray();
        for(char ch : arr){
            if(ch == '.'){
                a +=  "[.]";
            }else{
                a += ch;
            }
        }
        return a;
    }
}