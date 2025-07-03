class Solution {
    public List<Integer> getRow(int rowIndex) {
        rowIndex=rowIndex+1;
        List<Integer> ansList=new ArrayList<>();
        ansList.add(1);
        long ans=1;
        for(int col=1;col<rowIndex;col++){
            ans=ans*(rowIndex-col);
            ans=ans/col;
            ansList.add((int)ans);
        }
        return ansList;
    }
}