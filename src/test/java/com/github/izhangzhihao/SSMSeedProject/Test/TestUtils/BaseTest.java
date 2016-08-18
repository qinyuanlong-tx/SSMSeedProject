package com.github.izhangzhihao.SSMSeedProject.Test.TestUtils;

import com.github.izhangzhihao.SSMSeedProject.Config.Application;
import com.github.izhangzhihao.SSMSeedProject.Config.MyBatisConfig;
import com.github.izhangzhihao.SSMSeedProject.Config.MyBatisMapperScannerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {
        Application.class, MyBatisConfig.class, MyBatisMapperScannerConfig.class
})
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class
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
