class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int ans =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int low =0;
        for(int high=0;high<n;high++){
map.put(fruits[high], map.getOrDefault(fruits[high], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[low], map.get(fruits[low]) - 1);

                if (map.get(fruits[low]) == 0) {
                    map.remove(fruits[low]);
                }

                low++;
            }

            ans = Math.max(ans, high - low + 1);
        }

        return ans;
        }
    }
