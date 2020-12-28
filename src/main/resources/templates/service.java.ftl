package ${package.Service};

import ${package.Entity}.${entity};
import ${superServiceClassPackage};

/**
 * @author ${author}
 * @description ${cfg.description} — 服务接口
 * @date ${date} ${cfg.time}
 */
<#if kotlin>
interface ${table.serviceName} : ${superServiceClass}<${entity}>
<#else>
public interface ${table.serviceName} extends ${superServiceClass}<${entity}> {

}
</#if>
