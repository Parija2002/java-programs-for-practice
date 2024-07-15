public class impleusingLL
{
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    
    public static class Stack
    {
        private Node head;
        
        // checking stack is empty or not 
        public boolean isEmpty()
        {
            return head == null;
        }

        // inserting element into the stack
        public void push(int data)
        {
            Node newNode = new Node(data);
            if (isEmpty())
            {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // deleting element from stack
        public int pop()
        {
            if (isEmpty())
            {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek()
        {
            if (isEmpty())
            {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
