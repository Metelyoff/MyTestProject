package solutions;

public class Rector {
	// ������������������ ���������
	final int ID = (int) (Math.random() * 10);
	// �������������������� ���������
	final String NAME_RECTOR;

	public Rector() {
		// ������������� � ������������
		NAME_RECTOR = "������";// ������ ���� ���!!!
	}
	// {NAME_RECTOR = "�����";} // ������ ���� ���!!!

	public final void jobRector() {
		// ����������
		// ID = 100; //������!
	}

	public boolean checkRights(final int num) {
		// id = 1; //������!
		final int CODE = 72173394;
		if (CODE == num)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(new Rector().checkRights(72173394));
	}

}
