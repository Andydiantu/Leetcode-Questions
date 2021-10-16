public class BruteForce_Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currNode1 = l1;
        ListNode currNode2 = l2;
        ListNode ansNode = new ListNode(0,null);
        int adder = 0;
        ListNode currAnsNode = ansNode;

        while (currNode1.next != null && currNode2.next != null) {

            currAnsNode.val = (adder + currNode1.val + currNode2.val)%10;

            if (adder + currNode1.val + currNode2.val >= 10 ){
                adder = 1;
            } else {
                adder = 0;
            }

            // update/ current cursor node
            currAnsNode.next = new ListNode(0,null);
            currAnsNode = currAnsNode.next;
            currNode1 = currNode1.next;
            currNode2 = currNode2.next;
        }

        // case when two linked list terminate at same time
        if (currNode1.next == null && currNode2.next == null){
            if (adder == 1){
                currAnsNode.next = new ListNode(1);
            }
        }

        // case when only one linked list terminate
        if (currNode1.next == null && currNode2.next != null){
            while (currNode2.next != null ) {
                currAnsNode.val = (adder + currNode2.val)%10;
                if (adder + currNode2.val >= 10){
                    adder = 1;
                } else {
                    adder = 0;
                }

                currAnsNode.next = new ListNode(0,null);
                currAnsNode = currAnsNode.next;
                currNode2 = currNode2.next;

            }
        }

        if (currNode2.next == null && currNode1.next != null){
            while (currNode1.next != null ) {
                currAnsNode.val = (adder + currNode2.val)%10;
                if (adder + currNode1.val >= 10){
                    adder = 1;
                } else {
                    adder = 0;
                }

                currAnsNode.next = new ListNode(0,null);
                currAnsNode = currAnsNode.next;
                currNode1 = currNode1.next;
                
            }
        }

        return ansNode;
    }
}
