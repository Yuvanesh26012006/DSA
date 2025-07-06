class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);
            }
            else{
                ans.add(Arrays.asList(start,end));
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        ans.add(Arrays.asList(start,end));
        int mergeIntervals[][]=new int[ans.size()][2];
        int  index=0;
        for(List<Integer> l:ans){
             mergeIntervals[index++]=new int[]{l.get(0),l.get(1)};
        }
        return mergeIntervals;
    }
}