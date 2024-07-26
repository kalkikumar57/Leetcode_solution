class Solution{
    public int findTheCity(int n, int[][] edges, int dT) {
		int[][] dist=new int[n][n];
		 Map<Integer,Map<Integer,Integer>> map=new HashMap<>();
		 for(int[] t:edges) {
			 if(!map.containsKey(t[0])) map.put(t[0],new HashMap<>());
			 if(!map.containsKey(t[1])) map.put(t[1],new HashMap<>());
			 map.get(t[0]).put(t[1],t[2]);
			 map.get(t[1]).put(t[0],t[2]);
		 }
		 PriorityQueue<int[]> pq=new PriorityQueue<int[]>((o1,o2) ->(o1[1]-o2[1]));
		 for(int i=0;i<n;i++) {
			 pq.clear();
			 boolean vis[]=new boolean[n];
			 pq.offer(new int[] {i,0});
			 while(!pq.isEmpty()) {
				 int[] poll=pq.poll();
				 int city=poll[0],cost=poll[1];
				 
				 if(vis[city])continue;
				 vis[city]=true;
				 dist[i][city]=cost;
				 if(map.containsKey(city)) {
					 for(Map.Entry<Integer, Integer> e: map.get(city).entrySet()) {
						 if(!vis[e.getKey()] && e.getValue()<=dT)
							 pq.offer(new int[] {e.getKey(),cost+e.getValue()});
					 }
				 }
			  }
		 }
		 int minN=n,minC=0;
		 for(int i=0;i<dist.length;i++) {
			 int no=0;
			 for(int j=0;j<dist[0].length;j++) {
				 if(dist[i][j]!=0 && dist[i][j]<=dT) no++;
			 }
			 if(no<=minN) {
				 minN=no;
				 minC=i;
			 }
		 }
		 
		 return minC;
		 
	}
}
