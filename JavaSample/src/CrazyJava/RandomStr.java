package CrazyJava;

import javax.swing.JOptionPane;

public class RandomStr {
	  public static void main(String[] args) {

	        // TODO Auto-generated method stub

	       

	        ////������֤��

	        //����һ�����ַ���

	        String result = "";

	        //����6��ѭ��

	        int flag=0;

	        do {

	            for(int i = 0 ; i < 6 ; i ++)

	            {

	                //����һ��97��122��int�͵�����

	                int intVal = (int)(Math.random() * 26 + 97);

	                //��intValueǿ��ת��Ϊchar�����ӵ�result����

	                result = result + (char)intVal;

	            }

	            //��ʾ��֤�룬����ʾ�û�������֤��

	             String input=JOptionPane.showInputDialog(result+"\n��������֤�룺");

	            if(input.equals(result))//�ж���֤���Ƿ���ȷ

	            {

	                JOptionPane.showMessageDialog(null,"��֤����ȷ����֤�ɹ���",

	                      "Results",JOptionPane.PLAIN_MESSAGE );

	                flag=1;

	            }

	            else

	            {

	                JOptionPane.showMessageDialog(null,"��֤��������ٴ���֤��",

	                      "Results",JOptionPane.PLAIN_MESSAGE );

	            }

	        }while(flag==0);
	  }
}