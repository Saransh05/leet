class Solution {
    public String frequencySort(String s) {
        int l=s.length();
        Map<Character,Integer> map1=new HashMap<>();
        String str="";
        for(int i=0;i<l;i++)
        {
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=l;i>0;i--)
        {
                   if (map1.containsValue(i)) {
            for (Map.Entry<Character,Integer> entry : map1.entrySet()) {
                if (entry.getValue().equals(i)) {
                    int j=i;
                    while(j>0){
                    str += entry.getKey();   
                    j--;
                    }
                }
            }
        }
        }

        return str;
    }
}