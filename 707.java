class MyLinkedList {

    /** Initialize your data structure here. */
    public MyLinkedList() {
        
    }
     public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }
    ListNode head = null;
    private int length = 0; 
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        ListNode temp = head;
        int num = 0;
        while(temp!=null){
            if(index == num){
                return temp.val;
            }
            num++;
            temp = temp.next;
        }
        return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(length,val);
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > length) return;
        ListNode newNode = new ListNode(val);
        if(index == 0){
            newNode.next = head;
            head = newNode;
        }else if(index == length){
            ListNode temp = find(index - 1);
            temp.next = newNode;
        }else{
            ListNode temp = find(index - 1);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        length++;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(length == 0 || index < 0 || index > length-1) return;
        if(index == 0){
            head = head.next;
        }else if(index == length-1){
            ListNode temp = find(index-1);
            temp.next = null;
        }else{
            ListNode temp = find(index - 1);
            temp.next = temp.next.next;
        }
        length--;
    }

    public ListNode find(int index) {
        if(index < 0 || index > length-1) return null;
        ListNode temp = head;
        int num = 0;
        while(temp!=null){
            if(index == num){
                return temp;
            }
            num++;
            temp = temp.next;
        }
        return null;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */