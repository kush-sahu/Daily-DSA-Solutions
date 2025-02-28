class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>bigerlist=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
			int a=1;
			List<Integer>list=new ArrayList<>();

			for(int j=1;j<=i;j++){
				list.add(a);
				a=a*(i-j)/j;
			}
            bigerlist.add(list);
			
		}
       return bigerlist;
    }
}