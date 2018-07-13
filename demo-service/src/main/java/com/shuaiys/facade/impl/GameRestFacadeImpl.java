package com.shuaiys.facade.impl;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.shuaiys.facade.GameRestFacade;
import com.shuaiys.service.GameCarService;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author shuaiys
 * @Package ${package_name}
 * @Description:   Restful 接口
 * @date 2018/7/13  14:28
 */
@Path("demo/car/")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8, ContentType.TEXT_PLAIN_UTF_8})
public class GameRestFacadeImpl implements GameRestFacade {

    @Resource
    private GameCarService carService;

    @Path("/car")
    @POST
    public void Test(){
        carService.getById(12l);
    }
}
