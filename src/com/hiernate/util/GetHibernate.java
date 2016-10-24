package com.hiernate.util;          		//将类建在com.hibernate.util包下
import org.hibernate.Session;       		//导入org.hibernate.Session类
import org.hibernate.SessionFactory; 		//导入org.hibernate.SessionFactory类
import org.hibernate.cfg.Configuration; 	//导入org.hibernate.cfg.Configuration类

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
	
	private static SessionFactory sf = null;//创建SessionFactory实例
	static {
		try {

			Configuration conf = new Configuration().configure();
			sf = conf.buildSessionFactory();
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//如果Hibernate的配置文件为XML格式，只需在配置文件中声明映射文件，在程序中不必调用Configuration
	//类的addClass方法来加载映射文件．代码如下：
	// SessionFactory sf = new Configuration()
	//                     .configure().buildSessionFactory()
   public Session openSession(){			//以Session为返回值创建打开Session方法
	   Session session = sf.openSession();   //SessionFactory的openSession()方法获得Session实例
	   return session;
   }
   public void closeSession(Session session){  //创建关闭Session方法，参数为Session实例
	   if(session != null){                //close()方法关闭session
		   session.close();
	   }
   }
  }
