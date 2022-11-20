class Next_Greater_Element   
{  
  
// main method  
public static void main(String args[])  
{  
// input array  
int arr[] = new int[]{14, 16, 9, 90, 99, 2, 6, 19, 4};  
  
// computing size of the input array  

  
System.out.println("The input array is: ");  
for(int i = 0; i < arr.length; i++)  
{  
System.out.print(arr[i] + " ");  
}  
System.out.println("\n");  
  
for(int i = 0; i < arr.length; i++)  
{  
int temp = -1;  
for(int j = i + 1; j < arr.length; j++)  
{  
    if(arr[j] > arr[i])  
    {  
       temp = arr[j];   
       break;  
    }  
      
}  
if(temp != -1)  
{  
System.out.println("The next greater element for the element " + arr[i] + " is: " + temp);  
}  
else  
{  
System.out.println("The next greater element for the element " + arr[i] + " does not exist. ");  
}  
}  
}  
}  