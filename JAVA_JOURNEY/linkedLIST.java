class linkedLIST {

    node head;

     class node
     {
        String data;
        node next ;


        node(String data)
        {
            this.data=data;
            this.next=null;
        }
     }


     // add in linkedlist
     // add- first, last

    public void addFirst(String data)
    {
        node newNode= new node(data);
         
        if( head == null)
        {
            head=newNode;
            return;

        }
        newNode.next= head;
        head=newNode;
    } 


    public void addLAST(String data)
    {
        node newNode = new node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next=newNode;
    }

    //print
    
    public void printList()
    {
        if(head==null)
        {
            System.out.println("list is empty...");
            return;
        }

        node currNode = head;
        while(currNode != null)
        {
            System.out.print( currNode +" -> ");
            currNode = currNode.next;
        }
        System.out.println("null ....");
    }



    // dlt first 
    public void deleteFIRST()
    {
        if(head == null)
        {
            System.out.println("THE LIST IS EMPTY...");
            return;
        }
        head = head.next;
    }
    // delete last
    public void deleteLAST()
    {
        if(head == null)
        {
            System.out.println("THE LIST IS EMPTY...");
            return;
        }

        node secondLAST = head;
        node lastNode= head.next;
        while(lastNode.next != null)
        {
            lastNode=lastNode.next;
            secondLAST = secondLAST
        }
    }

     public static void main(String[] args) {
        linkedLIST list=new linkedLIST();
        list.addFirst("a");
        list.addFirst("is"); 
        list.printList();

        list.addLAST("list");
        list.printList();
         
     }
}
