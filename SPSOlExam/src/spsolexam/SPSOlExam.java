/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spsolexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





class Question01{

    public int computeSumUsingForLoop(List<Integer> data){
        int sum=0;
        if(data.size()!=0){
            for(int i=0;i<data.size();i++){
                
                sum+=data.get(i);
            }
            
           
            
        }
        return sum;
        
        
    }
    
    
    public int computeSumUsingWhileLoop(List<Integer> data){
        int sum=0;
        
        if(data.size()!=0){
            int i=0;
            
            while(i<data.size()){
                sum+=data.get(i);
                i++;
            }
            
           
            
        }
        return sum;
                
    }
    
    public int computeSumUsingRecursiveMethod(List<Integer> data, int index){
    
        return data.get(index);
    };

}

class Question2{
    
    
    
    public List<Object> combineLists(List<Object> list1, List<Object> list2) {
    List<Object> result = new ArrayList<>();
        int minSize = Math.min(list1.size(), list2.size());

        for (int i = 0; i < minSize; i++) {
            result.add(list1.get(i));
            result.add(list2.get(i));
    }

    return result;
    
    
    }

}

class Question03{
    
    public List<Long> getSequence(int count) {
        List<Long> fibonacciArray = new ArrayList<>();

        if (count <= 0) return fibonacciArray;

        fibonacciArray.add(0L); // First number
        if (count == 1) return fibonacciArray;

        fibonacciArray.add(1L); // Second number

        for (int i = 2; i < count; i++) {
            long next = fibonacciArray.get(i - 1) + fibonacciArray.get(i - 2);
            fibonacciArray.add(next);
        }

        return fibonacciArray;
    }

}

class Question04{
 

    public String createTheMaxNumber(List<Integer> numbers) {
        
        List<String> stringNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            stringNumbers.add(String.valueOf(num));
        }

        
        stringNumbers.sort((a, b) -> (b + a).compareTo(a + b));
        //here I am going the sort the array by comparing the two indexes avalues and then witht the sum of them
        
        
        
        StringBuilder result = new StringBuilder();
        for (String num : stringNumbers) {
            result.append(num);
        }

        return result.toString();
    }

}


class Question05{

   
    
}




public class SPSOlExam {

    
    
    
    public static void main(String[] args) {
        
        
        //===================Question 01 Start =====================//
        Question01 q1 = new Question01();
        int sumForRecursive=0;
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(70);
        numbers.add(50);
        
        System.out.println("Sum of For Loop"+q1.computeSumUsingForLoop(numbers));//display the sum form for  loop
        System.out.println("Sum of While Loop "+q1.computeSumUsingWhileLoop(numbers) );//display the sum from the white loop
        
        for(int i=0;i<numbers.size();i++){
            sumForRecursive+=q1.computeSumUsingRecursiveMethod(numbers, i);//displaying the sum of the recursive method
        }
        
        System.out.println("Sum for the Recursive :"+sumForRecursive);
        
        
        //==================For Question 2 Start ========================//
        List<Object> list1 = Arrays.asList("a", "b", "c");
        List<Object> list2 = Arrays.asList(1, 2, 3);
        
        Question2 question2 = new Question2();
        
       List<Object> combined = question2.combineLists(list1, list2);
       System.out.println("Cobined Out put of the two lists"+combined);
       
       //==================For Question 2 End ========================//
       
       //==================For Question 3 Start ========================//
       Question03 question03 = new Question03();
               
        List<Long> fibonacciValue = question03.getSequence(10);
        System.out.println("Fabonacci Values "+fibonacciValue);
        
        //==================For Question 3 End ========================//

        
        //==================For Question 4 Start ========================//
        
        Question04 question04 = new Question04();
        List<Integer> input = Arrays.asList(50, 2, 1, 9);
        String largest = question04.createTheMaxNumber(input);
        System.out.println("Largest Value :"+largest); 


        

        
        
    }
    
}
