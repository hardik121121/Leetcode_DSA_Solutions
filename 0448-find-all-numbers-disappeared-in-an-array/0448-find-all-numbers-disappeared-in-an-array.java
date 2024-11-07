class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> map=new HashSet<>();
       
        for(int i:nums)
        {
           map.add(i);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=nums.length;i++)
        {
            if(!(map.contains(i)))
            {
               list.add(i);
            }
        }
        return list;
    }
}