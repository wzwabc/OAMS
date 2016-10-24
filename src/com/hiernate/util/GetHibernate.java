package com.hiernate.util;          		//���ཨ��com.hibernate.util����
import org.hibernate.Session;       		//����org.hibernate.Session��
import org.hibernate.SessionFactory; 		//����org.hibernate.SessionFactory��
import org.hibernate.cfg.Configuration; 	//����org.hibernate.cfg.Configuration��

import com.hiernate.persistence.Bm;
import com.hiernate.persistence.Chuchai;
import com.hiernate.persistence.Meeting;
import com.hiernate.persistence.Menu;
import com.hiernate.persistence.Onduty;
import com.hiernate.persistence.Person;
import com.hiernate.persistence.Placard;
import com.hiernate.persistence.Qingjia;
import com.hiernate.persistence.Qiye;
import com.hiernate.persistence.Shenhe;
import com.hiernate.persistence.TongXunAdd;
import com.hiernate.persistence.Tongxun;
import com.hiernate.persistence.User;
import com.hiernate.persistence.Waichu;
public class GetHibernate {
	
	private static SessionFactory sf = null;//����SessionFactoryʵ��
	static {
		try {

			Configuration conf = new Configuration().configure();
			sf = conf.buildSessionFactory();
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//���Hibernate�������ļ�ΪXML��ʽ��ֻ���������ļ�������ӳ���ļ����ڳ����в��ص���Configuration
	//���addClass����������ӳ���ļ����������£�
	// SessionFactory sf = new Configuration()
	//                     .configure().buildSessionFactory()
   public Session openSession(){			//��SessionΪ����ֵ������Session����
	   Session session = sf.openSession();   //SessionFactory��openSession()�������Sessionʵ��
	   return session;
   }
   public void closeSession(Session session){  //�����ر�Session����������ΪSessionʵ��
	   if(session != null){                //close()�����ر�session
		   session.close();
	   }
   }
  }
