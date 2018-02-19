package CrazyJava;

import javax.swing.JOptionPane;

public class RandomStr {
	  public static void main(String[] args) {

	        // TODO Auto-generated method stub

	       

	        ////生成验证码

	        //定义一个空字符串

	        String result = "";

	        //进行6次循环

	        int flag=0;

	        do {

	            for(int i = 0 ; i < 6 ; i ++)

	            {

	                //生成一个97～122的int型的整数

	                int intVal = (int)(Math.random() * 26 + 97);

	                //将intValue强制转换为char后连接到result后面

	                result = result + (char)intVal;

	            }

	            //显示验证码，并提示用户输入验证码

	             String input=JOptionPane.showInputDialog(result+"\n请输入验证码：");

	            if(input.equals(result))//判断验证码是否正确

	            {

	                JOptionPane.showMessageDialog(null,"验证码正确，验证成功！",

	                      "Results",JOptionPane.PLAIN_MESSAGE );

	                flag=1;

	            }

	            else

	            {

	                JOptionPane.showMessageDialog(null,"验证码错误，请再次验证！",

	                      "Results",JOptionPane.PLAIN_MESSAGE );

	            }

	        }while(flag==0);
	  }
}