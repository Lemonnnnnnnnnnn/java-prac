package interfaceDemo;

// �ӿڿɿ�������ĳ�����
// ������ķ�������Ҫ��ʵ��
// д��дpublic abstract Ч����һ��
// �ӿ�û��ʵ������,�������о�̬����
interface Person {
//	public static final String aString = "123";
	String a = "123";
	default void run() { // Ĭ�Ϸ���
		System.out.println(getName() + " run");
	}

	String getName();
}
