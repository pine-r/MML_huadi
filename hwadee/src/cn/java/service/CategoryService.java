package cn.java.service;

import java.util.List;

import cn.java.common.ServerResponse;
import cn.java.entity.Category;

public interface CategoryService {

	ServerResponse addCategory(String categoryName, Integer parentId); //添加目录

	ServerResponse updateCategoryName(Integer categoryId, String categoryName); //更新目录名

	ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId); //得到子类平级目录

	ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);//得到所有子类目录

}
