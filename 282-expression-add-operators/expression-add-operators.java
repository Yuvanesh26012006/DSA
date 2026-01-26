class Solution {
    List<String> ans = new ArrayList<>();

    public void solve(int ind, long eval, long last, String exp, String num, int target) {

        if (ind == num.length()) {
            if (eval == target) {
                ans.add(exp);
            }
            return;
        }

        for (int i = ind; i < num.length(); i++) {
            if (i != ind && num.charAt(ind) == '0') break;
            long curr = Long.parseLong(num.substring(ind, i + 1));
            if (ind == 0) {
                solve(i + 1, curr, curr, "" + curr, num, target);
            } else {
                solve(i + 1, eval + curr, curr, exp + "+" + curr, num, target);
                solve(i + 1, eval - curr, -curr, exp + "-" + curr, num, target);
                solve(i + 1,
                      eval - last + last * curr,
                      last * curr,
                      exp + "*" + curr,
                      num,
                      target);
            }
        }
    }

    public List<String> addOperators(String num, int target) {
        solve(0, 0, 0, "", num, target);
        return ans;
    }
}
