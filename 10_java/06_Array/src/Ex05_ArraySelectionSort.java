import java.util.Arrays;

public class Ex05_ArraySelectionSort {

	public static void main(String[] args) {
		// �迭�� ����� ���� ����(�������� : ASC)
		// 30, 20, 50, 40, 10 
		int[] num = {30, 20, 50, 40, 10};
		
		//������ Ȯ��
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();	
		
		System.out.print("���������� : ");
		printData(num); //�޼ҵ� ȣ���ؼ� �迭 ������ Ȯ��
		
		System.out.println("--- ���� ���� ---");
		
//		//ù��° �� �������� ���۾�(�ε��� 0 - �ε��� 1)
//		if (num[0] > num[1]) {
//			int temp = num[0]; //ù��° ������ ���
//			num[0] = num[1]; //����(0�� �ε��� <-> 1�� �ε�����)
//			num[1] = temp; //��� ������ ����
//		}
//		printData(num);
//		
//		//ù��° �� �������� ������ ���� ���۾�(�ε���0 - �ε���2)
//		if (num[0] > num[2]) {
//			int temp = num[0];
//			num[0] = num[2];
//			num[2] = temp;
//		}
//		printData(num);
//		
//		//ù��° �� �������� �׹��� ���� ���۾�(�ε���0 - �ε���3)
//			if (num[0] > num[3]) {
//				int temp = num[0];
//				num[0] = num[3];
//				num[3] = temp;
//			}
//			printData(num);
//			
//		//ù��° �� �������� �ټ����� ���� ���۾�(�ε���0 - �ε���4)
//		if (num[0] > num[4]) {
//			int temp = num[0];
//			num[0] = num[4];
//			num[4] = temp;
//		}
//		printData(num);
		
/*		System.out.println(">> �ݺ������� ��ȯ ��");
		//ù��° ���� ���� - �ݺ������� ��ȯ(���ذ� �ε��� 0��)
		for (int i = 1; i <= 4; i++) {
			if (num[0] > num[i]) {
				int temp = num[0];
				num[0] = num[i];
				num[i] = temp;
			}
			printData(num);
		}
		
		System.out.println("--- �ε��� 1�� ---");
		//�ι�° ���� ���� - �ݺ������� ��ȯ(���ذ� �ε��� 1��)
		for (int i = 2; i <= 4; i++) {
			if (num[1] > num[i]) {
				int temp = num[1];
				num[1] = num[i];
				num[i] = temp;
			}
			printData(num);
		}		

		System.out.println("--- �ε��� 2�� ---");
		//����° ���� ���� - �ݺ������� ��ȯ(���ذ� �ε��� 2��)
		for (int i = 3; i <= 4; i++) {
			if (num[2] > num[i]) {
				int temp = num[2];
				num[2] = num[i];
				num[i] = temp;
			}
			printData(num);
		}		
	
		System.out.println("--- �ε��� 3�� ---");
		//�׹�° ���� ���� - �ݺ������� ��ȯ(���ذ� �ε��� 3��)
		for (int i = 4; i <= 4; i++) {
			if (num[3] > num[i]) {
				int temp = num[3];
				num[3] = num[i];
				num[i] = temp;
			}
			printData(num);
		}	
*/
		System.out.println("======= ���� for������ ���� ======");
		//���ذ��� 0 ~ 3 ���� ���ϸ鼭 
		for (int gijun = 0; gijun < 4; gijun++) {
			for (int i = gijun + 1; i <= 4; i++) {
				if (num[gijun] > num[i]) {
					int temp = num[gijun];
					num[gijun] = num[i];
					num[i] = temp;
				}				
			}
			printData(num);
		}
		
		System.out.print("���ĿϷ��� : ");
		printData(num);
		
		System.out.println("==== �������� ���� �Ϲ�ȭ ====");
		int[] nums = {30, 20, 50, 40, 10};
		System.out.println("�迭ũ��(length) : " + nums.length);
		System.out.print("������ : ");
		printData(nums);
		
		for (int gijun = 0; gijun < nums.length - 1; gijun++) {
			for (int i = gijun + 1; i < nums.length; i++) {
				if (nums[gijun] > nums[i]) {
					int temp = nums[gijun];
					nums[gijun] = nums[i];
					nums[i] = temp;
				}				
			}
			printData(nums);
		}
		
		System.out.print("������ : ");
		printData(nums);
		
		System.out.println("============================");
		int[] arr = {30, 20, 50, 40, 10};
		System.out.println("������ : ");
		printData(arr);
		
		Arrays.sort(arr);
		System.out.println("������ : ");
		printData(arr);
	}
	
	static void printData(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}