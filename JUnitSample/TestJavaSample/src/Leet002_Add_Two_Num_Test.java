import LeetCodeSample.Leet002_Add_Two_Num;
import LeetCodeSample.DataStruct.ListNode;

import static org.junit.Assert.*;

import org.junit.Test;

public class Leet002_Add_Two_Num_Test {
	
	@Test	
	public void Add_Two_Num_Test()
	{
		ListNode l1 = new ListNode(3);
		ListNode l2 = new ListNode(4);
		ListNode exp= new ListNode(7);
		ListNode res = Leet002_Add_Two_Num.addTwoNumbers(l1, l2);
		assertEquals(exp.val, res.val);
	}
}
