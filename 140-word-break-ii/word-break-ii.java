class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<>();
        Set<String> dict = new HashSet<>(wordDict);

        backtrack(s, 0, 0, dict, res, new ArrayList<>());
        return res;

    }

    public void backtrack(String s, int i, int j, Set<String> d,
            List<String> res, ArrayList<String> curr) {

        if (j == s.length()) {
            res.add(curr.stream().map(v -> v).collect(Collectors.joining(" ")));
            return;
        }

        StringBuilder sb = new StringBuilder();
        while (j < s.length()) {
            sb.append(s.charAt(j++));
            if (d.contains(sb.toString())) {
                curr.addLast(sb.toString());
                backtrack(s, i, j, d, res, curr);
                curr.removeLast();
            }
        }
    }
}