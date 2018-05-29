package kr.hkit.slimmall.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import kr.hkit.slimmall.admin.controller.CategoryVO;

@Mapper
public interface AdminMapper {
	
	public List<MemberVO> selectMemberVOs(MemberVO memberVO);
	public int deleteMemberVO(MemberVO memberVO);
	public List<OrderVO> selectOrderVOs();
	public int insertProduct(
			@Param("name") String name, 
			@Param("description") String description, 
			@Param("price") int price, 
			@Param("qty") int qty, 
			@Param("categoryIdx") int categoryIdx, 
			@Param("imageName") String imageName
			);
	public List<CategoryVO> selectCategoryVOs();
	
	public List<ProductVO> selectProductVOs();
	
	public int insertMemberVO(MemberVO memberVO);
	
	
	public int insertAdminVO(AdminVO adminVO);
	public List<AdminVO> selectAdminVOs(AdminVO adminVO);
	public AdminVO selectAdminVO(AdminVO adminVO);
	public int updateAdminVO(AdminVO adminVO);
	public int deleteAdminVO(AdminVO adminVO);	
}
