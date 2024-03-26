package Arrays;

public class DuplicateArrayProject {
	
public int[] insert(int a[],int pos,int element) {
		
		if(pos<1||pos>a.length+1) {
			
			System.out.println("Insertion is Not possible");
			return a;
		}
		
		int b[]=new int[a.length+1];
		
		for(int i=0,j=0;i<b.length;i++) {
			
			if(pos-1==i) {
				b[i]=element;
			}
			else {
				b[i]=a[j++];
			}
		}
		return b;
	}
//---------------------------------------REVERSE-----------------------------------------	
	public int [] reverse(int a[]) {
		
		if(a.length<1) {
			System.out.println("reverse is not possible");
		}
		int size=a.length;
		int c[]=new int [size];
		int index=0;
		for(int i=size-1;i>=0;i-- )
		{
			c[i]=a[index];
			index++;

		}
		return c;
		
//---------------------------------------MAXIMUM---------------------------------------------		
	}
	
	public int max(int a[]) {
		
		if(a.length<1) {
			System.out.println("Please enter the values");
			}
		
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
//----------------------------------------------DELETE--------------------------------------
	public int[] delete(int a[],int element) {
		
		if(element<1||element>a.length) {
			System.out.println("Deletion is not possible");
			
			return a;
		}
		int d[]=new int[a.length];
		
		for(int i=0,j=0;i<a.length;i++) {
			if(a[i]==element) {
				continue;
			}
			d[j++]=a[i];
		}
		return d;
	}
//--------------------------------------------MINIMUM----------------------------------------
public int min(int a[]) {
		
		if(a.length<1) {
			System.out.println("Please enter the values");
			}
		
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
		
	}

	public int firstOccurence(int a[],int element) {
		
		if(element<1||element>a.length) {
			System.out.println("Element is not Found");
			
			
		}
//		int e[]=new int[a.length];
		int e;
		int i;
		for( i=0;i<a.length;i++) {
			
			if(a[i]==element) {
			System.out.println(i);
			   break;
			}
		}
		return i ;
	}
public int lastOccurence(int a[],int element) {
		
		if(element<1||element>a.length) {
			System.out.println("Element is not Found");
			}
		int e;
		int i;
		for( i=a.length-1;i>=0;i--) {
			
			if(a[i]==element) {
			System.out.println(i);
			   break;
			}
		}
		return i ;
	}
	//-----------------------------------------------------------------
	public int[] bubbleSort(int a[]) {
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=1;j<a.length;j++) {
				
				if(a[j-1]>a[j]) {
					
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
			
		}
		return a;
	}
//--------------------------------------------------------------------------------
	public int[] mergeSort(int a[],int i,int j) {
		if(i<j) {
		int mid=(i+j)/2;
		mergeSort(a,i,mid);
		mergeSort(a,mid+1,j);
		merge(a,i,mid,j);
		
		}
		return a;
	}

	public void merge(int[] a, int low, int mid, int high) {
		int i=low;
		int j=mid+1;
		int k=low;
		int b[]=new int[a.length];
		while(i<=mid&&j<=high) {
			if(a[i]<a[j]) {
				b[k]=a[i];
				i++;
				k++;
			}
			else {
				b[k]=a[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			b[k]=a[i];
			i++;
			k++;
		}
		while(j<=high) {
			b[k]=a[j];
			j++;
			k++;
		}
		
		for( i=low;i<=high;i++) {
			a[i]=b[i];
		}
	
	}
	public int[] insertionSort(int a[]) {
	for(int i=1;i<length;i++) {
		int key=a[i];
		int j=i-1;
		while(j>=0&&a[j]>key) {
			
			a[j+1]=a[j];
			j=j-1;
		}
		a[j+1]=key;
	}
	return a;
	}
	public int[] selectionSort(int a[]) {
		for(int i=0;i<a.length;i++) {
			int min_index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[min_index]>a[j]) {
				min_index=j;
					
				}
			}
			int temp=a[min_index];
			a[min_index]=a[i];
			a[i]=temp;
			}
		return a;
	}
	public int[] quickSort(int arr[],int low,int high)
	{
		int i=low;
		int j=high;
		int mid=(low+high)/2;
		int pivot=arr[mid];
		
		while(i<=j)
		{
			while(arr[i]<pivot)
			{
				i++;
			}
			while(arr[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
				 i++;
				 j--;
				
			}
		}
		if(low<j)
		
			quickSort(arr,low,j);
		
		if(high>i)
		
			quickSort(arr,i,high);
		return arr;
	}
	public int[] swapping(int a[]) {
	for(int i=0;i<=a.length-1;i++)
	{
		if(i%2==1)
		{
			System.out.print(a[i]+"  "+a[i-1]+" ");
		}
	}
	
	if(a.length%2==1) {
		System.out.print(a[a.length-1]);
	}
	
	return a;
	}
	public int[] ascending(int arr[]) {
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
	}
		return arr;
	}
	public int[] descending(int arr[]) {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				int temp=0;
				
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
	}
		return arr;
	}
	public int[] uniqueValues(int a[]) {
		
		int c=0;
		int oa[]=new int[a.length];
		for(int i=0;i<a.length-1;i++)
		{
			c=1;
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]==a[j]) {
					c++;
					oa[j]=1;
				}
			}
			if(c==1&&oa[i]!=1) {
				System.out.println(a[i]+"->"+c);
			}
		}
		return a;
	}
public int[] duplicateValues(int a[]) {
		
		int c=0;
		int oa[]=new int[a.length];
		for(int i=0;i<a.length-1;i++)
		{
			c=1;
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]==a[j]) {
					c++;
					oa[j]=1;
				}
			}
			if(c>1&&oa[i]!=1) {
				System.out.println(a[i]+"->"+c);
			}
		}
		return a;
	}
	
	
	
}
