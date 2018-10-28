/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) return null;
        RandomListNode walkNode = head;

        // step1: A->A'->B->B'->C->C'
        while(walkNode != null){
        	RandomListNode mirrorNode = new RandomListNode(walkNode.label);
        	RandomListNode tempB = walkNode.next;
        	walkNode.next = mirrorNode;
        	mirrorNode.next = tempB;
        	walkNode = tempB;
        }

        // step2: copy the random links, n'.random = n.random.next
        walkNode = head;
        while(walkNode != null){
        	RandomListNode mirrorNode = walkNode.next;
        	if(walkNode.random != null)
        		mirrorNode.random = walkNode.random.next;
        	else
        		mirrorNode.random = null;
        	walkNode = walkNode.next.next;
        }

        // step3: detach the list: n.next = n.next.next; n'.next = n'.next.next
        walkNode = head;
        RandomListNode mirrorNode = head.next;
        RandomListNode res = head.next;
        while(mirrorNode != null && walkNode != null){
        	walkNode.next = walkNode.next.next;
        	if(mirrorNode.next == null)
        		break;
        	mirrorNode.next = mirrorNode.next.next;
        	walkNode = walkNode.next;
        	mirrorNode = mirrorNode.next;
        }
        return res;
    }
}