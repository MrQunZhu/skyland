package com.clesun.web.skyland.api;

import com.clesun.web.skyland.dto.ResultEntity;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@RestController
@Api("信息(短信，邮件等)服务接口")

public class MessageApi extends BaseApi{

    /**
     *验证手机号是否已注册
     * @author lxq
     * @DATE 2017/9/11
     * @param phoneNum 手机号
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/resgisted/{phoneNum}",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    /*@ApiOperation(value = "验证手机号是否已注册", notes = "验证手机号是否注册接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phoneNum", value = "用户手机号", required = true,
                    paramType = "path", dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "success", response = ResultEntity.class)
    })*/
    public ResultEntity isRegister(@PathVariable("phoneNum") String phoneNum) throws Exception {
        return new ResultEntity(0,"手机号",phoneNum,0);
    }
}
