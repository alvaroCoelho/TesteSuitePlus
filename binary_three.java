//implementado em JAVA

public class BinaryThree {  
  
    public static void main(String[] args) {  
        new BinaryThree().run();  
    }  
  
    static class Node {  
         Node left;  
        Node right;  
        int value;  
  
        public Node(int value) {  
            this.value = value;  
        }  
    }  
  
    public void run() {  
        Node nd = new Node(20);  
        
        System.out.println("Criando arvore com a raiz " + nd.value);  
        insert(nd, 22);  
        insert(nd, 6);  
        insert(nd, 15);  
        inser(nd, 8);  
        insert(nd, 17);  
        insert(nd, 7);  
        insert(nd, 3);  
        insert(raiz, 11);  
        
    }  
  
    public void insert(Node node, int value) {  
        if (value < node.value) {  
            if (node.left != null) {  
                insert(node.left, value);  
            } else {  
                System.out.println("  Inserindo " + value + " a esqueda de " + node.value);  
                node.left = new No(value);  
            }  
        } else if (value > node.value) {  
            if (node.right != null) {  
                insert(node.right, value);  
            } else {  
                System.out.println("  Inserindo " + value + " a direita de " + node.value);  
                node.right = new No(value);  
            }  
        }  
    }  
  
   public boolean isValidBST(Node node){
      
	  if(node.left==null && node.right == null){
	       
	      return true;
		  
	      }
		  
		  if ( (node.left <= node) || (node.left == null) ){
		  
		        if( (node.right > node)  || (node.right == null) ){
			   
			      return true;
				  
			    } else {
				
				      return false;
	
				  }
		  
		  
		  } else {
		      
			  return false;
		  
		    }
   
   
   
   }
  
    
  
}  