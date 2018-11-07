package dao;

import com.bean.en.ApplicationEnum;
import com.dao.ApplicationDao;
import com.dao.po.ApplicationPo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Ash
 * @date 2018/6/26 12:45
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring/spring-service.xml")
public class ProjectTest {

    @Autowired
    ApplicationDao applicationDao;
    

    @Test
    public void ProjectStaffinsert(){
       ApplicationPo applicationPo=new ApplicationPo();
       applicationPo.setId(1);
       applicationPo.setStatus(ApplicationEnum.REJECTED);
       applicationDao.update(applicationPo);
    }
}
