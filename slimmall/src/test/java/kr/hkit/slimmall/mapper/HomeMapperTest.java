package kr.hkit.slimmall.mapper;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import kr.hkit.slimmall.controller.ProductVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring/context-*.xml", 
        "file:src/main/webapp/WEB-INF/config/springmvc/dispatcher-servlet.xml"})
@WebAppConfiguration
public class HomeMapperTest {

	@Autowired
	private HomeMapper homeMapper;
	
	@Test
	public void test() {
		int categoryIdx = 1;
		String keyword = "상품1";
		List<ProductVO> productVOs = homeMapper.selectProductVOs(categoryIdx, keyword);
		assertNotNull(productVOs);
	}
	
	
	
//	@Test
//	public void test2() {
//		String keyword = "상품1";
//		List<ProductVO> productVOs = homeMapper.selectProductVOs(keyword);
//		
//		assertNotNull(productVOs);
//		System.out.println("size " + productVOs.size());
//		
//		int categoryIdx = 5; // 각자 자신의 DB의 카테고리 검색하기.
//		
//		List<ProductVO> productVOs =
//				homeMapper.selectProductProductVOs(categoryIdx, keyword);
//		System.out.println("list size : " + productVOs.size());	
//	}

}
