package LeetCodeSample;

import LeetCodeSample.DataStruct.ListNode;

public class Leet002_Add_Two_Num {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		ListNode c1 = l1;
		ListNode c2 = l2;
		
		ListNode pre = new ListNode(0);
		ListNode d = pre;
		int sum = 0;
		while(c1 != null || c2 != null)
		{
			if(c1!=null)
			{
				sum+=c1.val;
				c1=c1.next;
			}
			if(c2!=null)
			{
				sum+=c2.val;
				c2=c2.next;
			}
			d.next = new ListNode(sum%10);
			sum/=10;
			d=d.next;
		}
		if(sum==1)
		{
			d.next = new ListNode(1);
		}
		return pre.next;
	}
	
}
