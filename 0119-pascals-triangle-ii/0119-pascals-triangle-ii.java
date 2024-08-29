class Solution {
    public List<Integer> getRow(int rowIndex) {
        long ans = 1;
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for(int col = 0; col <  rowIndex; col++){
            ans = ans * (rowIndex - col);
            ans = ans / (col + 1);
            result.add((int)ans);
        }
        return result;
    }
}