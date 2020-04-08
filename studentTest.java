import java.util.*;
public class studentTest {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please type the number of students");
		int num=sc.nextInt();
		int i,j;
		int count=0;
		int[] studentScore =new int[num*7];
		for(i=0;i<num;i++) {
			System.out.println("Please type the score of student " + (i+1));
			System.out.println("Type the 7 scores one after another");
			for(j=0;j<7;j++) {
				studentScore[count]=sc.nextInt();
				count++;
			}

		}
		
		for(i=0;i<num*7;i=i+7) {
			student s1=new student(studentScore[i],studentScore[i+1],studentScore[i+2],studentScore[i+3],studentScore[i+4],studentScore[i+5],studentScore[i+6]);
			System.out.println(s1);
		}
		
		
		//student s1=new student(1,2,3,4,50,49,34);
		//System.out.println(s1);
//		for(i=0;i<studentScore.length;i++) {
//			System.out.println(studentScore[i]);
//		}
		
		
	}
}
