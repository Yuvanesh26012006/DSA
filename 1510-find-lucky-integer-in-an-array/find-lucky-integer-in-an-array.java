class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> h1=new HashMap<>();
        for(int i:arr){
            h1.put(i,h1.getOrDefault(i,0)+1);
        }
        int min=-1;
        for(int i:h1.keySet()){
            if(i==h1.get(i)){
                min=Math.max(i,h1.get(i));
            }

        }
        return min;
    }
}