package com.lmj.test;

public class Dome1 {

	
	public void test1(){
		//��ӡ20��
		   for (int i = 0; i <20; i++) {
			System.out.println("i="+i);
			//��ӡһ������һ��
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("�߳��쳣");
			}
		}
	}
	/**
	 * �߳���Ϣ
	 */
	public void test2(){
		//�߳�����
		String name = Thread.currentThread().getName();
		System.out.println("name="+name);
		//�߳�id
		long id =Thread.currentThread().getId();
		System.out.println("id="+id);
	}
	/**
	 * ���߳����г���
	 */
	
	public void test3(){
		
		/**
		 * ��ʱ����1
		 */
		int countc=100;
		int i=0;
		while (i<countc) {
		  
			String name =Thread.currentThread().getName();
			
			System.out.println(name+"�߳�i="+i);
			
			i++;
		}
		
	}
	/**
	 * ��ʱ�߳�2
	 */
	public void test4(){
		int countc = 100;
		int j = 0 ;
		while (j<=countc) {
			String name = Thread.currentThread().getName();
			System.out.println(name+"���߳�j="+j);
			j++;
		}
	}
	
	
}










