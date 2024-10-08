class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            ans.add(pascalTriangle(i));
        }
        return ans;
    }

    public List<Integer> pascalTriangle(int n){

        int answer = 1;
        List<Integer> result = new ArrayList<>();
        result.add(1);

        for(int col = 1; col < n; col++){
            answer = answer * (n - col);
            answer = answer / col;
            result.add((int)answer); 
        }
        return result;
    }
}
