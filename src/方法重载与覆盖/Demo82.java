//在继承中，子类方法会覆盖父类方法
package 方法重载与覆盖;
import java.util.*;
class Student{//学生类
	String stuNo;
	String stuName;
	public Student() {
		stuNo = "";
		stuName = "";
	}
	public void inputData() {
		Scanner in = new Scanner(System.in);
		System.out.print("学号：");
		stuNo = in.nextLine();
		System.out.print("姓名：");
		stuName = in.nextLine();
	}
	public void showData() {
		System.out.print("学号："+stuNo+"\t姓名："+stuName);
	}
	
}
class Undergraduate extends Student{//本科生类，继承学生类
	String classNo;//班级
	public void inputData() {//输入本科信息
		Scanner in = new Scanner(System.in);
		System.out.println("请输入本科信息：");
		/*inputData();//调用子类方法，不会调用父类方法*/
		super.inputData();//调用父类方法
		System.out.print("班级：");
		classNo = in.nextLine();
	}
	public void showData() {
		System.out.println("本科生的信息为：");
		/*showData();//调用子类方法，不会调用父类方法*/
		super.showData();//调用父类方法
		System.out.println("\t班级"+classNo);
	}
	
}

public class Demo82 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Undergraduate uStu = new Undergraduate();
		uStu.inputData();
		uStu.showData();

	}

}
