# Array

Array is a linear data structure, In java array is built-in Data Structure

What is an Array?
An array is the simplest data structure where a collection of similar data elements takes place and each data element can be accessed directly by only using its index number.

## Array Advantages
- Random access
- Easy sorting and iteration
- Replacement of multiple variables
## Array Disadvantages
- Size is fixed
- Difficult to insert and delete
- If capacity is more and occupancy less, most of the array gets wasted 
- Needs contiguous memory to get allocated
## Array Applications
- For storing information in a linear fashion
- Suitable for applications that require frequent searching

## Array Declaration, Initialization and Accessing an elements

### Syntax
    data_type[] array_name = {elements separated by commas}
    or,
    data_type array_name = new data_type[array_size];
### Declaration and Initialization of Integer type array

    int[] indianCurrency= new int[7];

    indianCurrency[0] = 10;

Accessing an elements from an array
by index of an element

    System.out.print(indianCurrency[0]+" ");
Iterating complete array

	for(int i=0;i<indianCurrency.length;i++){
		    System.out.print(indianCurrency[i]+" ");
	}

Declaration and Initialization of Integer type array

### Declaration and Initialization of String type array
    String[] indianCurrency= new int[7];

    indianCurrency[0] = "Ten Rupee";

Accessing an elements from an array
by index of an element

    System.out.print(indianCurrency[0]+" ");
Iterating complete array

	for(int i=0;i<indianCurrency.length;i++){
		    System.out.print(indianCurrency[i]+" ");
	}

### Operations on Arrays
- Traverse − print all the array elements one by one.

- Insertion − Adds an element at the given index.

- Deletion − Deletes an element at the given index.

- Search − Searches an element using the given index or by the - value.

- Update − Updates an element at the given index.

- Display − Displays the contents of the array.

Traverse 
----------------------------------------------------
print all the array elements one by one

    int[] studentScore = {80,90,95,85}

    for(int i=0; i<studentScore.length; i++){
        System.out.println(studentScore[i]);
    }

Insertion 
-----------------------------------------------
Adds an element at the given index.
1. at any specific index

        studentScore[3]=87;
2. On a complete array 

        for(int i=0; i<studentScore.length; i++){
            studentScore[i]=i*2+3;
        }

Deletion − 
---------------------------------------------
Deletes an element at the given index.

        int[] studentScore = {1,2,3,4,5};
        int n = studentScore.length;
        int k =2;
        for(int i=k; i<n-1; i++){
            LA[i]=LA[i+1];
        }
        n=n-1;
        for(int i=0; i<n; i++){
            System.out.println(studentScore[i]);
        }

Search 
----------------------------------------------- 
Searches an element using the given index or by the value.

    int[] studentScore = {1,2,3,4,5};
    int n = studentScore.length;
    int j=4;

    for(int i=0; i<n; i++){
        if(studentScore[i]==j){
            System.out.println("Found : "+studentScore[i]);
        }
    }    


Update − 
-----------------------------------------------
Updates an element at the given index.

    int[] studentScore = {1,2,3,4,5};
    int n = studentScore.length;
    // updating kth index element
    // studentScore[k-1] = Item

    studentScore[2] = 6;

    for(int i=0; i<n; i++){
            System.out.println(studentScore[i]);
    } 

Display −
------------------------------------------------- 
Displays the contents of the array.

    int[] studentScore = {1,2,3,4,5};
    int n = studentScore.length;

    for(int i=0; i<n; i++){
            System.out.println(studentScore[i]);
    } 


Sorting Algorithms
--------------------------
- [Bubble Sort](#bubble-sort)
- [insertion Sort](#insertion-sort)

Bubble Sort
-----------
![Bubble Sort](https://upload.wikimedia.org/wikipedia/commons/0/06/Bubble-sort.gif)

    int[] arr = {8,1,3,7,6,5,4,2};
    int n = arr.length;
    int temp;

    for(int i=0; i<n; i++){
        for(int j=0; j<n-1; j++ ){
            if(arr[j]>arr[i]){
                temp =arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
    }
    for(int i=0; i<n; i++){
            System.out.println(arr[i]);
    }

Properties

1. Average Time Complexity: O(n^2)
2. Stability: Stable

best use case

This is a very elementary sort which is easy to understand and implement. It is not recommended in actual production environments. No external memory is required to sort as it is an in-place sort.

Insertion Sort
--------------
1. Assume that first element in the list is in its sorted portion of the list and remaining all elements are in unsorted portion.
2. Take the first element from the unsorted list and insert that element into the sorted list in order specified (ascending or descending).
3. Repeat the above process until all the elements from the unsorted list are moved into the sorted list.

![Insertion Sort](https://upload.wikimedia.org/wikipedia/commons/9/9c/Insertion-sort-example.gif)

    int[] arr = {8,1,3,7,6,5,4,2};
    int n = arr.length;

    int[] arr = {8,1,3,7,6,5,4,2};
    int n = arr.length;

    for(int i=1; i<n; i++){

        int key = arr[i];
        int j = i-1;

        while(j>=0  && arr[j]>key ){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1]=key;
    }
    for(int i=0; i<n; i++){
      System.out.println(arr[i]);
    }