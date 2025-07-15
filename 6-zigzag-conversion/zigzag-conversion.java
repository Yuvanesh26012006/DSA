class Solution {
    public String convert(String s, int numRows) {
        if(numRows>s.length() ||numRows==1){
            return s;
        }
        int currentRows=0;
        int direction=1;
        List<Character>[] rows=new ArrayList[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new ArrayList<>();
        }
        for(char c:s.toCharArray()){
            rows[currentRows].add(c);
            if(currentRows==0){
                direction=1;
            }
            else if(currentRows==numRows-1){
                direction=-1;
            }
            currentRows+=direction;
        }
        StringBuilder result=new StringBuilder();
        for(List<Character> c:rows){
            for(char j:c){
                result.append(j);            
        }
        }
        return result.toString();
    }
}