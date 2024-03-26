package Arrays;
import java.util.Scanner;

public class DuplicateArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		DuplicateArrayProject ap=new DuplicateArrayProject();
		
		
		System.out.println("\nplease Enter number of elements to be insert in Array :");
//		ap.display();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
		
			a[i]=sc.nextInt();
			
			
		}
		System.out.print("[");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+"  ");
		}
		System.out.print("]"+"\n");
//		ap.display();
		System.out.println("1.INSERTION");
		System.out.println("2.DELETION");
		System.out.println("3.MAXIMUM VALUE");
		System.out.println("4.MINIMUM VALUE");
		System.out.println("5.FIRST OCCURENCE");
		System.out.println("6.LAST OCCURENCE");
		System.out.println("7.REVERSE");
		System.out.println("8.Exit");
		System.out.println("9.Bubble Sort Algorithm");
		System.out.println("10.Merge Sort Algorithm");
		System.out.println("11.Insertion Sort Algorithm");
		System.out.println("12.Selection Sort Algorithm");
		System.out.println("13.Quick Sort Algorithm");
		System.out.println("14.Swapping");
		System.out.println("15.Ascending Order");
		System.out.println("16.Descending Order");
		System.out.println("17.Unique Values");
		System.out.println("18.Duplicate Values");
		
		boolean keeprunning=true;
		while(keeprunning) {
			
		int num=sc.nextInt();
		switch(num) {
		
		case 1:
			int pos=sc.nextInt();
			int element=sc.nextInt();
			int res[]=ap.insert(a,pos,element);
			for(int i=0;i<n+1;i++) {
				System.out.print(res[i]+"  ");
			}
			break;
		case 2:
			int element1=sc.nextInt();
			int res4[]=ap.delete(a,element1);
			System.out.println("\nAfter deletion");
			
			for(int i=0;i<n-1;i++) {
				
				System.out.print(res4[i]+"  ");
			}
			break;
		case 3:
			int res3=ap.max(a);
			System.out.println("\n");
			System.out.println("Maximum Number");
			System.out.print(res3);
			break;
		case 4:
			int res5=ap.min(a);
			System.out.println("\n");
			System.out.println("Minimum Number");
			System.out.print(res5);
			break;
		case 5:
			int element2=sc.nextInt();
			int res6=ap.firstOccurence(a,element2);
			System.out.println("First Occurence at index:"+res6);
			break;
		case 6:
			int element3=sc.nextInt();
			int res7=ap.lastOccurence(a,element3);
			System.out.println("First Occurence at index:"+res7);
			break;
		case 7:
			int res2[]=ap.reverse(a);
			System.out.println("\nAfter Reverse Number");
			for(int i=0;i<a.length;i++) {
				System.out.print(res2[i]+",");
			}
			break;
		case 8:
			keeprunning=false;
			break;
			
		case 9:
			int res8[]=ap.bubbleSort(a);
			for(int i=0;i<a.length;i++) {
				System.out.print(res8[i]+"  ");
			}
			break;
		case 10:	
			int res9[]=ap.mergeSort(a,0,a.length-1);
			
			for(int i=0;i<a.length;i++) {
				System.out.print(res9[i]+"  ");
			}
			break;
		case 11:
			int res10[]=ap.insertionSort(a);
			for(int i=0;i<a.length;i++) {
				System.out.print(res10[i]+"  ");
			}
			break;
		case 12:
			int res11[]=ap.selectionSort(a);
			for(int i=0;i<a.length;i++) {
				System.out.print(res11[i]+"  ");
			}
			break;
		case 13:
			int res12[]=ap.quickSort(a,0,a.length-1);
			for(int i=0;i<a.length;i++) {
				System.out.print(res12[i]+"  ");
			}
			break;
		case 14:
			int res13[]=ap.swapping(a);
			for(int i=0;i<a.length;i++) {
				System.out.print(res13[i]+"  ");
			}
			break;
		case 15:
			int res14[]=ap.ascending(a);
			for(int i=0;i<a.length;i++) {
				System.out.print(res14[i]+"  ");
			}
			break;
		case 16:
			int res15[]=ap.descending(a);
			for(int i=0;i<a.length;i++) {
				System.out.print(res15[i]+"  ");
			}
			break;
		case 17:
			int res16[]=ap.uniqueValues(a);
			for(int i=0;i<a.length;i++) {
				System.out.print(res16[i]+"  ");
			}
		case 18:
			int res17[]=ap.duplicateValues(a);
			for(int i=0;i<a.length;i++) {
				System.out.print(res17[i]+"  ");
			}
			
		default:
				System.out.println("not found");
				break;
		
		}
		}
	}
}