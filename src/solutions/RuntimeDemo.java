package solutions;

public class RuntimeDemo {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("������ ����� ������: " + rt.totalMemory());
		System.out.println("��������� ������: " + rt.freeMemory());
		double d[] = new double[10000];
		System.out.println("��������� ������ �����" + " ���������� �������: " + rt.freeMemory());
		// ������������� ��������
		ProcessBuilder pb = new ProcessBuilder("mspaint", "d:\\Italy\\DSC_0001.jpeg");

		try {
			pb.start(); // ������ mspaint.exe
		} catch (java.io.IOException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("��������� ������ ����� " + "������� mspaint.exe: " + rt.freeMemory());
		System.out.println("������ ������: " + pb.command());
	}

}
