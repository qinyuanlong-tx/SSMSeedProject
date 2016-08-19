package com.github.izhangzhihao.SSMSeedProject.Test.TestUtils;

import com.github.izhangzhihao.SSMSeedProject.Config.Application;
import com.github.izhangzhihao.SSMSeedProject.Config.MyBatisConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
/*@ContextConfiguration(classes = {
        Application.class, MyBatisConfig.class, MyBatisMapperScannerConfig.class
})
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class
})*/
@SpringBootTest(classes = {
        Application.class , MyBatisConfig.class
})
public class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {

    protected MockMvc mockMvc;

    /*protected InternalResourceViewResolver viewResolver;

    public BaseTest() {
        viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
    }*/

    @Test
    public void NullTest() {
    }
}
