package icehs.science.workshop3.book;



public class BookArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(">>> ���� ���");
		Book[] books = {
				new Book("���� �Ƿ��� ����", "���׳�"),
				new Book("�̰��� �۾���", "��Ű ���ν�"),
				new Book("1111111111111", "�α��� ã�Ƽ�", "��ȿ��", 19500),
				new Book("9788964150719", "�ι��� ���� ����", "������", 14800),
				new Book("2222222222222", "ȥ�ڰ� �Ǵ� å��", "�ֿ�ȣ", 15000, "2016�� 02�� 29��"),
				new Book("3333333333333", "���� ������ �ູ", "����", 14000, "2016�� 01�� 25��"),
				new Book("4444444444444", "�Ϲ��� ���� 4�� ��", "���̽���", 14000, "2014�� 12�� 29��")
		};
		
		System.out.println("");
		System.out.println(">>> ������ 15000�� ������ ���� ã��");
		for(int i = 0 ; i < books.length ; i++) {
			if(books[i].getPrice() <= 15000 && books[i].getPrice() != 0) {
				books[i].printBookInfo();
			}
		}
		
		System.out.println("");
		System.out.println("ISBN ��ȣ�� 9788964150719�� ���� �����ϱ�");
		for(int i = 0 ; i < books.length ; i++) {
			if(books[i].getIsbn() == "9788964150719") {
				books[i].printBookInfo();
			}
		}
	}

}
