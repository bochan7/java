//making a stack which works on the principle of last in first out 


class stack{
    int i = -1;
    
    int [] stacck = new int [5];

    public void push(int element){
       
        i++; 
         stacck[i] = element;
    
        }
    

    public void pop(){
        if(i == -1){
            System.out.println("nothing to pop");
        }
        else{
        System.out.println("popped" + stacck[i]);
        i--; 
        }
        
    }



}
public class stack_class {
 
 public static void  main (String[] args){

 stack stack1 = new stack();


 stack1.push(1);
 stack1.push(2);
 stack1.push(3);
 stack1.push(4);
 stack1.push(5);

 System.out.println("stack created ");

 for(int j = stack1.i; j 
 > -1; j--){
    
 System.out.println(stack1.stacck[j]);
 
}

 stack1.pop();
 stack1.pop();

 System.out.println("stack after popping elements  ");

 for(int j = stack1.i;j>-1;j--){
    
 System.out.println(stack1.stacck[j]);
 
}
}
}
