package leetcode;

import java.util.Stack;

/**
 * 
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation
 * 
 * @author fyping
 *
 */

public class Solution_9 {
	public static int exec(String [] items){
		Stack<String> cap = new Stack<String>();
		String signal = "+-*/";
		for(String it:items){
			if(signal.contains(it)){
				switch(it){
					case "+":{int result =Integer.valueOf(cap.pop())+Integer.valueOf(cap.pop());
					cap.push(String.valueOf(result));
					}break;
					case "-":{int result =Integer.valueOf(cap.pop())-Integer.valueOf(cap.pop());
					cap.push(String.valueOf(result));
					}break;
					case "*":{int result =Integer.valueOf(cap.pop())*Integer.valueOf(cap.pop());
					cap.push(String.valueOf(result));
					}break;
					case "/":{int result =Integer.valueOf(cap.pop())/Integer.valueOf(cap.pop());
					cap.push(String.valueOf(result));
					}break;
				}
			}else{
				 cap.push(it);
			}
			
		}
		return Integer.valueOf(cap.pop());
	}
	public static void main(String []args ){
		String []testStr = {"2","1","+","3","*"};
		System.out.println("result is " + Solution_9.exec(testStr));
	}
}
