package cn.java.serviceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import cn.java.common.ServerResponse;
import cn.java.entity.Category;
import cn.java.mapper.CategoryMapper;
import cn.java.service.CategoryService;
@Service("catergoryService")
public class CategoryImpl implements CategoryService {
	@Autowired
	CategoryMapper categoryMapper;
	@Override
	public ServerResponse addCategory(String categoryName, Integer parentId) {
		// TODO Auto-generated method stub
		if(parentId==null || StringUtils.isBlank(categoryName)){
            return ServerResponse.createByErrorMessage("添加品类参数错误");
        }

        Category category = new Category();
        category.setName(categoryName);
        category.setParentId(parentId);
        category.setStatus(true);//这个分类是可用的

        int rowCount = categoryMapper.insert(category);
        if(rowCount > 0){
            return ServerResponse.createBySuccess("添加品类成功");
        }
        return ServerResponse.createByErrorMessage("添加品类失败");
	}

	@Override
	public ServerResponse updateCategoryName(Integer categoryId, String categoryName) {
		// TODO Auto-generated method stub
		 if(categoryId == null || StringUtils.isBlank(categoryName)){
	            return ServerResponse.createByErrorMessage("更新品类参数错误");
	        }
	        Category category = new Category();
	        category.setCategoryId(categoryId);
	        category.setName(categoryName);

	        int rowCount = categoryMapper.updateByPrimaryKeySelective(category);
	        if(rowCount > 0){
	            return ServerResponse.createBySuccess("更新品类名字成功");
	        }
	        return ServerResponse.createByErrorMessage("更新品类名字失败");
	}

	@Override
	public ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId) {
		// TODO Auto-generated method stub
		 List<Category> categoryList = categoryMapper.selectCategoryChildrenByParentId(categoryId);
	        if(CollectionUtils.isEmpty(categoryList)){
	            System.out.println("未找到当前分类子分类");;
	        }
	        return ServerResponse.createBySuccess(categoryList);
	}

	@Override
	public ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId) {
		// TODO Auto-generated method stub
		Set<Category> categorySet =  new HashSet<Category>();
        findChildCategory(categorySet,categoryId);


        List<Integer> categoryIdList = new ArrayList<Integer>();
        if(categoryId != null){
            for(Category categoryItem : categorySet){
                categoryIdList.add(categoryItem.getCategoryId());
            }
        }
        return ServerResponse.createBySuccess(categoryIdList);
	}
    private Set<Category> findChildCategory(Set<Category> categorySet ,Integer categoryId){
        Category category = categoryMapper.selectByPrimaryKey(categoryId);
        if(category != null){
            categorySet.add(category);
        }
        //查找子节点,递归算法退出的条件
        List<Category> categoryList = categoryMapper.selectCategoryChildrenByParentId(categoryId);
        for(Category categoryItem : categoryList){
            findChildCategory(categorySet,categoryItem.getCategoryId());
        }
        return categorySet;
    }
}
