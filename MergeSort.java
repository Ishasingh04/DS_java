package datastructures;

public class Merge_sort {
	
	void merge(int arr[],int beg,int mid, int end)
	{int l=mid-beg+1;
	int r=end-mid;
	int larr[]=new int [l];
	int rarr[]=new int[r];
	for(int i=0;i<l;i++)
	{
		larr[i]=arr[beg+i];
	}
	for(int i=0;i<r;i++)
	{
		rarr[i]=arr[mid+i+1];
	}
	int k=beg,i=0,j=0;
	while(i<l && j<r)
	{
		if(larr[i]<=rarr[j])
		{
			arr[k]=larr[i];
			i++;
		}
		else
		{
			arr[k]=rarr[j];
			j++;
		}
		k++;
	}
	while(i<l)
	{
		arr[k]=larr[i];
		i++;
		k++;
	}
	while(j<r)
	{
		arr[k]=rarr[j];
		j++;
		k++;
	}
	
		
		
	}
	void sort(int arr[],int beg,int end)
	{
		if(beg<end)
		{
			int mid=(beg+end)/2;
			sort(arr,beg,mid);
			sort(arr,mid+1,end);
			merge(arr,beg,mid,end);
		}
	}
	

	public static void main(String[] args) {
		int arr[] = {90,23,101,45,65,23,67,89,34,23};
		Merge_sort a=new Merge_sort();
		a.sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
