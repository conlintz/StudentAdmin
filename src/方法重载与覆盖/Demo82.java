//�ڼ̳��У����෽���Ḳ�Ǹ��෽��
package ���������븲��;
import java.util.*;
class Student{//ѧ����
	String stuNo;
	String stuName;
	public Student() {
		stuNo = "";
		stuName = "";
	}
	public void inputData() {
		Scanner in = new Scanner(System.in);
		System.out.print("ѧ�ţ�");
		stuNo = in.nextLine();
		System.out.print("������");
		stuName = in.nextLine();
	}
	public void showData() {
		System.out.print("ѧ�ţ�"+stuNo+"\t������"+stuName);
	}
	
}
class Undergraduate extends Student{//�������࣬�̳�ѧ����
	String classNo;//�༶
	public void inputData() {//���뱾����Ϣ
		Scanner in = new Scanner(System.in);
		System.out.println("�����뱾����Ϣ��");
		/*inputData();//�������෽����������ø��෽��*/
		super.inputData();//���ø��෽��
		System.out.print("�༶��");
		classNo = in.nextLine();
	}
	public void showData() {
		System.out.println("����������ϢΪ��");
		/*showData();//�������෽����������ø��෽��*/
		super.showData();//���ø��෽��
		System.out.println("\t�༶"+classNo);
	}
	
}

public class Demo82 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Undergraduate uStu = new Undergraduate();
		uStu.inputData();
		uStu.showData();

	}

}
