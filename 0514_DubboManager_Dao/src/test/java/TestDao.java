import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.mapper.GoodsDAO;

public class TestDao {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("spring-dao.xml");
		GoodsDAO gd = context.getBean(GoodsDAO.class);
		int count = gd.getGoodsCount();
   System.out.println("×ÜÊý£º"+count);
	}

}
