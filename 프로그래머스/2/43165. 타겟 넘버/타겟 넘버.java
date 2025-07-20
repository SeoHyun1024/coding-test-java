class Solution {
    public static int count = 0;

    public static int solution(int[] numbers, int target) {
        dfs(numbers, 0, 0, target);

        return count;
    }

    public static void dfs(int[] numbers, int idx, int sum, int target) {
        if (idx == numbers.length) {
            if (sum == target) {
                count++;
            }
            return;
        }

        dfs(numbers, idx + 1, sum + numbers[idx], target);
        dfs(numbers, idx + 1, sum - numbers[idx], target);
    }
}