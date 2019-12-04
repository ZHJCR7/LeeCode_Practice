package test02;

public class Testforlistnode {
	
	private int val;
	private Testforlistnode next;
	
	//constructe function
	public Testforlistnode() {		
	}
	
	public Testforlistnode(int x) {
		this.val = x;
		this.next = null;
	}
	
	public void Insert(int data,Testforlistnode prenode) {
		Testforlistnode n = new Testforlistnode();
        n.val = data;
        n.next = null;
        prenode.next = n;
    }
	
	public static Testforlistnode Padding(Testforlistnode prenode) {
		Testforlistnode n = new Testforlistnode(0);
        n.val = 0;
        n.next = null;
        prenode.next = n;
//        prenode = prenode.next;
        return prenode;
    }
	
	 public static Testforlistnode addTwoNumbers(Testforlistnode l1, Testforlistnode l2) {
		 Testforlistnode p,q;
	     int length1 = 1,length2 = 1;

	     p = l1;
	     q = l2;
	        
	     //calculate the length of l1 and l2
	     while(p.next!=null){
	    	 length1++;
	         p = p.next;
	         }

	     while(q.next!=null){
	    	 length1++;
	         q = q.next;
	         }

	     if (length1>length2){
	    	 for(int i= 0;i<length1-length2;i++){
	    		 q.next = new Testforlistnode(0);
	             q = q.next;
	             }
	    	 }
	     else{
	    	 for(int i= 0;i<length2-length1;i++){
	    		 p.next = new Testforlistnode(0);
	             p = p.next;
	             }
	        }

	     int flag = 0;
	     Testforlistnode newNode = new Testforlistnode(-1);
	     Testforlistnode newNode1 = newNode;
	     
	        while(l1!=null&&l2!=null){
	            int mid_value = 0;
	            mid_value = l1.val + l2.val +flag;
	            newNode1.next = new Testforlistnode(mid_value%10);

	            if(mid_value>=10){
	                flag = 1;
	            }
	            else{
	                flag = 0;
	            }
	            
	            l1 = l1.next;
	            l2 = l2.next;
	            newNode1 = newNode1.next;

	        }

	        if(flag==1){
	            newNode1.next = new Testforlistnode(1);
	            newNode1 = newNode1.next;
	        }
	        return newNode.next;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testforlistnode node1 = new Testforlistnode(2);
		Testforlistnode node2 = new Testforlistnode(4);
		Testforlistnode node3 = new Testforlistnode(3);
		
		
		Testforlistnode node4 = new Testforlistnode(5);
		Testforlistnode node5 = new Testforlistnode(6);
		Testforlistnode node6 = new Testforlistnode(4);
		
		node2.Insert(4, node1);
		node3.Insert(3, node2);
		
		node5.Insert(6, node4);
		node6.Insert(4, node5);
//		
		Testforlistnode result = new Testforlistnode();
		
//		result = Padding(node1); 
		result = addTwoNumbers(node1,node4);

	}

}
