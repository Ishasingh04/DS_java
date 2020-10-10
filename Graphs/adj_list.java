package graphs;
import java.util.*;
public class adj_list {
	
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
		
	}
	static void print(ArrayList<ArrayList<Integer>> adj)
	{
		for(int i=0;i<adj.size();i++)
		{
			System.out.println("arraylist at vertex"+ i);
			for(int j=0;j<adj.get(i).size();j++)
			{
				System.out.println("->"+adj.get(i).get(j));
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int V=5;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(V);

		for(int i=0;i<V;i++)
		{
			adj.add(new ArrayList<Integer>());
		}
		
		addEdge(adj,0,1);
		addEdge(adj,0,4);
		addEdge(adj,0,3);
		addEdge(adj,1,2);
		addEdge(adj,1,6);
		addEdge(adj,2,8);
		addEdge(adj,3,5);
		
		
		print(adj);
		
	}

}
