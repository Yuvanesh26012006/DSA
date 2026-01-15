class Solution {
    List<String> ans=new ArrayList<>();
    Map<Character, String> map = new HashMap<>() {{
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
    }};
    public void backTrack(int ind,StringBuilder sb,String digits){
        if(ind==digits.length()){
            ans.add(sb.toString());
            return;
        }
        String letters=map.get(digits.charAt(ind));
        for(char c:letters.toCharArray()){
            sb.append(c);
            backTrack(ind+1,sb,digits);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        backTrack(0,new StringBuilder(),digits);
        return ans;
    }
}