package ${config.java.package.service}.${table.prefix};

import ${config.java.package.base}.vo.${table.prefix}.${table.upperCamelName}VO;
import ${config.java.package.base}.dao.DaoRouter;
import ${config.java.package.base}.dao.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ${table.upperCamelName}Service {

    /**
     * 查询
     * @param params
     * @return
     */
    public ${table.upperCamelName}VO get(Map params){
        return this.daoRouter.queryForObject("${table.upperCamelName}.load${table.upperCamelName}",params);
    }

    /**
     * 查询
     * @param params
     * @return
     */
    public List<${table.upperCamelName}VO> query(Map params){
        return this.daoRouter.query("${table.upperCamelName}.load${table.upperCamelName}",params);
    }

    /**
     * 分页查询
     * @param pagination
     * @return
     */
    public List<${table.upperCamelName}VO> queryForPage(Pagination pagination) {
        return this.daoRouter.query("${table.upperCamelName}.load${table.upperCamelName}ForPage",pagination);
    }

    /**
     * 创建
     * @param ${table.lowerCamelName}VO
     * @return
     */
    public void create(${table.upperCamelName}VO ${table.lowerCamelName}VO) {
        this.daoRouter.insert("${table.upperCamelName}.insert${table.upperCamelName}", ${table.lowerCamelName}VO);
    }

    /**
     * 更新
     * @param ${table.lowerCamelName}VO
     * @return
     */
    public void update(${table.upperCamelName}VO ${table.lowerCamelName}VO) {
        this.daoRouter.update("${table.upperCamelName}.update${table.upperCamelName}", ${table.lowerCamelName}VO);
    }

    /**
     * 删除
     * @param ${table.lowerCamelName}VO
     * @return
     */
    public void delete(${table.upperCamelName}VO ${table.lowerCamelName}VO) {
        this.daoRouter.update("${table.upperCamelName}.delete${table.upperCamelName}", ${table.lowerCamelName}VO);
    }

    @Autowired
    private DaoRouter daoRouter;
}